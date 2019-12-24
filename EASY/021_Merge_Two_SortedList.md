# :books: [Merge Two Sorted List](https://leetcode.com/problems/merge-two-sorted-lists/)

### :star: Question

- Merge two sorted linked lists and return it as a new list.
- The new list should be made by splicing together the nodes of the first two lists.

---

### :car: Example

- Input: 1->2->4, 1->3->4
- Output: 1->1->2->3->4->4

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
- Memory Usage: 39.6 MB, less than 33.19% of Java online submissions for Merge Two Sorted Lists.

---

### :pen: Author

YIMING DAI - 2019.06.26
