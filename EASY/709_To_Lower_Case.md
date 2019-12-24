# :books: [To Lower Case](https://leetcode.com/problems/to-lower-case/)

### :star: Question

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

--- 

### :car: Example
```
Input: "Hello"
Output: "hello"
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
- Memory Usage: 34.4 MB, less than 98.70% of Java online submissions for To Lower Case.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.19
