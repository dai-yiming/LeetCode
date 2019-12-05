# :books: [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/)

### :star: Question

- A self-dividing number is a number that is divisible by every digit it contains.
- For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
- Also, a self-dividing number is not allowed to contain the digit zero.
- Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible

--- 

### :car: Example

- Input: left = 1, right = 22
- Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (dividable(i))
                res.add(i);
        }
        return res;
    }

    private boolean dividable(int num) {
        int index = num;
        while (num != 0) {
            int reminder = num % 10;
            if (reminder == 0 || index % reminder != 0)
                return false;
            num /= 10;
        }
        return true;
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Self Dividing Numbers.
- Memory Usage: 33.4 MB, less than 33.33% of Java online submissions for Self Dividing Numbers.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(N)
- Space complexity: O(N)

---

### :pen: Author

YIMING DAI - 2019.12.05
