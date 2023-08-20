/*
 * In a string s of lowercase letters, these letters form consecutive groups of the same character.
 * 
 * For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
 * 
 * A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].
 * 
 * A group is considered large if it has 3 or more characters.
 * 
 * Return the intervals of every large group sorted in increasing order by start index.
 * 
 * 
 * 
 * Example 1: Input: s = "abbxxxxzzy" Output: [[3,6]] Explanation: "xxxx" is the only large group with start index 3 and end index 6.
 * 
 * Example 2: Input: s = "abc" Output: [] Explanation: We have groups "a", "b", and "c", none of which are large groups.
 * 
 * Example 3: Input: s = "abcdddeeeeaabbbcd" Output: [[3,5],[6,9],[12,14]] Explanation: The large groups are "ddd", "eeee", and "bbb".
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000 s contains lowercase English letters only.
 */

import java.util.ArrayList;
import java.util.List;

public class JavaQuest51 {
  public static void main(String[] args) {
    System.out.println(largeGroupPositions("abbxxxxzzy"));// [[3, 6]]
    System.out.println(largeGroupPositions("abc"));// []
    System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));// [[3, 5], [6, 9], [12, 14]]
    System.out.println(largeGroupPositions("bbbaaadddxxxxppp"));// [[0,2],[3,5],[6,8],[9,12],[13,15]]
    System.out.println(largeGroupPositions("aaabbbcccddd"));// [[0,2],[3,5],[6,8],[9,11]]

  }

  public static List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> result = new ArrayList<>();
    int start = 0;
    int end = 0;
    int n = s.length();

    for (int i = 0; i < n; i++) {
      if (s.charAt(end) != s.charAt(start)) {
        if (end - start >= 3) {
          List<Integer> interval = new ArrayList<>();
          interval.add(start);
          interval.add(end - 1);
          result.add(interval); // 係最出既List加番呢個charAt數字入去
        }
        start = end;
      }
      end++;
    }

    // Check for the last group
    if (end - start >= 3) {
      List<Integer> interval = new ArrayList<>();
      interval.add(start);
      interval.add(end - 1);
      result.add(interval);
    }

    return result;
  }
}


