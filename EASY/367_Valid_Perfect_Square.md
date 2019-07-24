# :books: [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)

### :star: Question

Given a positive integer num, write a function which returns True if num is a perfect square else False.

--- 

### :car: Example

Input: 16
Output: true

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        if (num < 1) return false;
        long t = num / 2;
        while (t * t > num) {
        t = (t + num / t) / 2;
        }
        return t * t == num;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
- Memory Usage: 32.7 MB, less than 5.26% of Java online submissions for Valid Perfect Square.


---

### :pencil: Explanation

Newton's Method

---

### :computer: Complexity Analysis:

- Time complexity: O(log(n))
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.23
