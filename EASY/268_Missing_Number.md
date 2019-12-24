# :books: [Missing Number](https://leetcode.com/problems/missing-number/)

### :star: Question

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

--- 

### :car: Example
```
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
```
---

### :hammer: Code

#### :coffee: Java Version - 1 - Bit Manipulation

```java
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
- Memory Usage: 38.8 MB, less than 99.46% of Java online submissions for Missing Number.

#### :coffee: Java Version - 2 -  Gauss' Formula

```java
class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
- Memory Usage: 39.1 MB, less than 99.40% of Java online submissions for Missing Number.

---

### :pencil: Explanation

1. Bit Manipulation
  - We can harness the fact that XOR is its own inverse to find the missing element in linear time.
  - missing
​  - = 4∧(0∧0)∧(1∧1)∧(2∧3)∧(3∧4)
  - = (4∧4)∧(0∧0)∧(1∧1)∧(3∧3)∧2
  - = 0∧0∧0∧0∧2
  - = 2
2. Gauss' Formula
  - the number that is missing is simply the result of Gauss' formula minus the sum of nums
3. Hash Table
  - Flag condition `!hash.contains(missing)` and return
4. Sort and brute force
​	
 

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.10
