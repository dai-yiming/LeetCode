# :books: [Combine Two Tables](https://leetcode.com/problems/combine-two-tables/)

### :star: Question

Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address
ON Person.PersonId = Address.PersonId
```

- Runtime: 1146 ms, faster than 27.20% of MS SQL Server online submissions for Combine Two Tables.
- Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Combine Two Tables.

---

### :pencil: Explanation

Using `outer join` Method
- Considering there might not be an address information for every person, we should use outer join instead of the default inner join
- Using where clause to filter the records will fail if there is no address information for a person because it will not display the name information.

---

### :computer: Complexity Analysis

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.11.26
