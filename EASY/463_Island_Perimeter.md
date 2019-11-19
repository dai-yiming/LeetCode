# :books: [Island Perimeter](https://leetcode.com/problems/island-perimeter/submissions/)

### :star: Question

- You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
- Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
- The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

--- 

### :car: Example

```
Input:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]
Output: 16
```

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int islandPerimeter(int[][] grid) {
        int il = 0, nb = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    il++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1)
                        nb++;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
                        nb++;
                }
            }
        }
        return il * 4 - nb * 2;
    }
}
```

- Runtime: 6 ms, faster than 99.94% of Java online submissions for Island Perimeter.
- Memory Usage: 59 MB, less than 97.92% of Java online submissions for Island Perimeter.

---

### :pencil: Explanation

- loop over the matrix and count the number of islands;
- if the current dot is an island, count if it has any right neighbour or down neighbour;
- the result is islands * 4 - neighbours * 2

---

### :computer: Complexity Analysis

- Time complexity: O(n^2)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.21
