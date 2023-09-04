// 771. Jewels and Stones

// You're given strings jewels representing the types of stones that are jewels, and stones 
// representing the stones you have. Each character in stones is a type of stone you have. 
// You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".



// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3

// Example 2:
// Input: jewels = "z", stones = "ZZ"
// Output: 0
 

// Constraints:
// 1 <= jewels.length, stones.length <= 50
// jewels and stones consist of only English letters.
// All the characters of jewels are unique.

import java.util.Arrays;

public class leetcode771no {
  
  public static int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        int[] count = new int[52];

        // for (char c : jewels.toCharArray()) {
        //     count[c - 'A']++;
        //     System.out.println("++");
        //     System.out.println("count[c - 'A'] count ++ =" + count[c - 'A']);
        //     System.out.println(Arrays.toString(count));
        //     System.out.println();
  
        // }
        // for (char c : stones.toCharArray()) {
        //     count[c - 'A']--;
        //     System.out.println("--");
        //     System.out.println("count[c - 'A'] count -- =" + count[c - 'A']);
        //     System.out.println(Arrays.toString(count));
        //     System.out.println();
        // }
        for (int i = 0; i < stones.length(); i++) {
         stones.indexOf(jewels.charAt(i));
              num ++;
                return num;
            }

            throw new IllegalArgumentException("Invalid input"); // <-- if input is null, then will error
        }

        





  public static void main(String[] args) {
    
    String jewels = "aA";
    String stones = "aAAbbbb";

System.out.println(numJewelsInStones(jewels, stones));

jewels = "aA";
stones = "aAAbbbb";



  }



}
