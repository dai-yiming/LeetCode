# :books: [Count and Say](https://leetcode.com/problems/count-and-say/description/)

### :star: Question

- The count-and-say sequence is the sequence of integers with the first five terms as following: 1 => 11 => 21 => 1211
  - 1 is read off as "one 1" or 11.
  - 11 is read off as "two 1s" or 21.
  - 21 is read off as "one 2, then one 1" or 1211.
- Given an integer n, generate the nth term of the count-and-say sequence.
- Note: Each term of the sequence of integers will be represented as a string.

---

### :car: Example

- Input: 1
- Output: "1"

- Input: 4
- Output: "1211"

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = readString(str);
        }
        return str;
    }

    private String readString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, count = 1; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                sb.append(count);
                sb.append(chars[i]);
                count = 1;

            } else
                count++;
        }
        return sb.toString();
    }
}
```

- Runtime: 1 ms, faster than 98.90% of Java online submissions for Count and Say.
- Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Count and Say.

---

### :pen: Author

YIMING DAI - 2019.06.25
