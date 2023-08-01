

/*
 * Given an integer num, return the number of digits in num that divide num.
 * 
 * An integer val divides nums if nums % val == 0.
 */

/*
 * Example 1: Input: num = 7 Output: 1 Explanation: 7 divides itself, hence the answer is 1.
 * 
 * Example 2: Input: num = 121 Output: 2 Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 * 
 * Example 3: Input: num = 1248 Output: 4 Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 */

// draft:
// result the count
// arr[i] check if can num%arr[i]=0
//


import java.lang.Math;
import java.util.Arrays;

public class JavaQuest30 {
  public static void main(String[] args) {
    System.out.println(countDigits(7)); //output : 1
    System.out.println(countDigits(121));// output : 2
    System.out.println(countDigits(1248));// output : 4
    System.out.println(countDigits(999999)); //outpiy : 6
  }

  public static int countDigits(int num) {
    int count = 0;
    int tempnum = num;
    int numlength = (int) (Math.log10(num) + 1); // find num length
    // System.out.println("numDigits= " + numDigits);
    int[] arr = new int[numlength];

    for (int i = arr.length - 1; i >= 0; i--) {
      arr[i] = tempnum % 10; // 餘數就會係最後果個位
      // System.out.println("arr[i]= " + arr[i]);
      tempnum /= 10; // 除10搵下個位
      // System.out.println("num= " + num);
    }
    // num arr[] appear
    // System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      if (num % arr[i] == 0) {
        count++;
        // System.out.println("num= " + num);
        // System.out.println("arr[i]= " + arr[i]);
        // System.out.println("count= " +count);
      }
    }

    return count;
  }
}
