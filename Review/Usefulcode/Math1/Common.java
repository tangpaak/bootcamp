package Math1;

public class Common {
  public static void main(String[] args) {
    System.out.println(commonFactors(12, 6)); // 4
    System.out.println(commonFactors(60, 10));// 4
    System.out.println(commonFactors(25, 30));// 2
    System.out.println(commonFactors(1000, 100));// 9

  }

  public static int commonFactors(int a, int b) {
   int count = 0;
   int smaller = Math.min(a, b);

   for (int i = 1; i <= smaller; i++) {
     if (a % i == 0 && b % i == 0) { //如果係共通既倍數就count++
       count++;
     }
   }

   return count;
 }
}
