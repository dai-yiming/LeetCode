# :books: [Power of Four](https://leetcode.com/problems/power-of-four/)

### :star: Question

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

--- 

### :car: Example
```
Input: 16
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isPowerOfFour(int num) {
            return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }
}
```

Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.
Memory Usage: 33.7 MB, less than 5.03% of Java online submissions for Power of Four.

---

### :pencil: Explanation

- 0x55555555 is a hexametrical number，it is 1010101010101010101010101010101 in binary with a length of 32. To make sure the 1 locates in the odd location.

---

### :computer: Complexity Analysis:

- Time complexity: O(1)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.12
