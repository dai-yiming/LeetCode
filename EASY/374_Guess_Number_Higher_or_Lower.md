# :books: [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)

### :star: Question

- I pick a number from 1 to n. You have to guess which number I picked.
- Every time you guess wrong, I'll tell you whether the number is higher or lower.

--- 

### :car: Example
```
Input: n = 10, pick = 6
Output: 6
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int judge = guess(mid);
            if (judge == 0) {
                return mid;
            } else if (judge < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;    
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
- Memory Usage: 32.8 MB, less than 100.00% of Java online submissions for Guess Number Higher or Lower.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(log_2(n))
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.19
