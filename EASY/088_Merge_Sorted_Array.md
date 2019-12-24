# :books: []()

### :star: Question

- Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
- Note
    - The number of elements initialized in nums1 and nums2 are m and n respectively.
    - You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

---

### :car: Example
```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        //only need to combine with remaining nums2
        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--];
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
- Memory Usage: 36.1 MB, less than 99.97% of Java online submissions for Merge Sorted Array.

---

### :pencil: Explanation

- Work from back to forth
- Insert bigger value from two pointer to the index of the array of longer length

---

### :computer: Complexity Analysis:

- Time complexity:
- Space complexity:

---

### :pen: Author

YIMING DAI - 2019.06.27
