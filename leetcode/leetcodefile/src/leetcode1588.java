public class leetcode1588 {

  // 1588. Sum of All Odd Length Subarrays

  // Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

  // A subarray is a contiguous subsequence of the array.



  // Example 1:
  // Input: arr = [1,4,2,5,3]
  // Output: 58
  // Explanation: The odd-length subarrays of arr and their sums are:
  // [1] = 1
  // [4] = 4
  // [2] = 2
  // [5] = 5
  // [3] = 3
  // [1,4,2] = 7
  // [4,2,5] = 11
  // [2,5,3] = 10
  // [1,4,2,5,3] = 15
  // If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

  // Example 2:
  // Input: arr = [1,2]
  // Output: 3
  // Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.

  // Example 3:
  // Input: arr = [10,11,12]
  // Output: 66
  // 10 + 11 + 12 + 33 = 66

  // Constraints:

  // 1 <= arr.length <= 100
  // 1 <= arr[i] <= 1000



  public static int sumOddLengthSubarrays(int[] arr) {
    int result = 0;
    int temp1 = 0;
    int temp2 = 0;
    int temp3 = 0;

    if (arr.length == 1) {
      temp1 = arr[0];
    }

    if (arr.length == 2) {
      for (int i = 0; i < arr.length; i++) {
        temp1 = arr[0] + arr[1];
      }
    }

    else if (arr.length == 3) {

      for (int i = 0; i < arr.length; i++) {
        temp1 += arr[i];
        // System.out.println("temp1=" + temp1);
      }
      temp1 = temp1 * 2;

    }

    else if (arr.length > 3) {
      for (int i = 0; i < arr.length; i++) {
        temp1 += arr[i];
        System.out.println("temp1=" + temp1);
      }
      temp1 = temp1 * 2;
      System.out.println("temp1*2=" + temp1);

      for (int i = 0; i < arr.length - 2; i++) {
        temp2 = arr[i] + arr[i + 1] + arr[i + 2];
        System.out.println("arr[i]= " + arr[i]);
        System.out.println("arr[i+1]= " + arr[i+1]);
        System.out.println("arr[i+2]= " + arr[i+2]);

        System.out.println("temp2=" + temp2);
        temp3 += temp2;
        System.out.println("temp3=" + temp3);
      }


    }

    System.out.println("finaltemp1=" + temp1);
    System.out.println("finaltemp3=" + temp3);
    result = temp1 + temp3;
    System.out.println("result=" + result);
    return result;
  }



  public static void main(String[] args) {
    int[] arr1 = new int[] {1, 4, 2, 5, 3};
    int[] arr2 = new int[] {1, 2};
    int[] arr3 = new int[] {10, 11, 12};
    int[] arr4 = new int[] {1, 4, 2, 5, 3, 9}; // 107
    int[] arr5 = new int[] {1, 4, 2, 5, 3, 10, 999}; // 4164
    int[] arr6 = new int[] {10, 11, 12, 13}; //115 -> 161


    // System.out.println(sumOddLengthSubarrays(arr1));
    // System.out.println(sumOddLengthSubarrays(arr2));
    // System.out.println(sumOddLengthSubarrays(arr3));
    // System.out.println(sumOddLengthSubarrays(arr4));
    // System.out.println(sumOddLengthSubarrays(arr5));
    System.out.println(sumOddLengthSubarrays(arr6));
  }


}
