# Write your MySQL query statement below
SELECT e1.name
FROM Employee e1 
INNER JOIN Employee e2
WHERE e1.id = e2.managerId
GROUP BY e2.managerId
HAVING count(e2.managerId) >=5;