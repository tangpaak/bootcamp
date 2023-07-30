/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after N shifts on s.
 * 
 * Definition of a shift: Moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * Assume the input need to be lowercase English letters.
 */

import java.util.Arrays;

public class JavaQuest20 {

  public static void main(String[] args) {

    // System.out.println(rotateString("abcde", "bcdea"));// true
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  // "abcde" -> "bcdea"
  // temp = arr[0] saved a first
  // arr[0]= arr[1] bbcde
  // arr[1]= arr[2] bccde
  // arr[2]= arr[3] bcdde
  // arr[3]= arr[4] bcdee
  // arr[4]= temp bcdea

  public static boolean rotateString(String s, String goal) {

    char[] arr = s.toCharArray();
    char[] goalarr = goal.toCharArray();
    char temp = ' ';
   
// for(int j = 0; j < arr.length; j ++){
      for (int i = 0; i < arr.length; i++) {
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = temp;

        String a = Arrays.toString(arr);
        String b = Arrays.toString(goalarr);

        if (a.equals(b)) {
          return true;
        }
        
      }return false;
     

    }


  }

