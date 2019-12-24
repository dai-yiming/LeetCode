# :books: [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

### :star: Question

Reverse a singly linked list.

--- 

### :car: Example
```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
- Memory Usage: 36.9 MB, less than 99.91% of Java online submissions for Reverse Linked List.

---

### :pencil: Explanation

- While you are traversing the list, change the current node's next pointer to point to its previous element.
- Since a node does not have reference to its previous node, you must store its previous element beforehand.
- You also need another pointer to store the next node before changing the reference. Do not forget to return the new head reference at the end!

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.01
