# :books: [Power of Two](https://leetcode.com/problems/power-of-two/)

### :star: Question

- Given an integer, write a function to determine if it is a power of two.
- Please constrain time complexity to `O(1)`

--- 

### :car: Example
```
Input: 1
Output: true 
Explanation: 2^0 = 1
```
---

### :hammer: Code

#### :coffee: Java Version - 1 - Bit Operation

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
}
```

- Runtime: 1 ms, faster than 99.83% of Java online submissions for Power of Two.
- Memory Usage: 33.4 MB, less than 5.16% of Java online submissions for Power of Two.

#### :coffee: Java Version - 2 - Math Derivation

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (1073741824 % n == 0);
    }
}
```

- Runtime: 1 ms, faster than 99.83% of Java online submissions for Power of Two.
- Memory Usage: 33.4 MB, less than 5.16% of Java online submissions for Power of Two.

#### :coffee: Java Version - 3 - Bit Count

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
```

- Runtime: 1 ms, faster than 99.83% of Java online submissions for Power of Two.
- Memory Usage: 33.7 MB, less than 5.16% of Java online submissions for Power of Two.


#### :coffee: Java Version - 4 - Look-up Table

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return new HashSet<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608,16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824)).contains(n);
    }
}
```

- Runtime: 8 ms, faster than 5.08% of Java online submissions for Power of Two.
- Memory Usage: 35.5 MB, less than 5.16% of Java online submissions for Power of Two.

---

### :pencil: Explanation

- Bit Operation
  - If n is the power of two:
  - n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
  - n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
  - n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
  - n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
  - we have n & (n-1) == 0b0000...0000 == 0
- Math Derivation
  - Because the range of an integer = -2147483648 (-2^31) ~ 2147483647 (2^31-1), the max possible power of two = 2^30 = 1073741824.
  - If n is the power of two, let n = 2^k, where k is an integer.
- Bit Count
  - Very intuitive. If n is the power of 2, the bit count of n is 1.
  - Note that 0b1000...000 is -2147483648, which is not the power of two, but the bit count is 1.

---

### :computer: Complexity Analysis:

- Time complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.02
