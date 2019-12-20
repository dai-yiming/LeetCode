# :books: [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

### :star: Question

- Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
- To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
- To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

--- 

### :car: Example

- Input: [[1,1,0],[1,0,1],[0,0,0]]
- Output: [[1,0,0],[0,1,0],[1,1,1]]

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (len + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[len - i - 1] ^ 1;
                row[len - i - 1] = tmp;
            }
        }
        return A;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
- Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Flipping an Image.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.20
