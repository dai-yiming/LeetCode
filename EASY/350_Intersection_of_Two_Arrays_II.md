# :books: [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

### :star: Question

Given two arrays, write a function to compute their intersection.

--- 

### :car: Example
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int size = result.size();
        int[] intersect = new int[size];
        for(i=0; i<size; i++) {
            intersect[i] = result.get(i);
        }
        return intersect;
    }
}
```

- Runtime: 2 ms, faster than 91.34% of Java online submissions for Intersection of Two Arrays II.
- Memory Usage: 37.4 MB, less than 80.09% of Java online submissions for Intersection of Two Arrays II.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(m+n)
- Space complexity: O(m+n)

---

### :pen: Author

YIMING DAI - 2019.07.14
