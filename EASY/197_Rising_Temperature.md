# :books: [](https://leetcode.com/problems/rising-temperature/)

### :star: Question

Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
```
+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
```
--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
SELECT Weather.Id AS 'Id'
FROM Weather
JOIN Weather w
ON DATEDIFF(Weather.RecordDate, w.RecordDate) = 1
AND Weather.Temperature > w.Temperature
```

- Runtime: 400 ms, faster than 35.92% of MySQL online submissions for Rising Temperature.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rising Temperature.

---

### :pencil: Explanation

- MySQL uses DATEDIFF to compare two date type values.

---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.02
