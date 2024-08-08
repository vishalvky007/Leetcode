/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // 7 13 11 10 1
        // n  7  1 11 7
        // 0 
        Node head2 = new Node(0);
        Node temp1 = head;
        Node temp2 = head2;
        
        // creating deep copy - 7 13 11 10 1
        while(temp1!=null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next; 
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // alternate connections
        Node temp = new Node(-1);
        while(temp1!=null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        temp1 = head;
        temp2 = head2;

        // assigning random pointer
        while(temp1!=null) {
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp1!=null)
                temp2 = temp1.next;
        }

        temp1 = head;
        temp2 = head2;

        // separating the list
        while(temp1!=null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1==null) break;
            temp2.next = temp1.next;
            if(temp2.next==null) break;
            temp2 = temp2.next;
        }

        return head2;
    }
}