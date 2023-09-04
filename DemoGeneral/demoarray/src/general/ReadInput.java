package general;
import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    String str = "Hello";
    str.charAt(0); // H

    // Scanner-> read user input
    System.out.println("Please input an integer:"); // asking to input something
    Scanner s = new Scanner(System.in); // adding scanner
    int input = s.nextInt(); // read user input, expecting it is an integer
    System.out.println("input=" + input);
    // then will show what your input is
    
    //
    for (int i = 0; i < input; i++) {
      System.out.println("Hello!");
    }
    //



  }

}
