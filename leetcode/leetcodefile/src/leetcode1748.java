// 1748. Sum of Unique Elements

// You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

// Return the sum of all the unique elements of nums.

// Example 1:

// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.
// Example 3:

// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class leetcode1748 {

    public static int sumOfUnique(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            if (!duplicateSet.contains(num)) {
                if (uniqueSet.contains(num)) {
                    uniqueSet.remove(num);
                    duplicateSet.add(num);
                } else
                    uniqueSet.add(num);
            }
        }
        for (int num : uniqueSet) {
            sum += num;
        }

        return sum;
    }

    public static int mapapproach2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i] + 1));
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                sum += entry.getKey();
        }

        return sum;
    }



    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));
        nums = new int[] {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique(nums));
        nums = new int[] {1, 2, 3, 4, 5};
        System.out.println(sumOfUnique(nums));
        

        int num = 1000;
        double a = Math.log10(num);
        System.out.println(a);



    }



}
