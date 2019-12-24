# :books: [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/)

### :star: Question

Given a binary array, find the maximum number of consecutive 1s in this array.

--- 

### :car: Example
```
Input: [1,1,0,1,1,1]
Output: 3
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);
            }
            else count = 0;
        }
        
        return result;
    }
}
```

- Runtime: 3 ms, faster than 45.46% of Java online submissions for Max Consecutive Ones.
- Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.

#### :coffee: Java Version - 2

```java
class Solution {
   public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                for(j = i + 1; j < nums.length && nums[j] != 0; j++){
                }
                max = (j - i) > max ? j - i : max;
                i = j;
            }
        }
        return max;
    }
}
```

- Runtime: 2 ms, faster than 99.65% of Java online submissions for Max Consecutive Ones.
- Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.23
