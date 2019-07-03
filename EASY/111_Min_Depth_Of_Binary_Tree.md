# :books: [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

### :star: Question

- Given a binary tree, find its minimum depth.
- The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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

// Recursive
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return min(root);
    }
    
    private int min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return 1;
        
        return 1+Math.min(min(root.left), min(root.right));
    }
}

// Iterative
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int result=1;
        q.offer(root);
        while(!q.isEmpty()){
            int count = q.size();;
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                if(curr.left==null&&curr.right==null) return result;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            result++;
        }
        
        return result;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
- Memory Usage: 39 MB, less than 98.16% of Java online submissions for Minimum Depth of Binary Tree.

---

### :pencil: [Explanation](https://leetcode.com/problems/minimum-depth-of-binary-tree/discuss/318252/Java-0ms-Recursive-AND-Iterative-Solutions-Explained)

- Let's start with recursive solution(or DFS solution as some people call it). The recursive relationship is that: at any node, the minimum depth from that node is 1+the minimum of minimum depth of its left nodes and minimum depth of its right nodes. In code it is "1+Math.min(min(root.left), min(root.right));"
- Now let's look at iterative solution. This is a BFS, or more specifically level-order traversal of the binary tree. This, in a lot of cases, actually has a better run time than the above. The reason is that we don't have to visit every node in many cases, so the run time is less than O(n).
- Explanation above reserves copyright of userid sli9871230

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: DFS => O(n) | BFS => O(d) in most cases

---

### :pen: Author

YIMING DAI - 2019.06.27
