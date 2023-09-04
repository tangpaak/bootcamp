import java.util.Arrays;

public class leetV1859 {

  // A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
  // Each word consists of lowercase and uppercase English letters.

  // A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging
  // the words in the sentence.

  // For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
  // Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.


  // Example 1:

  // Input: s = "is2 sentence4 This1 a3"
  // Output: "This is a sentence"
  // Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
  // Example 2:

  // Input: s = "Myself2 Me1 I4 and3"
  // Output: "Me Myself and I"
  // Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


  // Constraints:

  // 2 <= s.length <= 200
  // s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
  // The number of words in s is between 1 and 9.
  // The words in s are separated by a single space.
  // s contains no leading or trailing spaces.
  public static String sortSentence(String s) {

    // split() -> " " ->String[]
    // Step1: split to String[]
    String[] strings = s.split(" "); // slow
    // Step2: New String[] store
    String[] words = new String[strings.length];

    int idx;

    for (int i = 0; i < strings.length; i++) {
      idx = strings[i].charAt(strings[i].length() - 1) - '0' - 1; // char - char
      // 搵文字最後果個數字, 去決定之後放既新array既位置 (is2 -> index 1 既Array ）
      System.out.println(strings[i].charAt(strings[i].length() - 1));
      System.out.println(Arrays.toString(words));

      words[idx] = strings[i].substring(0, strings[i].length() - 1); //
      // 將依家既文字, 放入編排好既位置 0, 1, 2, 3
    }

    // for (String str : strings) {
    // System.out.println(str);
    // }
    StringBuilder sb = new StringBuilder();

    String[] newArr = new String[] {"1", "2", "3", "4"};
    for (int i = 0; i < newArr.length; ++i) {
      System.out.println("for loop " + newArr[2]);
    }
    for (String str : newArr) {
      System.out.println("for each loop " + str);

    }
    for (String str : words) { //
      sb.append(str).append(" ");
    }

    return sb.toString().trim();

  }

  // This is a sentence - > String, String [1-1]


  public static void main(String[] args) {

    System.out.println(sortSentence("is2 sentence4 This1 a3"));

  }

}
