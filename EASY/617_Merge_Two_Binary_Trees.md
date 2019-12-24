# :books: [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)

### :star: Question

- Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
- You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

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
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
- Memory Usage: 40.4 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis

- Time complexity: O(M)
- Space complexity: O(M)
- `M` is the minimum nodes in two trees

---

### :pen: Author

YIMING DAI - 2019.12.08
