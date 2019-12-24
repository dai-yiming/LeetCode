# :books: [Path Sum](https://leetcode.com/problems/path-sum/)

### :star: Question
- Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
- Note: A leaf is a node with no children.

---

### :car: Example
- Input: [5,4,8,11,null,13,4,7,2,null,null,null,1] 22 
- Output: return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        else if (root.right == null && root.left == null)
            return root.val == sum;
        else {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
- Memory Usage: 37.8 MB, less than 91.30% of Java online submissions for Path Sum.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(d)

---

### :pen: Author

YIMING DAI - 2019.06.27
