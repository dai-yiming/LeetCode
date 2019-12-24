# :books: [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

### :star: Question

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

--- 

### :car: Example
```
s = "loveleetcode"
return 2
```
---

### :hammer: Code

#### :coffee: Java Version - 1 - HashMap

```java
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}
```

- Runtime: 42 ms, faster than 28.44% of Java online submissions for First Unique Character in a String.
- Memory Usage: 38.2 MB, less than 97.44% of Java online submissions for First Unique Character in a String.

#### :coffee: Java Version - 2

```java
class Solution {
    // Using indexOf and lastIndexOf
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;
        
        for (char c = 'a' ; c <= 'z'; c++) {
            int i = s.indexOf(c);
            int j = s.lastIndexOf(c);
            
            if(i == j && i != -1 && i < min)
                min = i;
        }
        
        if (min == Integer.MAX_VALUE) return -1;
        
        return min;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for First Unique Character in a String.
- Memory Usage: 37.5 MB, less than 99.22% of Java online submissions for First Unique Character in a String.

---

### :pencil: [Explanation](https://leetcode.com/problems/first-unique-character-in-a-string/solution/)



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n) / O(1)

---

### :pen: Author

YIMING DAI - 2019.07.16
