# :books: [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

### :star: Question

Given a sorted linked list, delete all duplicates such that each element appear only once.

---

### :car: Example

- Input: 1->1->2->3->3
- Output: 1->2->3

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
- Memory Usage: 37.1 MB, less than 99.52% of Java online submissions for Remove Duplicates from Sorted List.

---

### :pencil: Explanation

- Make sure `curr` and `curr.next` is not null to avoid undefined behaviour
- If duplicates occurs, manipulates pointer `curr.next` to **jump** next node and directly link to the `curr.next.next` node
- Else just link the `curr` and `curr.next` like normal

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.27
