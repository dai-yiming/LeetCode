# :books: [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

### :star: Question

- Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
- Find all the elements of [1, n] inclusive that do not appear in this array.

--- 

### :car: Example
```
Input: [4,3,2,7,8,2,3,1]
Output: [5,6]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0)
                res.add(j + 1);
        }
        return res;
    }
}
```

- Runtime: 6 ms, faster than 78.88% of Java online submissions for Find All Numbers Disappeared in an Array.
- Memory Usage: 47 MB, less than 94.34% of Java online submissions for Find All Numbers Disappeared in an Array.

---

### :pencil: Explanation

- The basic idea is that we iterate through the input array and mark elements as negative using nums $[nums[i] -1] = -nums[nums[i]-1]$. In this way all the numbers that we have seen will be marked as negative. In the second iteration, if a value is not marked as negative, it implies we have never seen that index before, so just add it to the return list.
- Brilliant idea! Because the elements in the Array are from 1 to n, so subtracting 1 will be 0 to n-1 which are the index of the array.
Take input [4.3.2.7.8.2.3.1] as an example, by subtracting 1 it becomes [3.2.1.6.7.1.2.0] which is an array of index.

---

### :computer: Complexity Analysis

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.14
