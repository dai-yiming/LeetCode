# :books: [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

### :star: Question

- Given a linked list, determine if it has a cycle in it.
- To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

---

### :car: Example

- Input: head = [3,2,0,-4], pos = 1
- Output: true
- Explanation: There is a cycle in the linked list, where tail connects to the second node.

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Method 1
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) { // Avoid runtime error
                return false;
            }
            slow = slow.next;
            fast = fast.next.next; // May cause runtime error
        }
        return true;
    }
}

// Method 2
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while (head != null) {
            if (nodeSeen.contains(head)) {
                return true;
            } else {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}


```

- Method 1
  - Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
  - Memory Usage: 37.7 MB, less than 83.13% of Java online submissions for Linked List Cycle.
- Method 2
  - Runtime: 4 ms, faster than 19.85% of Java online submissions for Linked List Cycle.
  - Memory Usage: 37.4 MB, less than 99.12% of Java online submissions for Linked List Cycle.

---

### :pencil: Explanation

- Method 1
    - We use fast and slow pointers
    - If cycle exists, two pointers will finally meet
- Method 2
    - Traverse whole all elements in nums
    - If `head` exists, pop it from set
    - Else put it in set
    - No cycle if either pointer goes to null pointer

---

### :computer: Complexity Analysis:

- Method 1
  - Time complexity: O(n)
  - Space complexity: O(1)
- Method 2
  - Time complexity: O(n)
  - Space complexity: O(n)

---

### :pen: Author

YIMING DAI - 2019.06.29
