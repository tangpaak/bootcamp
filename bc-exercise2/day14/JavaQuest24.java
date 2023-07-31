

/*
 * 
 * Question : Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
 * 
 * The value of |x| is defined as:
 * 
 * x if x >= 0. -x if x < 0.
 * 
 */

// hints : Math.abs() is a method to find absolute value
public class JavaQuest24 {
  public static void main(String[] args) {
    System.out.println(absolute(new int[] {1, 2, 2, 1}, 1)); // 4
    System.out.println(absolute(new int[] {3, 2, 1, 5, 4}, 2));// 3
    System.out.println(absolute(new int[] {5, 3, 1}, 1));// 0

  }
  
  // draft: 
  // 用nested loop去行個array計數
  // 1要減2 1再減2 1再減1, 2要減2 2再減1, 2再減1 (target係1, 將所有負數absolute)
  // result ++ if target hit

  public static int absolute(int[] nums, int target) {

    int count = 0;
    int absnum = 0;
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      // i = 1
      // System.out.println("outside i =" + i);

      for (int j = 0; j < nums.length; j++) {
        // j = 0
        if (j == nums.length - 1 && i == nums.length - 1) {
          break;
        }

        if (j >= i) {
          count = nums[i] - nums[j];
          // System.out.println(count);
          absnum = Math.abs(count);
          // System.out.println(absnum);
          if (absnum == target) {
            result++;
          }
          // System.out.println(result);
          // System.out.println("i =" + i + "j=" + j);
        }
      }
    }
    // System.out.println("result is =" + result) ;
    return result;

  }
}
