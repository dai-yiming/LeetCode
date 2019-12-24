# :books: [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

### :star: Question

- Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
- The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
- Note
    - Your returned answers (both index1 and index2) are not zero-based.
    - You may assume that each input would have exactly one solution and you may not use the same element twice.

---

### :car: Example

- Input: numbers = [2,7,11,15], target = 9
- Output: [1,2]
- Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front = 0, back = numbers.length - 1;
        
        while (true) {
            int sum = numbers[front] + numbers[back];
            if (sum == target) {
                return new int[] { front++, back++ };
            }
            if (sum > target) {
                back--;
            }
            if (sum < target) {
                front++;
            }
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
- Memory Usage:38.3 MB, less than 61.99% of Java online submissions for Two Sum
II - Input array is sorted.

---

### :pencil: Explanation

Traverse back and forth

---

### :pen: Author

YIMING DAI - 2019.06.22
