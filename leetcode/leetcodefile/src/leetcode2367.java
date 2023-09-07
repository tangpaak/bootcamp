// 2367. Number of Arithmetic Triplets

// You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
// A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

// i < j < k,
// nums[j] - nums[i] == diff, and
// nums[k] - nums[j] == diff.
// Return the number of unique arithmetic triplets.



// Example 1:

// Input: nums = [0,1,4,6,7,10], diff = 3
// Output: 2
// Explanation:
// (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
// (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
// Example 2:

// Input: nums = [4,5,6,7,8,9], diff = 2
// Output: 2
// Explanation:
// (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
// (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.


// Constraints:

// 3 <= nums.length <= 200
// 0 <= nums[i] <= 200
// 1 <= diff <= 50
// nums is strictly increasing.


public class leetcode2367 {



  public static int arithmeticTriplets(int[] nums, int diff) {

    // Input: nums = [0,1,4,6,7,10], diff = 3
    // Output: 2

    int count = 0;

    for (int k = nums.length - 1; k > 0; k--) {
      for (int j = nums.length - 2; j > 0; j--) {

for(int i = nums.length-3; i >0; i--){

        System.out.println("i= " + i + ", nums= " + nums[i]);
        System.out.println("j= " + j + ", nums= " + nums[j]);
        System.out.println("k= " + k + ", nums= " + nums[k]);
        System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
        System.out.println();

        if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff)
          count++;
      }
    }
    }
    return count;

  }


  public static void main(String[] args) {

    int[] nums = new int[] {0, 1, 4, 6, 7, 10};
    int diff = 3;

    System.out.println(arithmeticTriplets(nums, diff));

    nums = new int []{4,5,6,7,8,9};
    diff = 2;
    System.out.println(arithmeticTriplets(nums, diff));



  }

}
