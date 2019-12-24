# :books: [Two Sum](https://leetcode.com/problems/two-sum/)

Using HashMap to traverse every integer and check if containing complement with different index (not itself)

---

### :star: Question

- Given an array of integers, return indices of the two numbers such that they add up to a specific target.
- You may assume that each input would have exactly one solution, and you may not use the same element twice.

---

### :car: Example

- Given nums = [2, 7, 11, 15], target = 9,
- Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if (hash.containsKey(temp) && hash.get(temp) != j) {
                return new int[] { j, hash.get(temp) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

- Runtime: 2 ms, faster than 99.00% of Java online submissions for Two Sum.
- Memory Usage: 37.8 MB, less than 99.38% of Java online submissions for Two Sum.

---

### :pencil: Explanation

- If the complement exists, we need to look up its index. What is the best way to maintain a mapping of each element in the array to its index? A hash table.
- We reduce the look up time from O(n) to O(1) by trading space for speed. A hash table is built exactly for this purpose, it supports fast look up in near constant time. I say "near" because if a collision occurred, a look up could degenerate to O(n) time. But look up in hash table should be amortized O(1) time as long as the hash function was chosen carefully.
- A simple implementation uses two iterations. In the first iteration, we add each element's value and its index to the table. Then, in the second iteration we check if each element's complement (target - nums[i]) exists in the table. Beware that the complement must not be nums[i] itself!

---

### :computer: Complexity Analysis:

- Time complexity : O(n). We traverse the list containing nn elements exactly twice. Since the hash table reduces the look up time to O(1), the time complexity is O(n).
- Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly nn elements. 

---

### :pen: Author

YIMING DAI - 2019.06.22
