# :books: [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

### :star: Question

Remove all elements from a linked list of integers that have value val.

--- 

### :car: Example
```
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
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
    public ListNode removeElements(ListNode head, int val) {
        // Handling head.val == val
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode curr = first;
        // Handling Null-Exception
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return first.next;
    }
}
```

- Runtime: 1 ms, faster than 98.63% of Java online submissions for Remove Linked List Elements.
- Memory Usage: 39.5 MB, less than 99.37% of Java online submissions for Remove Linked List Elements.

---

### :pencil: Explanation

Need to handle situations with first/last `ListNode.val == val` and all ListNodes in the array equals to `val`

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.01
