/*
 * Question : Given a string s, return the number of segments in the string.
 * 
 * A segment is defined to be a contiguous sequence of non-space characters.
 * 
 * 
 */

import java.util.Arrays;

public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1


  }

  public static int countWords(String s) {
    // code here

    char[] arr = s.toCharArray();
    int count = 0;

    if (s.isBlank()) {
      return 0;
    } else {
      boolean inWord = false; //先關制做false
      for (int i = 0; i < arr.length; i++) {
        if (Character.isWhitespace(arr[i])) { //當arr遇到空白, inword 就set做false
          inWord = false;
        } else {
          if (!inWord) {// 當arr唔係空白, count++,  
            count++; //
            inWord = true; //跟住set inWord做true, 直至遇到空白就false, 下一隻arr[i]係空白就set做false, 有新字就count++
          }
        }
      }
      return count;
    }
  }

}


