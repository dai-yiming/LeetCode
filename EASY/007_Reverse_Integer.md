# :books: [Reverse Integer](https://leetcode.com/problems/reverse-integer/)

### :star: Question

Given a 32-bit signed integer, reverse digits of an integer.

---

### :car: Example

- Input: 123
- Output: 321
- Input: 120
- Output: 21
- Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int reverse(int x) {

        if (x == 0) {
            return 0; Case 1: x == 0
        }

        int res = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x *= sign; Case 2: Manipulate sign
        }

        while (x > 0) {
            int digit = x % 10; Last digit
            x /= 10;
            Test overflow below (max_int = 2147483647 || min_int = -2147483648)
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            res = res * 10 + digit;
        }
        Note to change sign in demand
        return res * sign;
    }
}
```
---

### :pen: Author

YIMING DAI - 2019.06.23
