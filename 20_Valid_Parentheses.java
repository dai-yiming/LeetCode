import java.util.HashMap;
import java.util.Stack;

// Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/

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

// Solution: https://leetcode.com/problems/valid-parentheses/solution/

// @YIMING DAI - 2019.06.25
