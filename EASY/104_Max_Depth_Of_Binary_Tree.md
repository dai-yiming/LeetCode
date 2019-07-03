# :books: [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

### :star: Question

- Given a binary tree, find its maximum depth.
- The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
- Note: A leaf is a node with no children.

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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
- Memory Usage: 38.6 MB, less than 97.61% of Java online submissions for Maximum Depth of Binary Tree.

---

### :pencil: Explanation

- If root is null, return 0 depth
- Else, add one to depth and recursively check left and right subtrees

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author
YIMING DAI - 2019.06.27
