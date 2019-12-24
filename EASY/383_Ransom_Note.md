# :books: [Ransom Note](https://leetcode.com/problems/ransom-note/)

### :star: Question

- Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
- Each letter in the magazine string can only be used once in your ransom note.

--- 

### :car: Example
```
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || ransomNote.length() == 0) return true;
        if(magazine == null || magazine.length() == 0) return false;

        int overallCount = 0;
        int[] letterCount = new int[26];
        for(char c : ransomNote.toCharArray()) {
            letterCount[(int)(c - 'a')]++;
            overallCount++;
        }

        for(char c : magazine.toCharArray()) {
            if(overallCount == 0) return true;

            if(letterCount[(int)c - 'a'] > 0) {
                letterCount[(int)c - 'a']--;
                overallCount--;
            }
        }

        return overallCount == 0;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Ransom Note.
- Memory Usage: 37.7 MB, less than 99.58% of Java online submissions for Ransom Note.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(m+n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.22
