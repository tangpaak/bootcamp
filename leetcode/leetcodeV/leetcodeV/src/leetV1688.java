// LeetCode: 1688
class leetV1688 {
  public int numberOfMatches(int n) {
      int matches = 0;
      int team = n;
      while (team > 1) {
          matches += team / 2;
          team = team % 2 == 0 ? team / 2 : team / 2 + 1;
      }
      return matches;
  }
}
