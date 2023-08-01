

/*
 * Question : Given an integer n, add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format.
 */
/*
 * Constraints:
 * 
 * 0 <= n <= 231 - 1
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  // draft:
  // StringBuilder?? insert??
  // add $ at last
  // i-- for loop -> count + 3 to add ',' (from right to left to count)

  public static String separator(int n) {
    // code here
    StringBuilder sb = new StringBuilder(String.valueOf(n));

    if (sb.length() > 3) {
      for (int i = sb.length() - 3; i > 0; i -= 3) { // 第一個i位置係sb.length()－3, 右邊數向左邊
        // System.out.println("i=" + i);
        sb.insert(i, ','); // 插','入第3個位, 之後i--3
      }
    }
    String str = sb.toString();
    return '$' + str;

    // another way:
    // DecimalFormat formatter = new DecimalFormat("#,###");
    // String str = formatter.format(n);
    // return '$' + str;

  }

}
