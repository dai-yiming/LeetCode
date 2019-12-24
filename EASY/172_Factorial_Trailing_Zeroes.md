# :books: [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/)

### :star: Question

Given an integer n, return the number of trailing zeroes in n!.

### :car: Example

```
Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.
```

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
// Concise but expensive
class Solution {
    public int trailingZeroes(int n) {
        return (n == 0) ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}

// Space saving
class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        
        while (n>0) {
            n = n/5;
            count += n;
        }
        
        return count;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.
- Memory Usage: 33.4 MB, less than 18.12% of Java online submissions for Factorial Trailing Zeroes.

---

### :pencil: Explanation

- Because all trailing 0 is from factors 5 * 2.
- But sometimes one number may have several 5 factors, for example, 25 have two 5 factors, 125 have three 5 factors. In the n! operation, factors 2 is always ample. So we just count how many 5 factors in all number from 1 to n.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.28
