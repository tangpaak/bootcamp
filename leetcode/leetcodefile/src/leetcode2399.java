// 2399. Check Distances Between Same Letters

// You are given a 0-indexed string s consisting of only lowercase English letters,
// where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.

// Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

// In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i].
// If the ith letter does not appear in s, then distance[i] can be ignored.

// Return true if s is a well-spaced string, otherwise return false.


// Example 1:

// Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// Output: true
// Explanation:
// - 'a' appears at indices 0 and 2 so it satisfies distance[0] = 1.
// - 'b' appears at indices 1 and 5 so it satisfies distance[1] = 3.
// - 'c' appears at indices 3 and 4 so it satisfies distance[2] = 0.
// Note that distance[3] = 5, but since 'd' does not appear in s, it can be ignored.
// Return true because s is a well-spaced string.
// Example 2:

// Input: s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// Output: false
// Explanation:
// - 'a' appears at indices 0 and 1 so there are zero letters between them.
// Because distance[0] = 1, s is not a well-spaced string.


// Constraints:

// 2 <= s.length <= 52
// s consists only of lowercase English letters.
// Each letter appears in s exactly twice.
// distance.length == 26
// 0 <= distance[i] <= 50

import java.util.Arrays;

class leetcode2399 {

  // Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
  // Output: true

  // public static boolean checkDistances(String s, int[] distance) {

  // int[] intArray = new int[s.length()];

  // for (int i = 0; i < s.length(); i++) {
  // intArray[i] = s.charAt(i);
  // }

  // System.out.println(Arrays.toString(intArray)); // Output: [97, 98, 97, 99, 99, 98]
  // //
  // int[] arr = new int[26];
  // int distance1 = 0;
  // int sum = 0;

  // for (char c : s.toCharArray()) {
  // distance1++;
  // arr[c - 'a'] = distance1;
  // distance1 = 0;
  // sum += distance1;
  // // System.out.println("count[c - 'a'] count ++ =" + arr[c - 'a']);
  // }
  // System.out.println(sum);
  // System.out.println(Arrays.toString(arr));


  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] != 0) {
  // return false;
  // }
  // }
  // throw new IllegalArgumentException("Invalid input"); // <-- if input is null, then will error
  // // array同String會常用既


  // }


    public static boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        int[] lastIndices = new int[26];
        Arrays.fill(lastIndices, -1);
        System.out.println("before");
        System.out.println(Arrays.toString(lastIndices));

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (lastIndices[index] != -1 && i - lastIndices[index] - 1 != distance[index]) {
                return false;
            }
            lastIndices[index] = i;
            System.out.println("After:");
            System.out.println(Arrays.toString(lastIndices));
        }

        return true;
    }

  public static void main(String[] args) {

    String s = "abaccb";
    int[] distance = new int[] {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    System.out.println(checkDistances(s, distance)); //true

    // s = "aa";
    // distance = new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    // System.out.println(checkDistances(s, distance)); //false

  }
}
