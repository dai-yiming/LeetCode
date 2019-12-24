# :books: [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

### :star: Question

- You are climbing a stair case. It takes n steps to reach to the top.
- Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
- Note: Given n will be a positive integer.

---

### :car: Example
```
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
- 1 step + 1 step + 1 step
- 1 step + 2 steps
- 2 steps + 1 step
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int prev = 1;
        int curr = 2;
        for (int i = 3; i <= n; i++) {
            int temp = prev + curr;
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
- Memory Usage: 33.1 MB, less than 19.95% of Java online submissions for Climbing Stairs.

---

### :pencil: Explanation

- Main idea is the same as Fibonacci Number
- For $i^{th}$ step in one of the two ways
    - Taking a single step from $(i-1)^{th}$ step
    - Taking a two-step from $(i-2)^{th}$ step
- So total number of ways for $i^{th}$ step is sum of $(i-1)^{th}$ step and $(i-2)^{th}$ step

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.27
