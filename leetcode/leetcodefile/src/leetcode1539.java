// 1539. Kth Missing Positive Number

// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.


// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
// Example 2:

// Input: arr = [1,2,3,4], k = 2
// Output: 6
// Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


// Constraints:

// 1 <= arr.length <= 1000
// 1 <= arr[i] <= 1000
// 1 <= k <= 1000
// arr[i] < arr[j] for 1 <= i < j <= arr.length


// Follow up:

// Could you solve this problem in less than O(n) complexity?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1539 {

    public static int findKthPositive(int[] arr, int k) {
        List<Integer> arr2 = new ArrayList<>();
        int number = 1;
        int missingCount = 0;

        for (int i = 0; i < arr.length; i++) {
            while (number < arr[i]) {
                arr2.add(number); // 加number入去條list
                missingCount++; // missing list既位置
                if (missingCount == k) { // 到左target就會outcome return number
                    return number;
                }
                number++;
                // System.out.println(arr2);
                // System.out.println("number1= " + number);

            }
            number++;
            // System.out.println("number2= " + number);
        }

        while (missingCount < k) {
            arr2.add(number);
            missingCount++;
            number++;
            // System.out.println(arr2);
            // System.out.println("missing=" + missingCount);
            // System.out.println("number3= " + number);
        }

        return arr2.get(k - 1);
    }



    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println(findKthPositive(arr, k));

        arr = new int[] {1, 2, 3, 4};
        k = 2;
        System.out.println(findKthPositive(arr, k));
    }

}
