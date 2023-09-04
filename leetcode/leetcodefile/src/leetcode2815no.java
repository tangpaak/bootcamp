// 2815. Max Pair Sum in an Array
// Easy
// 201
// 71
// Companies
// You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.

// Return the maximum sum or -1 if no such pair exists.

 

// Example 1:

// Input: nums = [51,71,17,24,42]
// Output: 88
// Explanation: 
// For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
// For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
// It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
// Example 2:

// Input: nums = [1,2,3,4]
// Output: -1
// Explanation: No pair exists in nums with equal maximum digits.
 

// Constraints:

// 2 <= nums.length <= 100
// 1 <= nums[i] <= 104

public class leetcode2815no {
  // LeetCode: 2815

  public int maxSum(int[] nums) {
      // O(n^2)
      int currMaxDigit = -1;
      int maxSum = -1;
      int currentMaxSum = -1;
      int[] digits = new int[9];
      // [51,71,17,74,24,42]
      for (int i = 0; i < nums.length - 1; i++) {
          currMaxDigit = maxDigit(nums[i]); // 7
          // if (digits[currMaxDigit - 1] > 0)
          //     continue;
          // digits[currMaxDigit - 1]++;
          for (int j = i + 1; j < nums.length; j++) {
              // System.out.println(maxDigit(nums[i]));
              if (currMaxDigit == maxDigit(nums[j])) {
                  if (nums[i] + nums[j] > currentMaxSum) // 145 vs 88
                      currentMaxSum = nums[i] + nums[j];
              }
          }
          if (currentMaxSum > maxSum) // 145 vs 66
              maxSum = currentMaxSum;
      }
      return maxSum;
  }

  public static int maxDigit(int num) {
      int maxDigit = -1;
      while (num > 0) {
           if (num % 10 > maxDigit)
              maxDigit = num % 10;
           num = num / 10;
      }
      return maxDigit;
  }

  public static int sumOfDigit(int num) {
      // Approach 1: while()
      // int sum = 0;
      // while (num > 0) {
      //     sum += num % 10;
      //     num = num / 10;
      // }
      // return sum;
      // Approach 2: String.valueOf()
      String str = String.valueOf(num);
      int sum = 0;
      for (int i = 0; i < str.length(); i++) {
          sum += str.charAt(i) - '0';
      }
      return sum;
  }
}

