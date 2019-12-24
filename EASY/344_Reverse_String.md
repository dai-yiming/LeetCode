# :books: [Reverse String](https://leetcode.com/problems/reverse-string/)

### :star: Question

- Write a function that reverses a string. The input string is given as an array of characters char[].
- Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
- You may assume all the characters consist of printable ascii characters.

--- 

### :car: Example
```
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
- Memory Usage: 52.3 MB, less than 12.96% of Java online submissions for Reverse String.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.13
