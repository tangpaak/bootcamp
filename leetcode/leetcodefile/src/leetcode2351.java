import java.util.Arrays;

public class leetcode2351 {

  // 2351. First Letter to Appear Twice

  // Given a string s consisting of lowercase English letters, return the first letter to appear twice.

  // Note:

  // A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
  // s will contain at least one letter that appears twice.


  // Example 1:
  // Input: s = "abccbaacz"
  // Output: "c"
  // Explanation:
  // The letter 'a' appears on the indexes 0, 5 and 6.
  // The letter 'b' appears on the indexes 1 and 4.
  // The letter 'c' appears on the indexes 2, 3 and 7.
  // The letter 'z' appears on the index 8.
  // The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

  // Example 2:
  // Input: s = "abcdd"
  // Output: "d"
  // Explanation:
  // The only letter that appears twice is 'd' so we return 'd'.


  // Constraints:

  // 2 <= s.length <= 100
  // s consists of lowercase English letters.
  // s has at least one repeated letter.

  public static char repeatedCharacter(String s) {

    int[] count = new int[26];

    for (char c : s.toCharArray()) {
      count[c - 'a']++;
      if (count[c - 'a'] == 2) {
        // System.out.println("count2 =" + count[c - 'a']);
        // System.out.println("count2" + Arrays.toString(count));
        return (char) (c);

      }
      // System.out.println("count[c - 'a'] count ++ =" + count[c - 'a']);
      // System.out.println(Arrays.toString(count));
    }
    return ' ';
  }



  public static void main(String[] args) {

    System.out.println(repeatedCharacter("abccbaacz"));
    System.out.println(repeatedCharacter("abcdd"));

    // String str = "abbbcda";
    // int[] arr = new int[26];

    // for (int i = 0; i < str.length(); i++) {
    // char c = str.charAt(i);
    // arr[c - 'a']++;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > 0) {
    // char c = (char) (i + 'a');
    // System.out.println(c + " occurs " + arr[i] + " times.");
    // System.out.println(Arrays.toString(arr));
    // }
    // }


  }
}
