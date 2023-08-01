

/*
 * 
 * Question : You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 * 
 * Return the sum of all the unique elements of nums.
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 100 1 <= nums[i] <= 100
 */

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] {1, 2, 3, 2})); // 4
    System.out.println(sum(new int[] {1, 1, 1, 1, 1}));// 0
    System.out.println(sum(new int[] {1, 2, 3, 4, 5, 6}));// 21
    System.out.println(sum(new int[] {1}));// 1
  }
  // draft:
  // 重複數字唔計, 單一個就計
  // 用count >1 同count==1去計
  // 跟住result就加arr[i]
  // nested loop?

  public static int sum(int[] nums) {
    // code here
    int sum = 0;
 

    for (int i = 0; i < nums.length; i++) {
      int count = 0; //reset count
      // System.out.println("count reset ="+ count + "\n");
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == nums[i]) {
          count++;
        }
        // System.out.println("i = " + i + " j= " + j + " nums[i]= " + nums[i]+ " nums[j]= " + nums[j]);
        // System.out.println(" sum=" + sum + " count=" + count);
      }
      if (count == 1) {
        sum += nums[i];
      }

    }

    return sum;
  }

// 行哂成個for loop, 每次會check nums[i] == nums[j]
// 如果count高過1就唔計, 如果count只係1就加落去sum




}
