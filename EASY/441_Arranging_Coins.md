# :books: [Arranging Coins](https://leetcode.com/problems/arranging-coins/)

### :star: Question

- You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
- Given n, find the total number of full staircase rows that can be formed.

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Arranging Coins.
- Memory Usage: 33.6 MB, less than 5.26% of Java online submissions for Arranging Coins.


---

### :pencil: Explanation

1 + 2 + 3 + ... + x <= n

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.12
