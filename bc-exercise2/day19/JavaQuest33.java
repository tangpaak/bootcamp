/*
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * 
 * Return any array that satisfies this condition.
 * 
 * Example 1: Input: nums = [3,1,2,4] Output: [2,4,3,1] Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * Example 2: Input: nums = [0] Output: [0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 5000 0 <= nums[i] <= 5000
 */

import java.util.Arrays;

public class JavaQuest33 {
  public static void main(String[] args) {
    System.out.println(sortArrayByParity(new int[] {0}));
    System.out.println(sortArrayByParity(new int[] {1, 2, 3, 4})); // output [4,2,1,3] or [2,4,3,1]
    System.out.println(sortArrayByParity(new int[] {111, 2, 309, 4, 1})); // output [4,2,309,111] or [2,4,111,309]
    System.out
    .println(sortArrayByParity(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 100}));
    // output
    // [100,2,8,4,6,7,5,9,3,1]
    // or [2,4,6,8,100,1,3,5,7,9]


  }

  // draft:
  // arr [i] % 2 ==0 , arr[i] % 2 ==1
  // Bubble sort?
  // for loop 1 time or 2 times?
  // if arr[i] = 0 , return original
  // if arr[length = 0] , return original



  public static String sortArrayByParity(int[] nums) {
    // (new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 100}));

    // int startcount = 0;
    // int endcount = nums.length - 1;
    // int temp1 = 0;
    // int temp2 = 0;

    // for (int i = 0; i <= nums.length/2; i++) {

    // if (nums[i] % 2 == 0) {
    // temp1 = nums[startcount];
    // nums[startcount] = nums[i];
    // nums[i] = temp1;
    // startcount++;
    // System.out.print("[i]= " + i + " ");
    // System.out.println("nums[i]= " + nums[i]);
    // System.out.println("temp1 =" + temp1);
    // System.out.print("startcount= " + startcount + " ");
    // System.out.println("nums[startcount]= " + nums[startcount]);
    // System.out.println("start" + Arrays.toString(nums));
    // System.out.println();
    // }

    // else if (nums[i] % 2 == 1) {
    // temp2 = nums[endcount];
    // nums[endcount] = nums[i];
    // nums[i] = temp2;
    // endcount--;

    // System.out.print("[i]= " + i + " ");
    // System.out.println("nums[i]= " + nums[i]);
    // System.out.println("temp2 =" + temp2);
    // System.out.print("endcount= " + endcount + " ");
    // System.out.println("nums[endcount]= " + nums[endcount] + " ");
    // System.out.println("end" + Arrays.toString(nums));
    // System.out.println();
    // }
    // }

    // return Arrays.toString(nums);

    // another way

    int i = 0;
    int j = nums.length - 1;
    int temp = 0;

    while (i < j) {
      // System.out.println("before:");
      // System.out.print("[i]= " + i + " ");
      // System.out.println("nums[i]= " + nums[i]);
      // System.out.print("[j]= " + j + " ");
      // System.out.println("nums[j]= " + nums[j]);
      // System.out.println("temp =" + temp);
      // System.out.println("end" + Arrays.toString(nums));
      // System.out.println();

      if (nums[i] % 2 == 1 && nums[j] % 2 == 0) { //nums[i]單數 nums[j]雙數, 乎合條件就會對調
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++; //再拉近一格
        j--;
      } else if (nums[i] % 2 == 0) { //如果岩位置就會skip, 跳落下一格
        i++;
      } else if (nums[j] % 2 == 1) { //如果岩位置就會skip, 跳落上一格
        j--;
      }
      // System.out.println("after:");
      // System.out.print("[i]= " + i + " ");
      // System.out.println("nums[i]= " + nums[i]);
      // System.out.print("[j]= " + j + " ");
      // System.out.println("nums[j]= " + nums[j]);
      // System.out.println("temp =" + temp);
      // System.out.println("end" + Arrays.toString(nums));
      // System.out.println();

    }

    return Arrays.toString(nums);

  }


// Question : {111, 2, 309, 4, 1}
// process:

//  hit situation 3
// [i]= 0 nums[i]= 111
// [j]= 3 nums[j]= 4 <- 1係單數所以唔換, 之後j-- 由4變左3, 所以依家指住nums[3]係4
// temp =0
// end[111, 2, 309, 4, 1]

// hit situation 1
// [i]= 1 nums[i]= 2
// [j]= 2 nums[j]= 309
// temp =111
// end[4, 2, 309, 111, 1]


// hit situation 1
// [i]= 2 nums[i]= 309
// [j]= 2 nums[j]= 309
// temp =111
// end[4, 2, 309, 111, 1]

// [4, 2, 309, 111, 1]




}
