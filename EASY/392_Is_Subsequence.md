# :books: [Is Subsequence](https://leetcode.com/problems/is-subsequence/)

### :star: Question

- Given a string s and a string t, check if s is subsequence of t.
- You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
- A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

--- 

### :car: Example

s = "abc", t = "ahbgdc" returns true

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }
}
```

- Runtime: 14 ms, faster than 66.17% of Java online submissions for Is Subsequence.
- Memory Usage: 49.4 MB, less than 100.00% of Java online submissions for Is Subsequence.


---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.13
