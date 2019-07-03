# :books: [ Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

### :star: Question

- Given a binary tree, determine if it is height-balanced.
- For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

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
    public boolean isBalanced(TreeNode root) {
        TreeNode node = root;
        if (node == null) {
            return true;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return (leftHeight == rightHeight || leftHeight == rightHeight - 1 || leftHeight - 1 == rightHeight)
                && isBalanced(node.left) && isBalanced(node.right);
    }

    private int getHeight(TreeNode node) {

        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left) + 1, getHeight(node.right) + 1);
    }
}
```

- Runtime: 1 ms, faster than 90.08% of Java online submissions for Balanced Binary Tree.
- Memory Usage: 38.6 MB, less than 85.33% of Java online submissions for Balanced Binary Tree.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.06.27
