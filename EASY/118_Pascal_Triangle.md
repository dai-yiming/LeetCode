# :books: [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

### :star: Question

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

--- 

### :car: Example
```
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;

    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
- Memory Usage: 33.8 MB, less than 5.00% of Java online submissions for Pascal's Triangle.

---

### :pencil: Explanation

Row is reused from last line!

---

### :computer: Complexity Analysis:

- Time complexity: O(numRows)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.04
