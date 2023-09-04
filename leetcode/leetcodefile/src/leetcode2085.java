// 2085. Count Common Words With One Occurrence

// Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.



// Example 1:

// Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
// Output: 2
// Explanation:
// - "leetcode" appears exactly once in each of the two arrays. We count this string.
// - "amazing" appears exactly once in each of the two arrays. We count this string.
// - "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
// - "as" appears once in words1, but does not appear in words2. We do not count this string.
// Thus, there are 2 strings that appear exactly once in each of the two arrays.
// Example 2:

// Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
// Output: 0
// Explanation: There are no strings that appear in each of the two arrays.
// Example 3:

// Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
// Output: 1
// Explanation: The only string that appears exactly once in each of the two arrays is "ab".


// Constraints:

// 1 <= words1.length, words2.length <= 1000
// 1 <= words1[i].length, words2[j].length <= 30
// words1[i] and words2[j] consists only of lowercase English letters.

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class leetcode2085 {


  // public static int countWords(String[] words1, String[] words2) {

  //   // // HashSet copy

  //   Set<String> duplicateSet = new HashSet<>();
  //   Set<String> uniqueSet = new HashSet<>();
  //   Set<String> commonSet = new HashSet<>();

  //   //step 1:
  //   Set<String> uniqueWords1 = new HashSet<>();
  //   Set<String> uniqueWords2 = new HashSet<>();



  //   for (String word : words1) {
  //     if(uniqueWords1.contains(word)){
  //       uniqueWords1.remove(word);
  //     } 
  //     else{
  //     uniqueWords1.add(word);
  //     }

  //   }

  //   for (String word : words2) {
  //     if(uniqueWords2.contains(word)){
  //       uniqueWords2.remove(word);
  //     } 
  //     else{
  //     uniqueWords2.add(word);
  //     }
  //   }

  //   System.out.println("unique1=" + uniqueWords1);
  //   System.out.println("unique2=" + uniqueWords2);

  //   // step 2
  //   for (String word : uniqueWords1) {
  //     if (!duplicateSet.contains(word)) {
  //       duplicateSet.add(word);

  //     } else {
  //       uniqueSet.add(word);
  //     }
  //   }

  //   for (String word : uniqueWords2) {
  //     if (duplicateSet.contains(word)) {
  //       commonSet.add(word);

  //     } else {
  //       uniqueSet.add(word);
  //     }
  //   }

  //   // System.out.println(duplicateSet);
  //   // System.out.println(uniqueSet);
  //   // System.out.println(commonSet);

  //   //Step 3: counting
  //   int count = 0;
  //   for (String word : commonSet) {
  //     if (commonSet.contains(word)) {
  //       count++;
  //     }
  //   }

  //   return count;
  // }


  public static int countWords(String[] words1, String[] words2) {
    // Step 1: Count occurrences in both arrays
    Map<String, Integer> countMap = new HashMap<>();

    for (String word : words1) {
        countMap.put(word, countMap.getOrDefault(word, 0) + 1);
    }

    for (String word : words2) {
        countMap.put(word, countMap.getOrDefault(word, 0) + 1);
    }

    // Step 2: Count words that appear exactly once
    int count = 0;
    for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
        if (entry.getValue() == 2) { // Word appears exactly once in both arrays
            count++;
        }
    }

    return count;
}


  public static void main(String[] args) {

    String[] words1 = new String[] {"leetcode", "is", "amazing", "as", "is"};
    String[] words2 = new String[] {"amazing", "leetcode", "is"};
    System.out.println(countWords(words1, words2));

    words1 = new String[] {"b", "bb", "bbb"};
    words2 = new String[] {"a", "aa", "aaa"};
    System.out.println(countWords(words1, words2));

    words1 = new String[] {"a","ab"}; 
    words2 = new String[] {"a","a","a","ab"};
    System.out.println(countWords(words1, words2));



  }



}
