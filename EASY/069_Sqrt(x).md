# :books: [Sqrt(x)](https://leetcode.com/problems/sqrtx/)

### :star: Question

- Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
- Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

---

### :car: Example
```
Input: 4
Output: 2

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int mySqrt(int n) {
        if (n == 0)
            return 0;
        double res = 1, pre = 0;
        while (Math.abs(res - pre) > 1e-6) {
            pre = res;
            res = (res + n / res) / 2;
        }
        return (int) res;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Sqrt(x).
- Memory Usage: 33.6 MB, less than 21.63% of Java online submissions for Sqrt(x).

---

### :pencil: Explanation

Newton Method Conversion

---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.27
