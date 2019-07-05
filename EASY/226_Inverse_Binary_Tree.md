# :books: [Inverse Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

### :star: Question

Invert a binary tree.

--- 

### :car: Example

```
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

---

### :hammer: Code

#### :coffee: Java Version - 1 - Recursive

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.right = left;
        root.left = right;
        return root;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
- Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Invert Binary Tree.

#### :coffee: Java Version - 2- Iterative

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); // Insert root first
        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            TreeNode temp = currNode.left;
            currNode.left = currNode.right;
            currNode.right = temp;
            if (currNode.left != null)
                q.add(currNode.left);
            if (currNode.right != null)
                q.add(currNode.right);
        }
        return root;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
- Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Invert Binary Tree.

---

### :pencil: Explanation

- Inverse of empty tree is empty tree
- Right subtree is inverse of left
- Left subtree is inverse of right

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.05
