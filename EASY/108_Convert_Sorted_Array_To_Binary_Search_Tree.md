# :books: [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

### :star: Question

- Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
- For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

### :car: Example

- Given the sorted array: [-10,-3,0,5,9],
- One possible answer is: [0,-3,9,-10,null,5]

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

    private TreeNode divide(int[] nums, int low, int high) {
        if (high < low) {
            return null;  // End of tree
        }
        int mid = (low + high) / 2;
        // Construct head
        TreeNode node = new TreeNode(nums[mid]);
        // Construct leaves
        node.left = divide(nums, low, mid - 1);
        node.right = divide(nums, mid + 1, high);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        TreeNode res = divide(nums, 0, nums.length - 1);
        return res;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
- Memory Usage: 36.9 MB, less than 99.93% of Java online submissions for Convert Sorted Array to Binary Search Tree.

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.06.28
