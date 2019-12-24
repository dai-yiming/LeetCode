# :books: [Perfect Number](https://leetcode.com/problems/perfect-number/)

### :star: Question

- We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

- Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

--- 

### :car: Example
```
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        return sum - num == num;
        // while considering 1 as such a factor, num will also be considered as the other factor. Thus, we need to subtract num from the sum.
    }
}
```

- Runtime: 1 ms, faster than 96.05% of Java online submissions for Perfect Number.
- Memory Usage: 33.3 MB, less than 5.88% of Java online submissions for Perfect Number.


---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(sqrt(N))
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.12.04
