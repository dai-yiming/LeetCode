# :books: [Two Sum IV - Input is a BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)
Put root.val into Set and traverse root.left and root.right

---

### :star: Question
Given a Binary Search Tree and a target number, return true if there exist
two elements in the BST such that their sum is equal to the given target.

---

### :hammer: Code
#### :coffee:Java Version - 1
```java
import java.util.HashSet;

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

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }
}
```
- Runtime: 4 ms, faster than 72.77% of Java online submissions for Two Sum IV - Input is a BST.
- Memory Usage:42.2 MB, less than 67.13% of Java online submissions for Two Sum IV- Input is a BST.

---

### :pencil: Explanation
- If the sum of two elements x + y equals k, and we already know that x exists in the given tree, we only need to check if an element yy exists in the given tree, such that y = k - x. Based on this simple catch, we can traverse the tree in both the directions(left child and right child) at every step. We keep a track of the elements which have been found so far during the tree traversal, by putting them into a setset.
- or every current node with a value of p, we check if k-p already exists in the array. If so, we can conclude that the sum kk can be formed by using the two elements from the given tree. Otherwise, we put this value pp into the setset.
- If even after the whole tree's traversal, no such element p can be found, the sum k can't be formed by using any two elements.

---

### :computer: Complexity Analysis:
- Time complexity : O(n). The entire tree is traversed only once in the worst case. Here, nn refers to the number of nodes in the given tree.
- Space complexity : O(n). The size of the setset can grow upto nn in the worst case.

---

### :pen: Author
YIMING DAI - 2019.06.22
