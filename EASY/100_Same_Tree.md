# :books: [Same Tree](https://leetcode.com/problems/same-tree/)

### :star: Question

- Given two binary trees, write a function to check if they are the same or not.
- Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

---

### :car: Example

- Input: [1,2], [1,null,2]
- Output: false

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
- Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Same Tree.

---

### :pencil: Explanation

- If both nodes null, true;
- If one node is null but not the other, false;
- If value of nodes are different, false;
- Must satisfy both left and right subtrees

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(log(n)) or O(n)

---

### :pen: Author

YIMING DAI - 2019.06.27
