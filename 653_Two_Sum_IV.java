import java.util.HashSet;

// Two Sum IV - Input is a BST
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

// Given a Binary Search Tree and a target number, return true if there exist
// two elements in the BST such that their sum is equal to the given target.

/**
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
 

Example 2:

Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
*/

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

// Runtime: 4 ms, faster than 72.77% of Java online submissions for Two Sum IV - Input is a BST.
// Memory Usage:42.2 MB, less than 67.13% of Java online submissions for Two Sum IV- Input is a BST.

// @YIMING DAI - 2019.06.22
