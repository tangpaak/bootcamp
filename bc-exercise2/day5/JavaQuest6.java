/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a = 1;
    int b = 1; 
    System.out.println(a);
    System.out.println(b);
    for(int i = 2; i < 15; i++){
      int c = a + b;
      System.out.println(c);
      a = b;
      b = c;

      }
    } 






  }
