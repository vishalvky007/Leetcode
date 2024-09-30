class CustomStack {

    int maxSize = 0;
    int currSize = 0;
    int[] stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }
    
    public void push(int x) {
        // overflow
        if(currSize == maxSize) return;    

        stack[currSize] = x;
        currSize++;
    }
    
    public int pop() {
        // underflow
        if(currSize == 0) {
            return -1;
        }

        int top = stack[--currSize];
        return top; 
    }
    
    public void increment(int k, int val) {
        for(int i=0; i < Math.min(k,maxSize); i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */