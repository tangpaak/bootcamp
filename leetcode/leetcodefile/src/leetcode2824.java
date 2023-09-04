public class leetcode2824 {
  public static int countPairs(int[] nums, int target) {
    int count = 0;
    int n = nums.length;

    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] < target) {
                count++;
            }
        }
    }

    return count;
}

public static void main(String[] args) {
    int[] nums1 = {-1, 1, 2, 3, 1};
    int target1 = 2;
    System.out.println(countPairs(nums1, target1));  // Output: 3

    int[] nums2 = {-6, 2, 5, -2, -7, -1, 3};
    int target2 = -2;
    System.out.println(countPairs(nums2, target2));  // Output: 10
}
}
