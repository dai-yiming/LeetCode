# :books: [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)

### :star: Question

- You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
- The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

--- 

### :car: Example
```
Input: J = "aA", S = "aAAbbbb"
Output: 3
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j: J.toCharArray())
            setJ.add(j);
        for (char s: S.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }
}
```

- Runtime: 1 ms, faster than 94.36% of Java online submissions for Jewels and Stones.
- Memory Usage: 35 MB, less than 97.47% of Java online submissions for Jewels and Stones.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(J+S)
- Space complexity: O(J)

---

### :pen: Author

YIMING DAI - 2019.12.07
