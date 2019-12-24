# :books: [Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

### :star: Question

- Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
- You may assume that the array does not change.
- There are many calls to sumRange function.

--- 

### :car: Example
```
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
```

- Runtime: 50 ms, faster than 98.72% of Java online submissions for Range Sum Query - Immutable.
- Memory Usage: 41.5 MB, less than 66.40% of Java online submissions for Range Sum Query - Immutable.

---

### :pencil: Explanation

- Notice in the code above we inserted a dummy 0 as the first element in the sum array. This trick saves us from an extra conditional check in sumRange function.

---

### :computer: Complexity Analysis:

- Time complexity: O(1) per query. O(n) time pre-computation
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.12
