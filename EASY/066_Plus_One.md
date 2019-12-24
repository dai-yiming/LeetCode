# :books: [Plus One](https://leetcode.com/problems/plus-one/)

### :star: Question

- Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
- The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
- You may assume the integer does not contain any leading zero, except the number 0 itself.

---

### :car: Example
```
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Input: [9,9]
Output: [1,0,0]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution{
    public int[] plusOne(int[] digits) {
            
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If current digit is 9
            digits[i] = 0;
        }
        
        // If all digits are 9 begins
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
}
```

---

### :pen: Author

YIMING DAI - 2019.06.27
