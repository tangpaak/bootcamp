public class leetV1941 {

  // 1941. Check if All Characters Have Equal Number of Occurrences

  // Given a string s, return true if s is a good string, or false otherwise.

  // A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

  // Example 1:
  // Input: s = "abacbc"
  // Output: true
  // Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

  // Example 2:
  // Input: s = "aaabb"
  // Output: false
  // Explanation: The characters that appear in s are 'a' and 'b'.
  // 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

  // Constraints:
  // 1 <= s.length <= 1000
  // s consists of lowercase English letters.


  public static boolean areOccurrencesEqual(String s) {
    // Part1:
    // arr[]
    // "abacbc"

    // 'a' -> 97 (ASCII), length is 6 (012345)
    // 只有26個英文字母 因為無大階 只有小階
    int[] arr = new int[26]; // 'a' -> 97

    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i) - 'a']++; //

    }
    // Part2: min max -> check if all numbers are same
    int previous = arr[0]; // 'a' -> 2

    for (int num : arr) {

      if (num != 0 && previous != 0) {
        System.out.println(previous + " " + num);
        if (num != previous) {
          return false;
        }
      }
    }
    // juzjzjlsfkmpv
    return true;


  }


  public static void main(String[] args) {


    String s = "abacbc";
    String s2 = "aaabb";
    System.out.println(areOccurrencesEqual(s));
    System.out.println(areOccurrencesEqual(s2));

  }



}
