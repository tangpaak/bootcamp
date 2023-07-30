
// Question : Given an integer number n, return the difference between the product
// of its digits and the sum of its digits.

// Constraints : 1 <= n <= 10^5

// Example :

// Input: n = 4568 Output: 937 Explanation:
// Product of digits = 4 * 5 * 6 * 8 = 960
// Sum of digits = 4 + 5 + 6 + 8 = 23
// Result = 960 - 23 = 937

import java.util.Arrays;

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
    System.out.println(findDifferent(11111));// output : -4
    System.out.println(findDifferent(0));// output : 0
  }

  public static int findDifferent(int n) {
    if (n == 0) {
      return 0;
    }

    // code here
    String str = String.valueOf(n);
    int[] arr = new int[str.length()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Character.getNumericValue(str.charAt(i));
    }

    int pd = 1;
    int sd = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr.length == 1) {
        pd = arr[i];
      }

      else if (arr.length > 0) {
        for (i = 0; i < arr.length; i++) {
          if (i == 0) {
            pd = arr[i];
          }
          if (i != arr.length - 1) {
            pd = pd * arr[i + 1];
            // System.out.println("pd= " + pd);
            // System.out.println("arr[i]=" + arr[i]);
            // System.out.println("arr[i+1]=" + arr[i + 1]);
          } else if (i == arr.length) {
            pd = pd * arr.length - i - 1;
          }
          // System.out.println(arr[i]);
        }
      }

      for (i = 0; i < arr.length; i++) {
        sd = sd + arr[i];
      }
    }

    // System.out.println("sd=" + sd);
    int num = pd - sd;
    return num;
  }

  // Another ans: 
  // public static int findDifferent(int n) {
  // if (n == 0) {
  // return 0;
  // }

  // String str = String.valueOf(n);
  // int[] arr = new int[str.length()];
  // for (int i = 0; i < arr.length; i++) {
  // arr[i] = Character.getNumericValue(str.charAt(i));
  // }

  // int pd = 1;
  // int sd = 0;

  // for (int i = 0; i < arr.length; i++) {
  // pd *= arr[i];
  // sd += arr[i];
  // }

  // return pd - sd;
  // }


}
