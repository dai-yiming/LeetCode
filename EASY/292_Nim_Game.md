# :books: [Nim Game](https://leetcode.com/problems/nim-game/)

### :star: Question

- You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
- Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

--- 

### :car: Example
```
Input: 4
Output: false 
Explanation: If there are 4 stones in the heap, then you will never win the game;
             No matter 1, 2, or 3 stones you remove, the last stone will always be 
             removed by your friend.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.
- Memory Usage: 32.8 MB, less than 5.46% of Java online submissions for Nim Game.

---

### :pencil: Explanation

You can always win a Nim game if the number of stones n in the pile is not divisible by 4.

---

### :computer: Complexity Analysis:

- Time complexity: O(1)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.11
