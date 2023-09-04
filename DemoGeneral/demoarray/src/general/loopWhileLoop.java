package general;
import java.util.Scanner;

public class loopWhileLoop {

  public static void main(String[] args) {

    // ** While loop - example
    int count = 0;
    while (count < 5) { // continue condition: true / false
      count++;
    }
    System.out.println(count);
    // count = 5


    // Boolean - while
    boolean isHoliday = false;
    int counter = 0;

    while (!isHoliday) { // Is not Holiday
      System.out.println("counter=" + counter);
      counter++; // counter 一路++

      if (counter >= 6) { // 當 counter大過或等於6既時候, isHoliday就會係true
        isHoliday = true;
      }
    }

    // While loop 有樣野好過For loop, 就係可以加條件

    int c = 0;
    while (c >= 0 && c < 5) {
      System.out.println(c);
      c++;
    }
    //

    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }
    // print 10次hello, A有5次 B就係唔係都10次


    // ** break, continue;

    // break
    int k = 0;
    while (k < 6) {
      System.out.println("break: hello");
      k++;
      if (k > 3) {
        break;
      }
    }

    // continue
    int j = 0;
    while (j < 6) {
      j++;
      if (j > 3) {
        continue;
      }
      System.out.println("continue: hello");
    }



    // do-while loop
    int number = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter a positive number: ");
      number = scanner.nextInt();
    } while (number <= 0);
    System.out.println("You entered a positive number: " + number);


    //



  }
}
