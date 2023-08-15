

/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.Stack;

public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c")); //true
    System.out.println(backspaceCompare("ab##", "c#d#")); //true
    System.out.println(backspaceCompare("a#c", "b")); //false

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    return buildString(s).equals(buildString(t));
}

private static String buildString(String str) {
    Stack<Character> stack = new Stack<>();

    for (char ch : str.toCharArray()) {
        if (ch != '#') {
            stack.push(ch);
        } else if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
        sb.append(stack.pop());

        // System.out.println(sb);
    }

    return sb.toString();
}
}


