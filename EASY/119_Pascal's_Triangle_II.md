# :books: [Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/)

### :star: Question

- Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
- Note that the row index starts from 0.

--- 

### :car: Example

- Input: 3
- Output: [1,3,3,1]

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
        }
        return row;
    }
}
```

- Runtime: 1 ms, faster than 88.95% of Java online submissions for Pascal's Triangle II.
- Memory Usage: 33.5 MB, less than 5.06% of Java online submissions for Pascal's Triangle II.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(rowIndex)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.10
