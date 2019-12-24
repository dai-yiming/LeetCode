# :books: [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/)

### :star: Question

- Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
- The binary search tree is guaranteed to have unique values.

--- 

### :car: Example
```
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int res = 0;
        if (root != null) {
            if (root.val > L) res += rangeSumBST(root.left, L, R);
            if (root.val < R) res += rangeSumBST(root.right, L, R);
            if (root.val <= R && root.val >= L) res += root.val;
        }
        return res;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
- Memory Usage: 45.5 MB, less than 97.67% of Java online submissions for Range Sum of BST.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.12.06
