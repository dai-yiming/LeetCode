# :books: [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

### :star: Question

- Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
- You may assume no duplicates in the array.

--- 

### :car: Example

- Input: [1,3,5,6], 5
- Output: 2

- Input: [1,3,5,6], 2
- Output: 1

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        while (index < nums.length && target > nums[index])
            index++;
        return index;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
- Memory Usage: 38.7 MB, less than 98.28% of Java online submissions for Search Insert Position.


---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.08
