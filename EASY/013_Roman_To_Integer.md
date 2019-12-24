
# :books: [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

### :star: Question

- Given a roman numeral, convert it to an integer.
- Input is guaranteed to be within the range from 1 to 3999.
- Roman numerals are represented by seven different symbols: I(1), V(5), X(10), L(50), C(100), D(500), and M(1000).

---

### :pencil: Explanation

- Two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
- Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9. 
- X can be placed before L (50) and C (100) to make 40 and 90. 
- C can be placed before D (500) and M (1000) to make 400 and 900.

---

### :car: Example

```
Input: "III"
Output: 3

Input: "IV"
Output: 4

Input: "IX"
Output: 9

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;

// Below is relatively slow
class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return -1;
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int res = hash.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (hash.get(s.charAt(i)) > hash.get(s.charAt(i + 1))
                res += hash.get(s.charAt(i));
            else
                res -= hash.get(s.charAt(i));
        }
        return res;
    }
}

// Best Solution!
class Solution {
    public int romanToInt(String s) {

        int prev = 0;
        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int num = 0;

            switch (ch) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            }
            if (num < prev) {
                res -= num;
            } else {
                res += num;
            }
            prev = num;
        }

        return res;
    }
}
```

- Runtime: 3 ms, faster than 100.00% of Java online submissions for Roman to Integer.
- Memory Usage: 36.1 MB, less than 99.95% of Java online submissions for Roman to Integer.

---

### :pen: Author

YIMING DAI - 2019.06.23
