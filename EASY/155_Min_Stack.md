# :books: [Min Stack](https://leetcode.com/problems/min-stack/)

### :star: Question

- Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
  - push(x) -- Push element x onto stack.
  - pop() -- Removes the element on top of the stack.
  - top() -- Get the top element.
  - getMin() -- Retrieve the minimum element in the stack.

### :car: Example
```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class MinStack {

    private Node head;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            head = new Node(x, Math.min(x, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
```

- Runtime: 46 ms, faster than 88.63% of Java online submissions for Min Stack.
- Memory Usage: 40.2 MB, less than 41.63% of Java online submissions for Min Stack.

---

### :computer: Complexity Analysis:

- Time complexity: O(d)
- Space complexity: O(d)

---

### :pen: Author

YIMING DAI - 2019.06.28
