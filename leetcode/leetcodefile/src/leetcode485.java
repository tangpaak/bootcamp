import java.util.Arrays;

public class leetcode485 {

  // 485. Max Consecutive Ones
  // Easy
  // 4.8K
  // 436
  // Companies
  // Given a binary array nums, return the maximum number of consecutive 1's in the array.



  // Example 1:

  // Input: nums = [1,1,0,1,1,1]
  // Output: 3
  // Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
  // Example 2:

  // Input: nums = [1,0,1,1,0,1]
  // Output: 2


  // Constraints:

  // 1 <= nums.length <= 105
  // nums[i] is either 0 or 1.



  public static int findMaxConsecutiveOnes(int[] nums) {

    int countOne = 0;
    int L = nums.length;
    int max = 0;
    int min = 0;

    for (int i = 0; i < L; i++) {
      if (nums[i] == 1) {
        countOne++;
        if (countOne > max) {
          min = max;
          max = countOne;
        }

      }

      if (nums[i] == 0) {
        countOne = 0; // reset countone
      }

    }
    System.out.println("Min=" + min);
    return max; // need int number result


  }


  public static void main(String[] args) {

    int[] nums1 = new int[] {1, 1, 0, 1, 1, 1};
    int[] nums2 = new int[] {1, 0, 1, 1, 0, 1};

    System.out.println(findMaxConsecutiveOnes(nums1));
    System.out.println(findMaxConsecutiveOnes(nums2));



  }



}
