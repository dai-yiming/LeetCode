# :books: [Single Number](https://leetcode.com/problems/single-number/)

### :star: Question

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

---

### :car: Example

- Input: [4,1,2,1,2]
- Output: 4

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
// Method 1
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}

// Method 2
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], 2);
            } else {
                hash.put(nums[i], 1);
            }
        }
        for (Integer key : hash.keySet()) {
            if (hash.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}
```

- Method 1
  - Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
  - Memory Usage: 38.9 MB, less than 93.80% of Java online submissions for Single Number.
- Method 2
  - Runtime: 8 ms, faster than 21.43% of Java online submissions for Single Number.
  - Memory Usage: 40 MB, less than 85.43% of Java online submissions for Single Number.

---

### :pencil: Explanation

- Method 1
  - We use bitwise XOR to solve the problem
  - O ^ N = N
  - N ^ N = 0
  - N1 ^ N2 ^ N1 ^ N3 ^ N2 = (N1 ^ N1) ^ (N2 ^ N2) ^ N3 = N3
- Method 2
  - Traverse whole all elements in nums
  - If `nums[i]` exists, pop it from hash table
  - Else put it in hash table
  - Finally only one element remains, pop it as a value

---

### :computer: Complexity Analysis:

- Method 1
  - Time complexity: O(n)
  - Space complexity: O(1)
- Method 2
  - Time complexity: O(n)
  - Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.06.29
