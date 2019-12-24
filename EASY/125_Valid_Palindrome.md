# :books: [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

### :star: Question

- Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
- Note: For the purpose of this problem, we define empty string as valid palindrome.

---

### :car: Example

- Input: "A man, a plan, a canal: Panama"
- Output: true

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !valid(s.charAt(i)))
                i++;
            while (i < j && !valid(s.charAt(j)))
                j--;
            if (!match(s.charAt(i), s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }

    private boolean match(char c1, char c2) {
        if (c1 >= 'A' && c1 <= 'Z')
            c1 = (char) (c1 - 'A' + 'a');
        if (c2 >= 'A' && c2 <= 'Z')
            c2 = (char) (c2 - 'A' + 'a');
        return c1 == c2;
    }

    private boolean valid(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
            return true;
        return false;
    }
}

// Gorgeous but expensive
public class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
```

- Runtime: 2 ms, faster than 99.27% of Java online submissions for Valid Palindrome.
- Memory Usage: 37.9 MB, less than 80.09% of Java online submissions for Valid Palindrome.

---

### :pencil: Explanation

Two pointer from front and back to match

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.27
