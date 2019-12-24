# :books: [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

### :star: Question

- Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
- Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

--- 

### :car: Example
```
Input:
s: "cbaebabacd" p: "abc"
Output:
[0, 6]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.ArrayList;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0 || p.length() > s.length()) {
            return res;
        }
        int[] chars = new int[26];
        for (Character c : p.toCharArray()) { // Note type 'Character'
            // Increment to setup hash of all characters currently in the window
            // Later on, these get DECREMENTED when a character is found
            // A positive count later on means that the character is still "needed" in the anagram
            // A negative count means that either the character was found more times than necessary
            // Or that it isn't needed at all
            chars[c - 'a']++;
        }
        // Set up counters
        int start = 0, end = 0;
        int len = p.length();
        int dif = len;
        char temp;
        // Traverse first 'len' in 's', and 'end' will be located to 'len - 1'
        for (; end < len; end++) {
            temp = s.charAt(end);
            chars[temp - 'a']--;
            if (chars[temp - 'a'] >= 0) {
                dif--;
            }
        }
        // All letters match in first interval (window)
        if (dif == 0) {
            res.add(0);
        }
        // Start move intervals (window) backwards
        while (end < s.length()) {
            temp = s.charAt(start);
            // Manipulate first elements in near-removed interval
            if (chars[temp - 'a'] >= 0) {
                dif++;
            }
            chars[temp - 'a']++;
            // Manipulate last element in new interval
            temp = s.charAt(end);
            chars[temp - 'a']--;
            if (chars[temp - 'a'] >= 0) {
                dif--;
            }
            // Move both counters
            start++;
            end++;
            // All letters match in current interval (window)
            if (dif == 0) {
                res.add(start);
            }
        }
        return res;
    }
}
```

- Runtime: 6 ms, faster than 93.36% of Java online submissions for Find All Anagrams in a String.
- Memory Usage: 37.7 MB, less than 99.74% of Java online submissions for Find All Anagrams in a String.

---

### :pencil: Explanation

Window Slicing Algorithm

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.05
