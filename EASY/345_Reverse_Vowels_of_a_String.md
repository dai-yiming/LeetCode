# :books: [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

### :star: Question

Write a function that takes a string as input and reverse only the vowels of a string.

--- 

### :car: Example
```
Input: "hello"
Output: "holle"
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[256];
        vowels['a'] = true;
        vowels['e'] = true;
        vowels['o'] = true;
        vowels['u'] = true;
        vowels['i'] = true;
        vowels['A'] = true;
        vowels['E'] = true;
        vowels['O'] = true;
        vowels['U'] = true;
        vowels['I'] = true;

        char[] sA = s.toCharArray();
        int left = 0, right = sA.length - 1;
        while (left < right) {
            while (left < right && !vowels[sA[left]])
                left++;
            while (left < right && !vowels[sA[right]])
                right--;
            char tmp = sA[left];
            sA[left] = sA[right];
            sA[right] = tmp;
            left++;
            right--;
        }
        return new String(sA);

    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Vowels of a String.
- Memory Usage: 36.9 MB, less than 99.93% of Java online submissions for Reverse Vowels of a String.

---

### :pencil: Explanation

Classic two pointers

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.13
