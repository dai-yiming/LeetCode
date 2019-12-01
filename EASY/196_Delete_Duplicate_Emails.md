# :books: [Delete Duplicate Emails](https://leetcode.com/problems/delete-duplicate-emails/)

### :star: Question

Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.
```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
```
Id is the primary key column for this table.

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
DELETE p1 FROM Person p1,
    Person p2
WHERE
    p1.Email = p2.Email AND p1.Id > p2.Id
```

- Runtime: 1250 ms, faster than 19.57% of MySQL online submissions for Delete Duplicate Emails.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Delete Duplicate Emails.

---

### :pencil: Explanation

- Joining this table with itself on the Email column
- Find the bigger id having same email address with other records

---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.11.30
