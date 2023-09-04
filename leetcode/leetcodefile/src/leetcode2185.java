public class leetcode2185 {
  // 2185. Counting Words With a Given Prefix

  // You are given an array of strings words and a string pref.

  // Return the number of strings in words that contain pref as a prefix.

  // A prefix of a string s is any leading contiguous substring of s.


  // Example 1:
  // Input: words = ["pay","attention","practice","attend"], pref = "at"
  // Output: 2
  // Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".

  // Example 2:
  // Input: words = ["leetcode","win","loops","success"], pref = "code"
  // Output: 0
  // Explanation: There are no strings that contain "code" as a prefix.

  // Constraints:

  // 1 <= words.length <= 100
  // 1 <= words[i].length, pref.length <= 100
  // words[i] and pref consist of lowercase English letters.

  public static int prefixCount(String[] words, String pref) {

    int count = 0;

    for (int i = 0; i < words.length; i++) {
      if (words[i].startsWith(pref)) {
        count++;
      }
    }

    return count;



  }



  public static void main(String[] args) {

    String[] words1 = new String[] {"pay", "attention", "practice", "attend"};
    String[] words2 = new String[] {"leetcode", "win", "loops", "success"};

    System.out.println(prefixCount(words1, "at"));
    System.out.println(prefixCount(words2, "code"));



  }



}
