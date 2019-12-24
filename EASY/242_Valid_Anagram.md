# :books: [Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### :star: Question

Given two strings s and t , write a function to determine if t is an anagram of s. (each letter same occurance)

--- 

### :car: Example
```
Input: s = "anagram", t = "nagaram"
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
```

- Runtime: 4 ms, faster than 78.46% of Java online submissions for Valid Anagram.
- Memory Usage: 36.1 MB, less than 99.51% of Java online submissions for Valid Anagram.

#### :coffee: Java Version - 2

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letterCounts = new int[256];
        for (char c: s.toCharArray()) {
            letterCounts[c]++;
        }
        for (char c: t.toCharArray()) {
            letterCounts[c]--;
            if (letterCounts[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
```

- Runtime: 2 ms, faster than 99.78% of Java online submissions for Valid Anagram.
- Memory Usage: 36.3 MB, less than 99.48% of Java online submissions for Valid Anagram.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.04
