# :books: [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

### :star: Question

Given a binary tree, return all root-to-leaf paths.

--- 

### :car: Example

```
Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(res, root, sb);
        return res;
    }

    private void dfs(List<String> res, TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            dfs(res, root.left, sb);
            dfs(res, root.right, sb);
        }
        sb.setLength(len);
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
- Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Binary Tree Paths.

---

### :pencil: Explanation

The time complexity for the problem should be O(n), since we are basically visiting each node in the tree. Yet an interviewer might ask you for further optimization when he or she saw a string concatenation. A string concatenation is just too costly. A StringBuilder can be used although a bit tricky since it is not immutable like string is.

When using StringBuilder, We can just keep track of the length of the StringBuilder before we append anything to it before recursion and afterwards set the length back. Another trick is when to append the "->", since we don't need the last arrow at the end of the string, we only append it before recursing to the next level of the tree.

@yfcheng

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(bm)

---

### :pen: Author

YIMING DAI - 2019.07.07
