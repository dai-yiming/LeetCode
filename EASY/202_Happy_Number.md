# :books: [Happy Number](https://leetcode.com/problems/happy-number/)

### :star: Question

- Write an algorithm to determine if a number is "happy".
- A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

--- 

### :car: Example
```
Input: 19
Output: true
Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    private int digitSquareSum(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            res += temp * temp;
        }
        return res;
    }

    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if (fast == 1)
                return true;
        } while (slow != fast);
        return false;
    }
}
```

- Runtime: 1 ms, faster than 94.40% of Java online submissions for Happy Number.
- Memory Usage: 33.4 MB, less than 6.01% of Java online submissions for Happy Number.

---

### :pencil: Explanation

- Surprisingly, we can apply the Floyd Cycle Detection (the one we used in Detect Linked List Cycle) on this problem: think of what is a cycle in this case
- Using Floyd Cycle Detection algorithm (fast and slow pointer), we will be able to actually get the value of B. Then the rest of task would be very simple, we simply check whether this value will be 1 or not.
- You may ask: what if value "1" also appears in the cycle and we are skipping over it. Well, in that case, the value that slow and fast are equal to will be 1, as transformation of 1 is still 1, so we still cover this case.

---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.30
