package String1;

import java.util.Arrays;

public class CharArrmethod {
  public static char findTheDifference(String s, String t) {
        
    int[] count = new int[26];
    for (char c : s.toCharArray()) {
        count[c - 'a']++;
        System.out.println("count[c - 'a'] count ++ =" + count[c - 'a']);
        System.out.println(Arrays.toString(count));

    }
    for (char c : t.toCharArray()) {
        count[c - 'a']--;
        System.out.println("count[c - 'a'] count -- =" + count[c - 'a']);
        System.out.println(Arrays.toString(count));
    }
    for (int i = 0; i < count.length; i++) {
        if (count[i] != 0) {
            return (char) (i + 'a');
        }
    }
    throw new IllegalArgumentException("Invalid input"); // <-- if input is null, then will error
    //array同String會常用既
}
    

public static void main(String [] args){

System.out.println(findTheDifference("abcd", "abcde"));



}
}
