package general;
import java.util.Scanner;

public class Productsequence {
  public static void main(String[] args) {
//0,1,2,3,4,5...
//print out 0,2,6,12,20...
int count = 0;

for(int i = 1; i <6; i++){
  System.out.println(count * i);
count = count + 1;

}




  }
}