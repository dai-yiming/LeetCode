# :books: [Word Pattern](https://leetcode.com/problems/word-pattern/)

### :star: Question

Given a pattern and a string str, find if str follows the same pattern.

--- 

### :car: Example
```
Input: pattern = "abba", str = "dog cat cat dog"
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; i++) {
            if (index.put(words[i], i) != index.put(pattern.charAt(i), i))
                return false;
        }
        return true;
    }
}
```

- Runtime: 1 ms, faster than 99.60% of Java online submissions for Word Pattern.
- Memory Usage: 33.9 MB, less than 99.55% of Java online submissions for Word Pattern.

---

### :pencil: Explanation

- Go through the pattern letters and words in parallel and compare the indexes where they last appeared.
- `Hash_Map.put(key, value)` => If an existing key is passed then the previous value gets returned. If a new pair is passed, then NULL is returned.
- Switch from `int` to the current version with i being an `Integer` object, which allows to compare with just != because there's no autoboxing-same-value-to-different-objects-problem anymore.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.11
