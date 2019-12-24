# :books: [String Compression](https://leetcode.com/problems/string-compression/)

### :star: Question

- Given an array of characters, compress it in-place.
- The length after compression must always be smaller than or equal to the original array.
- Every element of the array should be a character (not int) of length 1.



--- 

### :car: Example
```
Input:
["a","a","b","b","c","c","c"]
Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int compress(char[] chars) {
        int anchor = 0, read = 0;
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }
            chars[anchor++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[anchor++] = c;
                }
            }
        }
        return anchor;
    }
}
```

- Runtime: 1 ms, faster than 96.66% of Java online submissions for String Compression.
- Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for String Compression.

---

### :pencil: Explanation

- We will use separate pointers read and write to mark where we are reading and writing from. Both operations will be done left to right alternately: we will read a contiguous group of characters, then write the compressed version to the array. At the end, the position of the write head will be the length of the answer that was written.
- When we are at the end of a group, we will write the result of that group down using our write head. chars[anchor] will be the correct character, and the length (if greater than 1) will be read - anchor + 1. We will write the digits of that number to the array.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.13
