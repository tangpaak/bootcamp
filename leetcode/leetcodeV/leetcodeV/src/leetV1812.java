public class leetV1812 {
  // LeetCode: 1812

  public boolean squareIsWhite(String coordinates) {
      int columnInAscii = coordinates.charAt(0);
      int row = coordinates.charAt(1);
      return (columnInAscii + row) % 2 == 1;
  }
}

