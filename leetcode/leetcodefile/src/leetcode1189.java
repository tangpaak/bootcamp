// 1189. Maximum Number of Balloons

// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

// You can use each character in text at most once. Return the maximum number of instances that can be formed.



// Example 1:



// Input: text = "nlaebolko"
// Output: 1
// Example 2:



// Input: text = "loonbalxballpoon"
// Output: 2
// Example 3:

// Input: text = "leetcode"
// Output: 0


import java.util.Arrays;

public class leetcode1189 {

  public static int maxNumberOfBalloons(String text) {

    int[] count = new int[26];
    for (char c : text.toCharArray()) {
      count[c - 'a']++;

    }

    // Balloon condition if:
    // count[c - 'b']
    // b [1] == 1
    // a [0] == 1
    // l [11] == 2
    // o [14] == 2
    // n [13] == 1
    // countball ++;
    // Determine the maximum number of instances of the word "balloon"

    // Step 2: use math min method to determine:
    int maxballoon = Integer.MAX_VALUE;
    // if any of this is 0, then it will not count balloon, 
    // it pass condition count smaller number (9999, 1)->1, then (1, 3)->1

    // 'b' occurs once in "balloon"
    maxballoon = Math.min(maxballoon, count['b' - 'a']);
    // 'a' occurs once in "balloon"
    maxballoon = Math.min(maxballoon, count['a' - 'a']);
    // 'l' occurs twice in "balloon"
    maxballoon = Math.min(maxballoon, count['l' - 'a'] / 2); // l need two
    // 'o' occurs twice in "balloon"
    maxballoon = Math.min(maxballoon, count['o' - 'a'] / 2);
    // 'n' occurs once in "balloon"
    maxballoon = Math.min(maxballoon, count['n' - 'a']);

    return maxballoon;

  }

  public static void main(String[] args) {
    String text = "nlaebolko";
    System.out.println(maxNumberOfBalloons(text)); // 1
    text = "loonbalxballpoon";
    System.out.println(maxNumberOfBalloons(text)); // 2
    text = "leetcode";
    System.out.println(maxNumberOfBalloons(text)); // 0
    text = "ballon";
    System.out.println(maxNumberOfBalloons(text)); // 0
    text = "balloonballoon";
    System.out.println(maxNumberOfBalloons(text)); // 2



  }
}
