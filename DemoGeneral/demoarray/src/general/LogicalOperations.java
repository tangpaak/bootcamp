package general;
public class LogicalOperations {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && operator > AND

    // 4 condition:
    // true true>true
    // true false>false
    // false true>false
    // false false>false
    boolean result = isExpensive && isWorthToBuy;
    // false, both condition must be true true
    System.out.println(result);

    // || Operator >OR
    // true, true> true
    // true, false> true
    // false, true> true
    // false, false> false
    boolean result2 = isExpensive || isWorthToBuy;
    // True, either have a true
    System.out.println(result2);

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12; // false
    System.out.println(result3);

    boolean result4 = c < 15 || (a > 6 && b < 12);
    // AND must be process first
    // true, as c under 15
    System.out.println(result4);

    boolean result5 = c < 15 || (a > 6 && b < 12); // true
    System.out.println("result5=" + result5);

    boolean result6 = a < 6 || b < 9 || c < 9; // true
    System.out.println("result6=" + result6);

    // ==, >=, <=
    // ==, mean asking if a equals to b? true/false
    // =, assignment
    boolean result7 = a == b; // false
    boolean result8 = a >= 5; // true
    boolean result9 = c <= 13; // true

    // ! > NOT Operator, is a not equal to b?
    boolean result10 = c != 13; // false
    boolean result11 = !(c < 13); // true
    System.out.println("result11=" + result11);
    // !() = asking event of (c<13) is false, so it is true

    boolean result12 = !(b == 9) && c != 13; // true && false > false
    // b係咪唔等於9，b＝10，所以true
    // c係咪唔等於13, c=13, 所以false
    System.out.println("result12=" + result12);

    // Operators Precedence
    int result13 = (1 + 9) * 3; // result13 = 30
    int result14 = ++result13 + 1; // result14 = 32

    int i = 27;
    int result15 = i++ + 1; // result15 = 28, i = 28
    System.out.println("result15=" + result15);// assign first, is 28
    System.out.println("i=" + i);// 27+1 only, is 28

    boolean result16 = 25 + 2 < result15 + 1; // true
    System.out.println("result16=" + result16);// 27 < 28


    int x = 5;
    int y = 10;
    int z = x += 3 * y; // z = 5 + 3 * 10, z = 35
    // Above is not appropriate write code, but still can process
    System.out.println("z=" + z); // 35
    System.out.println("x=" + x); // 35
    x = 5;
    // int result17 = (x++ + 2)* x++ + x; // result17=?
    int result17 = (x++ + 2) * x++;
    // (x++ + 2)> 7, x become 6, 
    // 7 * 6 > 42, x become 7,

    // step1 : x++ = 35, so (35+2) (from left to right)
    // step2 : x++ = 36, so (35+2)*36= 1332
    System.out.println("result17=" + result17);// (35+2) * 36 = 1332
    System.out.println("x=" + x);

    





  }


}
