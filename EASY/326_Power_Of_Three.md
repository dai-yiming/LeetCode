# :books: [Power of Three](https://leetcode.com/problems/power-of-three/)

### :star: Question

Given an integer, write a function to determine if it is a power of three.

--- 

### :car: Example
```
Input: 27
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
```

- Runtime: 10 ms, faster than 100.00% of Java online submissions for Power of Three.
- Memory Usage: 35.9 MB, less than 5.03% of Java online submissions for Power of Three.

#### :coffee: Java Version - 2 - Loop

```java
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
```

- Runtime: 11 ms, faster than 66.44% of Java online submissions for Power of Three.
- Memory Usage: 35.6 MB, less than 6.02% of Java online submissions for Power of Three.

#### :coffee: Java Version - 3 - Log

```java
public class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
```

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: Unknown since the expensive operation here is Math.log, which upper bounds the time complexity of our algorithm. The implementation is dependent on the language we are using and the compiler.
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.12
