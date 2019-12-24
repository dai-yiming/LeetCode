# :books: [Contain Duplicate](https://leetcode.com/problems/contains-duplicate/)

### :star: Question

- Given an array of integers, find if the array contains any duplicates.
- Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

--- 

### :car: Example
```
Input: [1,2,3,1]
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
```

#### :coffee: Java Version - 2

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
```

- Method 1
  - Runtime: 10 ms, faster than 19.80% of Java online submissions for Contains Duplicate.
  - Memory Usage: 43.4 MB, less than 71.08% of Java online submissions for Contains Duplicate.
- Method 2
  - Runtime: 3 ms, faster than 99.10% of Java online submissions for Contains Duplicate.
  - Memory Usage: 42.1 MB, less than 92.00% of Java online submissions for Contains Duplicate.

---

### :pencil: Explanation

Check while traversing

---

### :computer: Complexity Analysis:

- Method 1
  - Time complexity: O(n)
  - Space complexity: O(n)
- Method 2
  - Time complexity: O(log(n))
  - Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.02
