# :books: [Rotate Array](https://leetcode.com/problems/rotate-array/)

### :star: Question

Given an array, rotate the array to the right by k steps, where k is non-negative.

---

### :car: Example
```
Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
- Memory Usage: 37.6 MB, less than 89.43% of Java online submissions for Rotate Array.


---

### :pencil: Explanation

Original List                   : 1 2 3 4 5 6 7
After reversing all numbers     : 7 6 5 4 3 2 1
After reversing first k numbers : 5 6 7 4 3 2 1
After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.29
