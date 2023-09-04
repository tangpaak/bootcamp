import java.util.Arrays;

public class leetcode1941no {

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

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

   char[] arr2 = new char[s.length()];

   for (int i = 0; i < s.length(); i++) {
       char c = s.charAt(i);
       arr2[i] = c;
   }
    int length1 = arr2.length;

    System.out.println(Arrays.toString(arr2));

    for (int i = 0; i < length1; i++) {
      if (arr2[i] == 'a') {
        count1++;

      } 

      if (arr2[i] == 'b') {
        count2++;

      }

      if (arr2[i] == 'c') {
        count3++;

      }


      if (count1 == count2 && count2 == count3) {
        return true;

      }
    }        

    return false;
    
    // int max = 0;
    // int min = 1000;

    // for (int num : arr) {
    //   if (num != 0) {
    //     if (num > max)
    //       max = num;
    //     if (num < min)
    //       min = num;



  }



  public static void main(String[] args) {


    String s = "abacbc";
    String s2 = "aaabb";
    System.out.println(areOccurrencesEqual(s));
    System.out.println(areOccurrencesEqual(s2));

  }

}
