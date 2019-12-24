# :books: [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

### :star: Question

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.

--- 

### :car: Example



---

### :hammer: Code

#### :coffee: Java Version - 1

```java
// Best Time and Memory Complexity
class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        if (N == 2) {
            return 1;
        }

        int current = 0;
        int prev1 = 1;
        int prev2 = 0;

        for (int i = 2; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
```

#### :coffee: Java Version - 2

```java
// Intuition
class Solution {
    public int fib(int N) {
        if (N == 0) return 0;
        else if (N == 1) return 1;
        else return fib(N - 1) + fib(N - 2);
    }
}
```

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.05
