package Class;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {

  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.3

    if (result == 0.3)
      System.out.println("result = 0.3");
    else
      System.out.println("result != 0.3");

    System.out.println(0.3 / 0.1); // 2.9999999999999996
    System.out.println(0.2 * 0.1); // 0.020000000000000004

    // Solition:
    BigDecimal b = new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b3 = new BigDecimal(5.0); //Not ok
Double d = 5.0d;
System.out.println("b.multiply(b)=" + b.multiply(b)); //5*5= 25
System.out.println("b.subtract(b2)" + b.subtract(b2)); // 5-4 =1
System.out.println("b.add(b)=" + b.add(b));// 5+5 =10
System.out.println("b.divide(b)=" + b.divide(b)); // 5/5 =1
System.out.println("b.add(new BigDecimal(7))=" + b.add(new BigDecimal(7))); // 一定要對應BigDecimal, 唔可以就咁寫7(int) 5 + 7 =12

System.out.println("b.compareTo(b2)=" + b.compareTo(b2));  // b=5, b2 =4, if b > b2, true, result 1
System.out.println("b2.compareTo(b)=" + b2.compareTo(b));  // b=5, b2 =4, if b2 > b, false, result -1

System.out.println("b.compareTo(BigDecimal.valueOf(5))=" + b.compareTo(BigDecimal.valueOf(5))); 
// b=5, =5, if b == 5, true, result is 0

System.out.println("5 % 3=" + b.remainder(BigDecimal.valueOf(3)));  //5 % 3 = 2

BigDecimal b13 = BigDecimal.valueOf(5);
BigDecimal b14 = BigDecimal.valueOf(3.456);
BigDecimal b15 = BigDecimal.valueOf(5);
System.out.println("b14.setScale(2, RoundingMode.UP)=" + b14.setScale(2, RoundingMode.UP)); //3.46, since roundup
System.out.println("b14.setScale(2, RoundingMode.DOWN)=" + b14.setScale(2, RoundingMode.DOWN)); //3.45, since rounddown

System.out.println("b13.equals(b15)=" + b13.equals(b15)); // true, 5 == 5
System.out.println(b13==b15); // false

// b14.remainder(, null)

  }
}
