# :books: [Hamming Distance](https://leetcode.com/problems/hamming-distance/)

### :star: Question

- The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
- Given two integers x and y, calculate the Hamming distance.

--- 

### :car: Example
```
Input: x = 1, y = 4
Output: 2
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
- Memory Usage: 33 MB, less than 5.09% of Java online submissions for Hamming Distance.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(1)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.25
