# :books: [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

### :star: Question

Given a singly linked list, determine if it is a palindrome.

--- 

### :car: Example
```
Input: 1->2->2->1
Output: true
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
    private ListNode ref;

    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(head);
    }

    private boolean check(ListNode node) {
        if (node == null)
            return true;
        boolean res = check(node.next);
        boolean isEqual = (ref.val == node.val) ? true : false;
        ref = ref.next;
        return res && isEqual;
    }
}
```

- Runtime: 1 ms, faster than 99.25% of Java online submissions for Palindrome Linked List.
- Memory Usage: 43.1 MB, less than 14.95% of Java online submissions for Palindrome Linked List.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.07.
