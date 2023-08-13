
/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Example 2: Input: nums = [0] Output: [0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1
 */

import java.util.Arrays;

public class JavaQuest35 {

  public static void main(String[] args) {
    int[] nums1 = {0, 1, 0, 3, 12};
    moveZeroes(nums1);
    System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

    int[] nums2 = {0};
    moveZeroes(nums2);
    System.out.println(Arrays.toString(nums2)); // Output: [0]
  }

  private static void moveZeroes(int[] nums) {
    int i = 0; // pointer for non-zero elements

    // Move non-zero elements to the front of the array
    for (int j = 0; j < nums.length; j ++){
      if (nums[j] != 0) {
        nums[i] = nums[j];
        i++; //i 一路加加 加到全部數字都有咁排
      }
    }

    // Fill the remaining elements with zeros
    while (i < nums.length) { //當排哂所有大過0既數字時, 將0再全部啪番落剩餘既位置度
      nums[i] = 0;
      i++;
    }
  }

}
