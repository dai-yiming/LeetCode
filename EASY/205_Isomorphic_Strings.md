# :books: [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

### :star: Question

- Given two strings s and t, determine if they are isomorphic.
- Two strings are isomorphic if the characters in s can be replaced to get t.
- All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

--- 

### :car: Example
```
Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                if (t.charAt(i) != hash.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (hash.containsValue(t.charAt(i))) {
                    return false;
                }
                hash.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
```

#### :coffee: Java Version - 2

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int x = 0; x < s.length(); x++){
            if(s.lastIndexOf(s.charAt(x)) != t.lastIndexOf(t.charAt(x)))
                return false;
        }
        return true;
    }
}
```

- Method 1
  - Runtime: 9 ms, faster than 63.24% of Java online submissions for Isomorphic Strings.
  - Memory Usage: 36.1 MB, less than 97.69% of Java online submissions for Isomorphic Strings.
- Method 2
  - Runtime: 3 ms, faster than 95.71% of Java online submissions for Isomorphic Strings.
  - Memory Usage: 36.2 MB, less than 97.51% of Java online submissions for Isomorphic Strings.

---

### :pencil: Explanation

Check order and corresponding chars in two strings

---

### :computer: Complexity Analysis:

- Method 1
  - Time complexity: O(n)
  - Space complexity: O(d)
- Method 2
  - Time complexity: O(n)
  - Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.02
