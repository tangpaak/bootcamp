public class leetV1217 {
  // LeetCode: 1217

  public int minCostToMoveChips(int[] position) {
      int odd = 0;
      int even = 0;
      for (int i = 0; i < position.length; i++) {
        if (position[i] % 2 == 0) {
          even++;
          continue;
        }
        odd++;
      }
      return even > odd ? odd : even;
  }
}

