# :books: [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

---

### :star: Question

- Given a sorted array `nums`, remove the duplicates in-place such that each element appear only once and return the new length.
- Do not allocate extra space for another array, you must do this by **modifying the input array in-place** with O(1) extra memory.

---

### :car: Example

- Given `nums` = [0,0,1,1,1,2,2,3,3,4],
- Your function should return length = 5, with the first five elements of `nums` being modified to 0, 1, 2, 3, and 4 respectively.
- It doesn't matter what values are set beyond the returned length.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        // Check if nums.length == 0 wastes space
        int res = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
```

- Runtime: 1 ms, faster than 99.18% of Java online submissions for Remove Duplicates from Sorted Array.
- Memory Usage: 38.8 MB, less than 99.96% of Java online submissions for Remove Duplicates from Sorted Array.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.26
