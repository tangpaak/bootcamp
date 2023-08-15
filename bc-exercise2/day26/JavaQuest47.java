import java.util.HashMap;
import java.util.Map;

/*Given a string s, find the first non-repeating character in it and return its index. 
If it does not exist, return -1.


Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters */

public class JavaQuest47 {
  public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode"));// 0
    System.out.println(firstUniqChar("loveleetcode"));// 2
    System.out.println(firstUniqChar("aabb"));// -1
  }

  public static int firstUniqChar(String s) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    // Count the frequency of each character
    for (char ch : s.toCharArray()) {
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    // Find the index of the first non-repeating character
    for (int i = 0; i < s.length(); i++) {
        if (frequencyMap.get(s.charAt(i)) == 1) {
            return i;
        }
    }

    return -1; // No non-repeating character found
}
}
