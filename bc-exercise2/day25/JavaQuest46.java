/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */
public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] {2, 5, 6, 9, 10}));
    System.out.println(findGCD(new int[] {7, 5, 6, 8, 3}));
    System.out.println(findGCD(new int[] {3, 3}));

  }

  public static int findGCD(int[] nums) {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

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

