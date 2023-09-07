// 2418. Sort the People

// You are given an array of strings names, and an array heights that consists
// of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.



// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


// Constraints:

// n == names.length == heights.length
// 1 <= n <= 103
// 1 <= names[i].length <= 20
// 1 <= heights[i] <= 105
// names[i] consists of lower and upper case English letters.
// All the values of heights are distinct.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class leetcode2418 {

  public static String[] sortPeople(String[] names, int[] heights) {

    HashMap<Integer, String> map1 = new HashMap<>();
    for (int i = 0; i < names.length; i++) {
      String name = names[i];
      int height = heights[i];
      map1.put(height, name);
    }
    // i. Array way: (faster)
    Arrays.sort(heights); // sort by asscend way first
    String[] Sortednames = new String[names.length];
    for (int i = 0; i < names.length; i++) {
      Sortednames[i] = map1.get(heights[names.length - 1 - i]);
      // come from last value first

    }
    return Sortednames;

    // ii. Stream way:
    // List<Map.Entry<Integer,String>> sortedEntries = map1.entrySet()
    // .stream()
    // .sorted((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()))
    // .toList();

    // String[] sortedNames = new String[sortedEntries.size()];
    // for (int i = 0; i < sortedEntries.size(); i++) {
    // sortedNames[i] = sortedEntries.get(i).getValue();
    // }

    // return sortedNames;

  }



  public static void main(String[] args) {
    String[] names = {"Mary", "John", "Emma"};
    int[] heights = {180, 165, 170};
    System.out.println(Arrays.toString(sortPeople(names, heights)));



  }
}
