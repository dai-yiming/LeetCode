# :books: [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

### :star: Question

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

--- 

### :car: Example

- Input: [-2,1,-3,4,-1,2,1,-5,4],
- Output: 6
- Explanation: [4,-1,2,1] has the largest sum = 6.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        int runSum = nums[0];
        int result = runSum; 
        for(int end = 1; end < nums.length; end++) {
            runSum = runSum+nums[end]>=nums[end] ?    runSum + nums[end] :  nums[end];
            result = Math.max(runSum, result);
        }
        return result;
    }
}
```

- Runtime: 1 ms, faster than 88.18% of Java online submissions for Maximum Subarray.
- Memory Usage: 37.4 MB, less than 99.41% of Java online submissions for Maximum Subarray.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.05
