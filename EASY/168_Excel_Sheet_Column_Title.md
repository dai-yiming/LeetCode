# :books: [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/)

### :star: Question

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

--- 

### :car: Example

- Input: 28
- Output: "AB"

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            n--;
            res.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return res.toString();
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
- Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Excel Sheet Column Title.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.18
