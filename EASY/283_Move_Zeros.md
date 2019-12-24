# :books: [Move Zeros](https://leetcode.com/problems/move-zeroes/)

### :star: Question

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

--- 

### :car: Example
```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for (int j = lastNonZeroIndex; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
- Memory Usage: 38.7 MB, less than 75.40% of Java online submissions for Move Zeroes.

---

### :pencil: Explanation

Move all non-zeros to front in order to set remaining to zero

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.11
