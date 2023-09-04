package unchecked1;
public class DemoArithmeticException {

  public static void main(String[] args) {
    int i = 0;
    int n = 100;
    int result = 0;

    try {
      result = n / i;
    } catch (ArithmeticException e) { // 或者放finally係度
      result = 0;
    }

    System.out.println("result= " + result); // result is 0

  }



}
