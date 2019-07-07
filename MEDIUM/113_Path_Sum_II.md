# :books: [Path Sum II](https://leetcode.com/problems/path-sum-ii/)

### :star: Question

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

--- 

### :car: Example

```
Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1

Return:
[
   [5,4,11,2],
   [5,8,4,5]
]
```

---

### :hammer: Code

#### :coffee: Java Version - 1 - Stack

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
    private List<List<Integer>> res = new ArrayList<>();

    private void dfs(TreeNode root, int leftover, Stack<Integer> path) {
        path.push(root.val); // Forgot causes java.util.EmptyStackException
        if (root.left == null && root.right == null && root.val == leftover)
            res.add(new ArrayList<>(path)); // Syntax
        if (root.left != null)
            dfs(root.left, leftover - root.val, path);
        if (root.right != null)
            dfs(root.right, leftover - root.val, path);
        path.pop(); // Empty path after dfs
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)
            return res;
        Stack<Integer> path = new Stack<>();
        dfs(root, sum, path);
        return res;
    }
}
```

- Runtime: 2 ms, faster than 35.87% of Java online submissions for Path Sum II.
- Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Path Sum II.

#### :coffee: Java Version - 2 - LinkedList

```java
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, new LinkedList<Integer>(), sum);
        return res;
    }

    private void dfs(TreeNode root, List<List<Integer>> res, LinkedList<Integer> path, int leftover) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.val == leftover && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }
        dfs(root.left, res, path, leftover - root.val);
        dfs(root.right, res, path, leftover - root.val);
        path.removeLast();
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.
- Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Path Sum II.


---

### :pencil: Explanation

- Save intermediate result into stack and save the stack into result array once its sum == required sum.
- `result.add(new ArrayList<Integer>(path));` When you use add function of List, it just add a copy of reference of the object into the List instead of a new copy of the object. So if you don’t create a new copy, all the reference you add to your result refer to the same object.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(bm)

---

### :pen: Author

YIMING DAI - 2019.07.07
