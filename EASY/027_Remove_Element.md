# :books: [Remove Element](https://leetcode.com/problems/remove-element/)

### :star: Question

- Given an array `nums` and a value val, remove all instances of that value in-place and return the new length.
- Do not allocate extra space for another array, you must do this by **modifying the input array in-place** with O(1) extra memory.
- The order of elements can be changed. It doesn't matter what you leave beyond the new length.

---

### :car: Example

- Given nums = [0,1,2,2,3,0,4,2], val = 2,
- Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
- Note that the order of those five elements can be arbitrary.
- It doesn't matter what values are set beyond the returned length.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return len;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
- Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Remove Element.

---

### :pencil: Explanation

Swap elements that need to remove to the end of array and return the valid length only

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.26
