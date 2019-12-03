# :books: [Second Highest Salary](https://leetcode.com/problems/second-highest-salary/

### :star: Question

Write a SQL query to get the second highest salary from the Employee table.
```
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
```
For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: Java Version - 1

```sql
# Write your MySQL query statement below
SELECT
    IFNULL(
        (
        SELECT DISTINCT Salary
        FROM Employee
        ORDER BY Salary DESC
        LIMIT 1 OFFSET 1
        ), NULL
    ) AS SecondHighestSalary
```

- Runtime: 353 ms, faster than 14.52% of MySQL online submissions for Second Highest Salary.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.03
