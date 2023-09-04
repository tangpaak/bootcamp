// LeetCode: 2085
class Solution {
  public int countWords(String[] words1, String[] words2) {
      // HashMap
      Map<String, Integer> map = new HashMap<>();
      for (int i = 0; i < words1.length; i++) {
          if (!map.containsKey(words1[i]))
              map.put(words1[i], 1);
          else
              map.put(words1[i], -1); // fail
      }
      for (int i = 0; i < words2.length; i++) {
          if (map.containsKey(words2[i]))
              map.put(words2[i], map.get(words2[i]) - 1);
      }
      return (int) map.values().stream()
          .filter(e -> e.equals(0))
          .count();
  }
}