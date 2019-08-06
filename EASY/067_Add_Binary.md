# :books: [Add Binary](https://leetcode.com/problems/add-binary/)

### :star: Question

- Given two binary strings, return their sum (also a binary string).
- The input strings are both non-empty and contains only characters 1 or 0.

--- 

### :car: Example

Input: a = "11", b = "1"
Output: "100"

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); //Google immutability or string vs stringbuilder if you don't know why we use this instead of regular string
        int i = a.length() - 1, j = b.length() -1, carry = 0; //two pointers starting from the back, just think of adding two regular ints from you add from back
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry 
            if (j >= 0) sum += b.charAt(j--) - '0'; //we subtract '0' to get the int value of the char from the ascii
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
- Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Add Binary.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(m+n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.08.06
