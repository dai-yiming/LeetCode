# :books: [Big Countries](https://leetcode.com/problems/big-countries/)

### :star: Question

There is a table World
```
+-----------------+------------+------------+--------------+---------------+
| name            | continent  | area       | population   | gdp           |
+-----------------+------------+------------+--------------+---------------+
| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
| Albania         | Europe     | 28748      | 2831741      | 12960000      |
| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
| Andorra         | Europe     | 468        | 78115        | 3712000       |
| Angola          | Africa     | 1246700    | 20609294     | 100990000     |
+-----------------+------------+------------+--------------+---------------+
```
A country is big if it has an area of bigger than 3 million square km or a population of more than 25 million.

Write a SQL solution to output big countries' name, population and area.

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: SQL Version - 1

```sql
SELECT
    name, population, area
FROM
    world
WHERE
    area > 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
    population > 25000000
;
```

- Runtime: 464 ms, faster than 12.08% of MySQL online submissions for Big Countries.
- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Big Countries.

#### :coffee: SQL Version - 2

```sql
SELECT name, population, area FROM World
WHERE area > 3000000 OR population > 25000000
;
```

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: Zero Bit

---

### :pen: Author

YIMING DAI - 2019.12.06
