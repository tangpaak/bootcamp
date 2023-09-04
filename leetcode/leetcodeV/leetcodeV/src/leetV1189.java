// LeetCode: 1189
class Solution {
  public int maxNumberOfBalloons(String text) {
      Integer[] count = new Integer[5];
      Arrays.fill(count, 0); // slow
      for (int i = 0; i < text.length(); i++) {
          balloonCount(count, text.charAt(i));
      }
      count[2] /= 2; // if 3 'l' -> 1 'l'
      count[3] /= 2;
      return Arrays.stream(count) //
          .min(Comparator.comparing(Integer::valueOf)) //
          .get()
          ;
  }

  public static void balloonCount(Integer[] arr, char c) {
      if (c == 'b') {
          arr[0]++;
          return;
      }
      if (c == 'a') {
          arr[1]++;
          return;
      }
      if (c == 'l') {
          arr[2]++;
          return;
      }
      if (c == 'o') {
          arr[3]++;
          return;
      }
      if (c == 'n') {
          arr[4]++;
          return;
      }
  }
}
