package Recursion1;

public class Recursion2 {



  public static void main(String[] args) {
    // algorithm -> algo

    // System.out.println(sum(10)); // 55
    System.out.println(sum(5)); // 15
    System.out.println(sum2(7));
    print1(3);
  }

  // Question 1:
  // k + (k - 1) + (k - 2) + .... + 0 , given k
  // 加自己加到去0
  // public static int sum(int k) {

  // int sum = 0;
  // for (int i = k; i > 0; i--) {
  // sum += i;
  // }
  // return sum;
  // }

  public static int sum(int k) { // 要整到自己call自己既method
    if (k < 1) { // base condition
      System.out.println("this is 0");
      return k;
    } // 0

    System.out.println("1"); // 做左6個運算
    return k + sum(k - 1); // 4 + sum3
    // 15, return
    // 5 + 10, return
    // 4 + 6, return
    // 3 + 3, return
    // 2 + 1, return
    // 1 + 0, return
    // 0 < 1, return 0;
  }


  // Question 2:
  // 0,1,1,2,3,5,8,13 ... kth elements [0,1,2,3,4,5,6,7,8 ...]
  // k = 6, return 8

  public static int sum2(int k) {
    // base condition
    if (k <= 1)
      return k;

    System.out.println("count= " + k);
    return sum2(k - 1) + sum2(k - 2);
  }
  // 6 -1 = 5, 5 -2 = 4, = 8
  // 5 -1 = 4, 4 -2 = 2, = 6
  // 4 -1 = 3, 3 -2 = 1, = 4
  // 3 -1 = 2, 2 -2 = 0, = 2
  // 2 -1 = 1, 1 -2 = -1, = 0

  // 25


  // Question 3 :
  // non-tail recursion:
  // 3 2 1 1 2 3, k= 3
// (print1(3))
  public static void print1(int k) {
    
    // 3 > 2 > 1 > 1 > 2 > 3
    if (k < 1)
      return;
    System.out.println(k + " "); //2
    print1(k - 1) ; // print(1) 走左入小括號入面loop
    System.out.println(k + " "); //2 出番黎都要print番

// print 3(76) > first > 入左第二print1()
// print 2(76) > second > 入左第三print1()
// print 1 (76) > third > 入左第四print1()
// 0 > return >逐個括號出番去
// print 1 (78) > third > 出番 第三print1() > print 1 
// print 2 (78) > second > 出番 第二print1() > print 2
// print 3 (78) > second > 出番 第二print1() > print 3

  }





}
