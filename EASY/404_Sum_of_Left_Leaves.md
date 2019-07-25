# :books: [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)

### :star: Question

Find the sum of all left leaves in a given binary tree.

--- 

### :car: Example

```java
    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
```

---

### :hammer: Code

#### :coffee: Java Version - 1 - Recursive

```java
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) ans += root.left.val;
            else ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
- Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Sum of Left Leaves.

#### :coffee: Java Version - 2 - Iterative

```java
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int ans = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null)
                    ans += node.left.val;
                else
                    stack.push(node.left);
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null)
                    stack.push(node.right);
            }
        }
        return ans;
    }
}
```

- Runtime: 1 ms, faster than 15.68% of Java online submissions for Sum of Left Leaves.
- Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Sum of Left Leaves.


---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: DFS => O(n) | BFS => O(d) in most cases

---

### :pen: Author

YIMING DAI - 2019.07.24
