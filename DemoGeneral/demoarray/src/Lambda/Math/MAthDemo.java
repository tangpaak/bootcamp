package Math;

public class MAthDemo {

  public static int calculate(int i, int j, MathOperation formula) {
    return formula.operate(i, j);

  }

  public static void main(String[] args) {

    MathOperation add = (a, b) -> a + b;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multiply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;
    MathOperation remain = (x, y) -> x % y;

    System.out.println(calculate(1, 3, add)); // 4
    System.out.println(calculate(1, 3, remain)); // 5
    System.out.println(calculate(4, 7, (x, y) -> x * y)); // 28


  }

}
