# :books: [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

### :star: Question

Write a program to find the node at which the intersection of two singly linked lists begins.

---

### :car: Example

- Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
- Output: Reference of the node with value = 8
- Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
![Tree Graph](https://assets.leetcode.com/uploads/2018/12/13/160_statement.png)

---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = (pa != null) ? pa.next : headB;
            pb = (pb != null) ? pb.next : headA;
        }
        return pa;
    }
}
```

- Runtime: 1 ms, faster than 97.46% of Java online submissions for Intersection of Two Linked Lists.
- Memory Usage: 39 MB, less than 33.76% of Java online submissions for Intersection of Two Linked Lists.

---

### :pencil: Explanation

- Maintain two pointers `pa` and `pb` initialized at the head of A and B, respectively. Then let them both traverse through the lists, one node at a time.
- When `pa` reaches the end of a list, then redirect it to the head of B (yes, B, that's right.); similarly when `pb` reaches the end of a list, redirect it the head of A.
- If at any point `pa` meets `pb`, then `pa` or `pb` is the intersection node.

---

### :computer: Complexity Analysis:

- Time complexity: O(m + n)
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.06.28
