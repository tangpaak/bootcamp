package general;
import java.util.Random;

public class Random1 {

  // A, B, C, D, E // 
//Approach 1
  public static char randomAbcde() {
// char[] chars = new char[] {'A', 'B', 'C', 'D','E'};
// int idx = new Random().nextInt(5);
// }

//Appoach 2:
return(char) (new Random().nextInt (5) + 65);
  }



  public static void main(String [] args){

int num = new Random(). nextInt(3); // 出三個數字 0, 1, 2
System.out.println (num);
//1 - 3 ?

int num2 = new Random(). nextInt(3) + 1; // 1 , 2 , 3
System.out.println(num2);

  System.out.println(randomAbcde());


// 
int[] classA = new int [] {20, 30, 80};
int[] classB = new int [] {90, 30, 100};

// if (average(classA) > average(classB)){
//   System.out.println("Class A average score higher than Class B.");
// }


  }





  
}
