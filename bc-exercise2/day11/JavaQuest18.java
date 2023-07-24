/*
 * 
 * Question : Given an array of strings words, 
 * return the first palindromic(對稱) string in the array.
 *  If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 *  words[i] consists only of lowercase English letters.*/

import java.util.Arrays;

public class JavaQuest18 {
  public static void main(String[] args) {
    String[] testCase1 = new String[] { "abc", "car", "ada", "racecar", "cool" };
    String[] testCase2 = new String[] { "notapalindrome", "racecar" };
    String[] testCase3 = new String[] { "ADABCCBADA", "car", "ada", "racecar" };
    String[] testCase4 = new String[] { "abc" };

    // System.out.println(isPalindrome("racecar")); //test: true
    // System.out.println(isPalindrome("abc")); //test: false
    // System.out.println(""); // next line

    // String abc = "abc"; //test abc
    // char [] chars = abc.toCharArray();
    // System.out.println(chars); //test

    System.out.println(firstPalindrome(testCase1)); // Output : "ada"
    System.out.println(firstPalindrome(testCase2)); // Output : "racecar"
    System.out.println(firstPalindrome(testCase3)); // Output : "ADABCCBADA"
    System.out.println(firstPalindrome(testCase4)); // Output : "No Palindrome word in String Array."

  }

  private static boolean isPalindrome(String s) {
    // hints : if a String is Palindrome , return true 
    // 
    for(int i = 0; i < s.length(); i++){
if (s.charAt(i) != s.charAt(s.length()-1-i)){
  return false;
}
    } return true;
  }

  public static String firstPalindrome(String[] words) {
// hints : finish the logic by using isPalindrome() , for-loop , if-else 

for (int i = 0; i < words.length ; i++){
if (isPalindrome(words[i]) == true){

  return words[i];
}

}

    return "No Palindrome word in String Array.";
  }

}