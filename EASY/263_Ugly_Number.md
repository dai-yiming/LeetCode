# :books: [Ugly Number](https://leetcode.com/problems/ugly-number/)

### :star: Question

- Write a program to check whether a given number is an ugly number.
- Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

--- 

### :car: Example
```
Input: 6
Output: true
Explanation: 6 = 2 × 3
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean isUgly(int num) {
        if(num<=0)
            return false;
        
        while (num%2==0)
        {
            num /= 2;
        }
        
        while(num%3==0)
        {
            num /= 3;
        }
        
        while(num%5==0)
        {
            num /= 5;
        }
        
        return num==1;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
- Memory Usage: 33.2 MB, less than 5.18% of Java online submissions for Ugly Number.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.10
