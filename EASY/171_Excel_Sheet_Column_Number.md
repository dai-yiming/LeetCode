# :books: [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)

### :star: Question

Given a column title as appear in an Excel sheet, return its corresponding column number.

--- 

### :car: Example

- Input: "AB"
- Output: 28

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
          result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
```

Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.17
