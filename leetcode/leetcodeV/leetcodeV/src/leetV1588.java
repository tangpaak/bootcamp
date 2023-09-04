public class leetV1588 {

  public static int sumOddLengthSubarrays(int[] arr) {
    int length = 3; // subarray length
    int sum = 0;
    int j = 0;
    // arr = [ 1,4,2,5,3]

    for (int i = 0; i < arr.length; i++) {
      if (i + length > arr.length)
        break;
      System.out.println("i= " + i); // i = 0, 1, 2

      j = i;
      while (j < length + i) { // j = 1, 2, 3
        System.out.println("j= " + j);
        System.out.println("arr[j]= " + arr[j]);
        sum += arr[j];
        j++;

      }
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] {1, 4, 2, 5, 3}; // 58
    int[] arr2 = new int[] {1, 2}; // 3
    int[] arr3 = new int[] {10, 11, 12}; // 66
    int[] arr4 = new int[] {1, 4, 2, 5, 3, 9}; // 107
    int[] arr5 = new int[] {1, 4, 2, 5, 3, 10, 999}; // 4164


    System.out.println(sumOddLengthSubarrays(arr1));
    // System.out.println(sumOddLengthSubarrays(arr2));
    // System.out.println(sumOddLengthSubarrays(arr3));
    // System.out.println(sumOddLengthSubarrays(arr4));
    // System.out.println(sumOddLengthSubarrays(arr5));
  }


}
