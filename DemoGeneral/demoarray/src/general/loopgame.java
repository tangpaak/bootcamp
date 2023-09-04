package general;
import java.util.Random;
import java.util.Scanner;

public class loopgame {
  public static void main (String[] args){
    
// 1-100
// bomb = 45 (Random Number)
// First Round: Please input a number (1-100):

// User input: 30
// Next Round: Please input a number (31-100):

// User input: 60
// Next Round: Please input a number (31-59):

// User input 45
// exit loop. Bomb!

int min = 1;
int max = 100;
int bomb = 45;
int input = 0;

do{

Scanner scanner = new Scanner(System.in);
System.out.println("Please pick a number from "+ min + " to " + max);
input = scanner.nextInt();

if (input < bomb && min < input){ 
    min = input + 1;
}
if (input > bomb && max > input){
    max = input - 1;
}

   } while (input != bomb);
   System.out.println("You hit the bomb!");


}
  }

