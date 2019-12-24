# :books: [Palindrome Number](https://leetcode.com/problems/palindrome-number/)

### :star: Question

- Determine whether an integer is a palindrome.
- An integer is a palindrome when it reads the same backward as forward.

---

### :car: Example

- Input: 121
- Output: true

- Input: -121
- Output: false
- Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

- Input: 10
- Output: false
- Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || (x > 0 && x % 10 == 0))
            return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
```

- Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
- Memory Usage: 35.9 MB, less than 36.63% of Java online submissions for Palindrome Number.

---

### :pencil: Explanation

Convert to string will need memory and reverse whole integer may cause overflow, So just reverse half integer

---

### :pen: Author

YIMING DAI - 2019.06.23
