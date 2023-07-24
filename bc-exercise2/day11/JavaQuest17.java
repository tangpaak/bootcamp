/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5.
 * Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 :
 * Input : num = 3535
 * Output : 3333
 * 
 * Example 2 :
 * Input: num = 5555
 * Output: 3355
*/

import java.util.Arrays;

public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {

String str = String.valueOf(num); //將num轉左做String先
char[] chars = str.toCharArray();//再將String轉做Array

int count = 0; //用於限制2次數目

for (int i = 0; i < chars.length; i++) {
  if (chars[i] == '5' && count < 2){
chars[i] = '3';
count++;
  }
  else if (chars[i] == '3') {

  }

  }    
  String res = String.valueOf(chars); // 將chars轉番做String先
  int result = Integer.valueOf(res); //再將String轉做Int [Integer.valueof()]
  return result;
}


}