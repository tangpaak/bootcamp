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

public class leetV771 {

  public static int numJewelsInStones(String jewels, String stones) {

    int[] counts = new int[58]; // 26 + 26 + 6, ASCII =  65(A)-122 (z)
    
    for (int i = 0; i < jewels.length(); i++) {
      counts[jewels.charAt(i) - 'A']++;

    }
    System.out.println(Arrays.toString(counts));
    System.out.println();
    //
    int sum = 0;
    for (int i = 0; i < stones.length(); i++) {
      if (counts[stones.charAt(i) - 'A'] > 0)//
        sum++;
    }
    System.out.println(Arrays.toString(counts));
    return sum;

  }



  public static void main(String[] args) {

    String jewels = "aA";
    String stones = "aAAbbbb";

    System.out.println(numJewelsInStones(jewels, stones));

    jewels = "aA";
    stones = "aAAbbbb";



  }



}
