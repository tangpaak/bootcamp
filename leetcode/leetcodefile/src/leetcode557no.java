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


public class leetcode557no {


  public static String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    StringBuilder word = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (c == ' ') {
        sb.append(word.reverse()).append(c);
        // 一路掃有無space, 有就加番果個word入去(reverse版既word + spacce)
        // System.out.println("word= " + word.reverse());
        // System.out.println(sb);
        word.setLength(0); // Reset the word StringBuilder for the next word
      } else {
        word.append(c); // word一路用c去砌出黎, 最尾reverse加入去
        // System.out.println("word2= " + word);
      }
    }
    // Append the last word (no trailing space after the last word)
    System.out.println("Last word= " + word); // Last word
    sb.append(word.reverse());


    return sb.toString();
  }



  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s));

    // s = "God Ding";
    // System.out.println(reverseWords(s));


  }


}
