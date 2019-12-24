# :books: [N-ary Tree Level Order Traversal](https://leetcode.com/problems/n-ary-tree-level-order-traversal/)

### :star: Question

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

--- 

### :car: Example

- Input:
<img src="https://assets.leetcode.com/uploads/2018/10/12/narytreeexample.png" width=400cm />
- Output:
[
     [1],
     [3,2,4],
     [5,6]
]

---

### :hammer: Code

#### :coffee: Java Version - 1 - Iterative

```java
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>(); // Key 1
        if (root == null)
            return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> out = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                Node curr = q.poll();
                out.add(curr.val);
                if (curr.children != null) {
                    for (Node n : curr.children)
                        q.add(n);
                }
            }
            res.add(out);
        }
        return res;
    }
}

```

- Runtime: 3 ms, faster than 75.74% of Java online submissions for N-ary Tree Level Order Traversal.
- Memory Usage: 48.4 MB, less than 42.31% of Java online submissions for N-ary Tree Level Order Traversal.


#### :coffee: Java Version - 2 - Recursive

```java
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelProcess(root, 0, res);
        return res;
    }

    private void levelProcess(Node root, int level, List<List<Integer>> res) {
        if (root == null)
            return;
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        for (Node child : root.children) {
            levelProcess(child, level + 1, res);
        }
    }
}
```

- Runtime: 1 ms, faster than 100.00% of Java online submissions for N-ary Tree Level Order Traversal.
- Memory Usage: 49.1 MB, less than 27.57% of Java online submissions for N-ary Tree Level Order Traversal.

---

### :pencil: Explanation

Traverse and process by level

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.07.05
