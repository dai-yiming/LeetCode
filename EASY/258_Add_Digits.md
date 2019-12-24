# :books: [Add Digits](https://leetcode.com/problems/add-digits/)

### :star: Question

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

--- 

### :car: Example
```
Input: 38
Output: 2 
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    public int addDigits(int num) {
        return (num == 0) ? 0 : 1 + (num - 1) % 9;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
- Memory Usage: 33.4 MB, less than 5.01% of Java online submissions for Add Digits.

---

### :pencil: Explanation

- dr(n) = 1 + (n - 1) % 9
- When n = 0, since (n - 1) % 9 = -1, the return value is zero
- input: 0 1 2 3 4 ...
- output: 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 ...

---

### :computer: Complexity Analysis:

- Time complexity: O(1)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.07
