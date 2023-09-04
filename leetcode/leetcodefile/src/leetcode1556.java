public class leetcode1556 {

  public static String thousandSeparator(int n) {
    StringBuilder sb = new StringBuilder(String.valueOf(n));

    if (sb.length() > 3) {
      for (int i = sb.length() - 3; i > 0; i -= 3) {

        sb.insert(i, '.');
      }
    }

    String str = sb.toString();
    return str;
  }

  public static void main(String[] args) {
    System.out.println(thousandSeparator(987));
    System.out.println(thousandSeparator(1234));

  }


}
