import java.util.Arrays;

public class leetcode1323array {

  // You are given a positive integer num consisting only of digits 6 and 9.
  // Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

  //總之第一個搵到6既數字轉做9, 就係最大既數目

  // Example 1:

  // Input: num = 9669
  // Output: 9969
  // Explanation:
  // Changing the first digit results in 6669.
  // Changing the second digit results in 9969.
  // Changing the third digit results in 9699.
  // Changing the fourth digit results in 9666.
  // The maximum number is 9969.

  public static int maximum69Number(int num) {
    // int -> String

    String str = String.valueOf(num); //將num轉左做String先
    char[] chars = str.toCharArray();//再將String轉做Array
    System.out.println(str); //Print一Print試下
    System.out.println(Arrays.toString(chars)); //Print一Print睇下係咪Arrays

    for (int i = 0; i < chars.length; i++) {
      // 1. 6 -> 9, 9 -> ?
      // 2. at most 1 time, break?
      // 3. 9999?

      if (chars[i] == '9') {
        chars[i] = chars[i];
      } else if (chars[i] == '6') {
        chars[i] = '9';
       break;
      }

    }

    String res = String.valueOf(chars); // 將chars轉番做String先
    int result = Integer.valueOf(res); //再將String轉做Int [Integer.valueof()]

    return result;


  } 

  public static void main(String[] args) {

    System.out.println(maximum69Number(9669));
    System.out.println(maximum69Number(9996));
    System.out.println(maximum69Number(9999));


  }


}
