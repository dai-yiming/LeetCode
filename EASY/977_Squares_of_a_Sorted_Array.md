# :books: [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

### :star: Question

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

--- 

### :car: Example

- Input: [-4,-1,0,3,10]
- Output: [0,1,9,16,100]

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
- Memory Usage: 40.2 MB, less than 98.17% of Java online submissions for Squares of a Sorted Array.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(N)

---

### :pen: Author

YIMING DAI - 2019.12.12
