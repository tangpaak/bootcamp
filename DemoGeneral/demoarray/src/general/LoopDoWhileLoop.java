package general;
import java.util.Scanner;

public class LoopDoWhileLoop {
  
  public static void main(String[] args){

// *** Do-While Loop
// do-while, mean do first, then check condition to start looping

int count = 0;
do {
  System.out.println("hello, count time=" + count ); //無條件print hello
  count++ ;

} while (count <= 1 ); //做到不大於3就停止

// example of do-while
int input = 0;
do {
Scanner scanner = new Scanner(System.in);
System.out.println("Please a intefer:");
input = scanner.nextInt();
//if input is even -> contineue
// odd -> exit loop and print the number

} while (input % 2 == 0);
 System.out.println("input=" + input);



 
}







  }



