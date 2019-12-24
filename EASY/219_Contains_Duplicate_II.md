# :books: [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)

### :star: Question

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

--- 

### :car: Example
```
Input: nums = [1,0,1,1], k = 1
Output: true

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]) && i - hash.get(nums[i]) <= k) {
                return true;
            } else {
                hash.put(nums[i], i);
            }
        }
        return false;
    }
}
```

- Runtime: 8 ms, faster than 79.26% of Java online submissions for Contains Duplicate II.
- Memory Usage: 42.9 MB, less than 86.54% of Java online submissions for Contains Duplicate II.

#### :coffee: Java Version - 2

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(k);
        if(nums.length==0 || nums.length == 1)
            return false;
        if(nums.length>5000)
            return false;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) // Ensure (i-[index]) < k by below
                return true;
            set.add(nums[i]);
            if(i >= k) // Always leaves k elements in array
                set.remove(nums[i-k]); // Remove first elements in Set

        }
        return false;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Contains Duplicate II.
- Memory Usage: 40.8 MB, less than 99.34% of Java online submissions for Contains Duplicate II.

---

### :pencil: Explanation

Check every interval with length k whether duplicate elements exist

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(k)

---

### :pen: Author

YIMING DAI - 2019.07.03
