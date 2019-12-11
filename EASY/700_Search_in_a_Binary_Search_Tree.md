# :books: [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)

### :star: Question

Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

--- 

### :car: Example



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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            if (root.val == val)
                return root;
            else if (root.val > val)
                return searchBST(root.left, val);
            else if (root.val < val)
                return searchBST(root.right, val);
        }
        return null;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
- Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Search in a Binary Search Tree.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(M)
- Space complexity: O(M)

---

### :pen: Author

YIMING DAI - 2019.12.11
