# :books: [Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/)

### :star: Question

Suppose that a website contains two tables, the `Customers` table and the `Orders` table. Write a SQL query to find all customers who never order anything.

Table: `Customers`
```
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
```
Table: `Orders`
```
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
```
--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
SELECT Customers.Name as 'Customers'
FROM Customers
WHERE Customers.Id NOT IN
(
    SELECT CustomerId FROM Orders
)
```

- Runtime: 668 ms, faster than 18.07% of MySQL online submissions for Customers Who Never Order.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customers Who Never Order.

#### :coffee: SQL Version - 2

```sql
SELECT Name AS 'Customers'
FROM Customers LEFT JOIN Orders
ON Orders.CustomerId = Customers.Id
WHERE Orders.CustomerId IS NULL
```

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.01
