# :books: [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

### :star: Question

- Given two arrays, write a function to compute their intersection.
- Each element in the result must be unique.
- The result can be in any order.

--- 

### :car: Example
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
  public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
    int [] output = new int[set1.size()];
    int idx = 0;
    for (Integer s : set1)
      if (set2.contains(s)) output[idx++] = s;

    return Arrays.copyOf(output, idx);
  }

  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    if (set1.size() < set2.size()) return set_intersection(set1, set2);
    else return set_intersection(set2, set1);
  }
}
```

- Runtime: 2 ms, faster than 98.29% of Java online submissions for Intersection of Two Arrays.
- Memory Usage: 36.4 MB, less than 90.62% of Java online submissions for Intersection of Two Arrays.

---

### :pencil: Explanation

To solve the problem in linear time, let's use the structure set, which provides in/contains operation in O(1) time in average case.

---

### :computer: Complexity Analysis:

- Time complexity: O(m+n)
- Space complexity: O(m+n)

---

### :pen: Author

YIMING DAI - 2019.07.13
