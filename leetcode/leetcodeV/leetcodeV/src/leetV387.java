// LeetCode: 387
class Solution {
  public int firstUniqChar(String s) {
      int[] arr = new int[26];
      Queue<Character> queue = new LinkedList<>();
      for (int i = 0; i < s.length(); i++) {
          // count
          arr[s.charAt(i) - 'a']++;
          // add to queue
          queue.add(s.charAt(i));
      }
      int idx = -1;
      while(!queue.isEmpty()) {
          ++idx;
          if(arr[queue.poll() - 'a'] == 1)
              return idx;
      }
      return -1;
  }
}
