# :books: [Duplicate Emails](https://leetcode.com/problems/duplicate-emails/)

### :star: Question

Write a SQL query to find all duplicate emails in a table named Person.

```
+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
```

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
# Write your MySQL query statement below
SELECT Email FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1
```

- Runtime: 484 ms, faster than 18.96% of MySQL online submissions for Duplicate Emails.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.11.29
