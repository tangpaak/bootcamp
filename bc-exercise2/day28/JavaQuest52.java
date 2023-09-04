/*
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * 
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 * 
 * 
 * 
 * Example 1: Input: n = 16 Output: true
 * 
 * Example 2: Input: n = 5 Output: false
 * 
 * Example 3: Input: n = 1 Output: true
 * 
 * 
 * Constraints:
 * 
 * -231 <= n <= 231 - 1
 */
public class JavaQuest52 {
  public static void main(String[] args) {
    System.out.println(isPowerOfFour(16)); // true
    System.out.println(isPowerOfFour(-231));// false
    System.out.println(isPowerOfFour(230));// false
    System.out.println(isPowerOfFour(1));// true
    System.out.println(isPowerOfFour(5));// false

  }

  public static boolean isPowerOfFour(int n) {

    // // Approach 1:
    // if (n <= 0) {
    // return false;
    // }

    // // Check if n is a power of two
    // if ((n & (n - 1)) != 0) {
    // return false;
    // }

    // // Check if the exponent is even
    // int exponent = 0;
    // while (n > 1) {
    // n >>= 1; // 1011 -> 101
    // exponent++;

    // }

    // return exponent % 2 == 0;

  //   // Approach 2:
    if (n == 1) {
      return true;
    } else if (n % 4 == 0) {

      return true;
    }
    return false;
  }

}
