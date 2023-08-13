/*
 * 
 * Question : Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * 
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * 
 */
public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false 1/1
    System.out.println(isThreeDivisors(3)); // false 3/1, 3/3
    System.out.println(isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreeDivisors(12)); // false 12/1, 12/2, 12/4, 12/6
    System.out.println(isThreeDivisors(9999)); // false
    System.out.println(isThreeDivisors(9)); // true, 9/1, 9/3, 9/9
    System.out.println(isThreeDivisors(25)); //true, 25/1, 25/5, 25/25
    System.out.println(isThreeDivisors(49)); //true
    System.out.println(isThreeDivisors(81));

  }

    public static boolean isThreeDivisors(int n) {
      int count = 0;
      for (int i = 1; i <= n; i++) {
          if (n % i == 0) {
              count++;
          }
          if (count > 3) {
              return false;
          }
      }
      return count == 3;
  }



  }

