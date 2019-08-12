# :books: [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

### :star: Question

- Write a function to find the longest common prefix string amongst an array of strings.
- If there is no common prefix, return an empty string "".

--- 

### :car: Example

Input: ["flower","flow","flight"]
Output: "fl"

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
}
```

- Runtime: 1 ms, faster than 73.99% of Java online submissions for Longest Common Prefix.
- Memory Usage: 37.7 MB, less than 81.82% of Java online submissions for Longest Common Prefix.

#### :coffee: Java Version - 2

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix=strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        if(prefix.isEmpty())
            return "";
        return prefix;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
- Memory Usage: 37.6 MB, less than 84.91% of Java online submissions for Longest Common Prefix.

---

### :pencil: Explanation

Compare characters from top to bottom on the same column (same character index of the strings) before moving on to the next column.

---

### :computer: Complexity Analysis:

- Time complexity: O(s) where S is the sum of all characters in all strings.
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.03
