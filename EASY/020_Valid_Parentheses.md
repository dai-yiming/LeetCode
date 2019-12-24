# :books: [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

### :star: Question

- Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
- An input string is valid if:
  - Open brackets must be closed by the same type of brackets.
  - Open brackets must be closed in the correct order.
  - Note that an empty string is also considered valid.

---

### :car: Example
```
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false

Input: "{[]}"
Output: true
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
import java.util.HashMap;
import java.util.Stack;

class Solution {

    private HashMap<Character, Character> mappings = new HashMap<Character, Character>();

    public Solution() {
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.mappings.containsKey(c)) {

                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
```

---

### :pencil: [Explanation](https://leetcode.com/problems/valid-parentheses/solution/)

---

### :pen: Author

YIMING DAI-2019.06.25
