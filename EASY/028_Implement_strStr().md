# :books: [Implement strStr()](https://leetcode.com/problems/implement-strstr/)

### :star: Question

- Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
- For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

---

### :car: Example

- Input: haystack = "hello", needle = "ll"
- Output: 2

- Input: haystack = "aaaaa", needle = "bba"
- Output: -1

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        int L = needle.length();
        for (int i = 0; i <= haystack.length() - L; i++)
            if (haystack.substring(i, i + L).equals(needle))
                return i;
        return -1;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
- Memory Usage: 37.3 MB, less than 93.76% of Java online submissions for Implement strStr().

---

### :pen: Author

YIMING DAI - 2019.06.26
