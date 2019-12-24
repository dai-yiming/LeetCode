# :books: [Third Maximum Number](https://leetcode.com/problems/third-maximum-number/)

### :star: Question

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

--- 

### :car: Example
```
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
```

- Runtime: 2 ms, faster than 68.54% of Java online submissions for Third Maximum Number.
- Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Third Maximum Number.

#### :coffee: Java Version - 2

```java
class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            }  else if (nums[i] > third && nums[i] < second){
                third = nums[i];
            }  else if (nums[i] > second && nums[i] < first) {
                third = second;
                second = nums[i];
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Third Maximum Number.
- Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Third Maximum Number.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.09
