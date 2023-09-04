// 557. Reverse Words in a String III

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "God Ding"
// Output: "doG gniD"


// Constraints:

// 1 <= s.length <= 5 * 104
// s contains printable ASCII characters.
// s does not contain any leading or trailing spaces.
// There is at least one word in s.
// All the words in s are separated by a single space.

import java.util.Deque;
import java.util.LinkedList;

public class leetV557 {


  public static String reverseWords(String s) {

    // Split()
    // word -> toCharArray(), Stack
    // StringBuilder, reverse()
    // for loop

    Deque<Character> deque = new LinkedList<>();
    StringBuilder reversed = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') {
            reversed = reversed.append(reverse(deque)).append(" ");
            continue;
        }
        deque.addLast(s.charAt(i)); // auto-box
    }
    return reversed.append(reverse(deque)).toString();
}

public static String reverse(Deque<Character> dq) {
    StringBuilder res = new StringBuilder();
    while(!dq.isEmpty()) {
        res.append(dq.pollLast());
    }
    return res.toString();
}



  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s));



  }


}

