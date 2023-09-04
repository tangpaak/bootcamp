public class leetcode1768 {

  // //1768. Merge Strings Alternately
  // Easy
  // 2.5K
  // 45
  // Companies
  // You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
  // starting with word1. If a string is longer than the other,
  // append the additional letters onto the end of the merged string.

  // Return the merged string.

  // Example 1:
  // Input: word1 = "abc", word2 = "pqr"
  // Output: "apbqcr"
  // Explanation: The merged string will be merged as so:
  // word1: a b c
  // word2: p q r
  // merged: a p b q c r

  // Example 2:
  // Input: word1 = "ab", word2 = "pqrs"
  // Output: "apbqrs"
  // Explanation: Notice that as word2 is longer, "rs" is appended to the end.
  // word1: a b
  // word2: p q r s
  // merged: a p b q r s

  // Example 3:
  // Input: word1 = "abcd", word2 = "pq"
  // Output: "apbqcd"
  // Explanation: Notice that as word1 is longer, "cd" is appended to the end.
  // word1: a b c d
  // word2: p q
  // merged: a p b q c d

  // Constraints:

  // 1 <= word1.length, word2.length <= 100
  // word1 and word2 consist of lowercase English letters.

  public static String mergeAlternately(String word1, String word2) {

    StringBuilder w1 = new StringBuilder(word1);
    StringBuilder w2 = new StringBuilder(word2);
    StringBuilder resultword = new StringBuilder("");

    for (int i = 0; i < (w1.length() + w2.length()); i++) {

      if (i < w1.length()) {
        resultword.append(word1.charAt(i));
      }
      System.out.println("i1=" + i);

      if (i < w2.length()) {
        resultword.append(word2.charAt(i));
        System.out.println("i2=" + i);
      }
    }

    return resultword.toString();
  }

  public static void main(String[] args) {

    String word1 = "abc";
    String word2 = "pqr";
    System.out.println(mergeAlternately(word1, word2));

    word1 = "ab";
    word2 = "pqrs";
    System.out.println(mergeAlternately(word1, word2));

  }



}
