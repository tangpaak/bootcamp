/*
* Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.


Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

Example 3:
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.

Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000
*/
public class JavaQuest49 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] { 2, 5, 6, 9, 10 }));// 2
    System.out.println(findGCD(new int[] { 7, 5, 6, 8, 3 }));// 1
    System.out.println(findGCD(new int[] { 3, 3 }));// 3
    System.out.println(findGCD(new int[] { 10, 100, 1000 }));// 10
    System.out.println(findGCD(new int[] { 99, 999 }));// 9

  }

  public static int findGCD(int[] nums) {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    // Find the smallest and largest numbers in the array
    for (int num : nums) {
        smallest = Math.min(smallest, num);
        largest = Math.max(largest, num);
    }

    return gcd(smallest, largest);
}

private static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
}


