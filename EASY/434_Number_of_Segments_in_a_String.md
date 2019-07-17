# :books: [Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/)

### :star: Question

- Count the number of segments in a string
- A segment is defined to be a contiguous sequence of non-space characters.

--- 

### :car: Example

Input: "Hello, my name is John"
Output: 5

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
```

- Runtime: 2 ms, faster than 36.38% of Java online submissions for Number of Segments in a String.
- Memory Usage: 34.3 MB, less than 99.36% of Java online submissions for Number of Segments in a String.

#### :coffee: Java Version - 2

```java
class Solution {
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
- Memory Usage: 33.9 MB, less than 99.36% of Java online submissions for Number of Segments in a String.

---

### :pencil: [Explanation](https://leetcode.com/problems/number-of-segments-in-a-string/solution/)



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n) / O(1)

---

### :pen: Author

YIMING DAI - 2019.07.18
