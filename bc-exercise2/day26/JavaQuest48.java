/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false */

import java.util.Stack;

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true

  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (stack.isEmpty()) {
                return false;
            } else if (
                (c == ')' && stack.peek() == '(') ||
                (c == ']' && stack.peek() == '[') ||
                (c == '}' && stack.peek() == '{')
            ) {
                stack.pop();
            } else {
                return false;
            }
        }
    }

    return stack.isEmpty();
}





}
