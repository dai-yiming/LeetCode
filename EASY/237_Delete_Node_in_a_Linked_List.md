# :books: [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

### :star: Question

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

--- 

### :car: Example
```
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
- Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.

---

### :pencil: Explanation

- The linked list will have at least two elements.
- All of the nodes' values will be unique.
- The given node will not be the tail and it will always be a valid node of the linked list.
- Do not return anything from your function.

---

### :computer: Complexity Analysis

- Time complexity: O(1)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.09.20
