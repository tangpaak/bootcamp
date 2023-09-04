package general;

import java.util.Arrays;

public class Arrays1 {

  public static void main(String[] args) {

    int num = 7;
    int num2 = 8;
    int num3 = -30;
    // Creat Empty Array (Approach 1)
    int[] nums = new int[4]; // 3 is the length of array nums
    // 3 用於define數據儲存既長度
    // with index 0, 1 , 2 (you can treat it as address)
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    nums[3] = 5;
    // nums [3] = 5; //ArraysIndexOutOfBoundsException:
    // nums[-1] = 4;//error

    // Your turn
    // double[]
    double[] nums2 = new double[5];
    nums2[0] = 4.1;
    nums2[1] = 5.1;
    nums2[2] = 6.1;
    nums2[3] = 7.1;
    nums2[4] = 8.1;
    // numbers[1] = 'a'; //later
    // numbers [0] = "123; // Type iddur"
    // char[], int[], String[]

    // System.out.println(nums[0]);
    // for loop
    for (int i = 0; i < nums.length; i++) { // nums.length->3
      // nums.length
      System.out.println("nums[" + i + "]=" + nums[i]);
    }
    // reversely print array nums
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println("nums[" + i + "]=" + nums[i]);
    }

    // Approach 2, create Array
    int[] array = new int[] {3, 9, 12};
    for (int i = 0; i < array.length; ++i) {
      System.out.println("array[" + i + "]=" + array[i]);
    }
    // Can add a new element at tail? <-No
    // array長度不能被改變
    // Modify an element
    array[2] = -10;
    // Access an element
    int index = 2;
    System.out.println("array[index 2]=" + array[index]); // -10

    // ** char[]
    char[] chars = new char[3];
    chars[2] = 'a'; // char[1]唔比unit佢，背後係空白 (empty character)
    chars[0] = '!';
    for (int i = 0; i < chars.length; i++) {
      System.out.println("chars[" + i + "]=" + chars[i]);
    }
    // ** Long
    long[] numbers = new long[4];
    numbers[0] = 123;
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[" + i + "]=" + numbers[i]);

    }
    // ** Boolean
    boolean[] arr2 = new boolean[3];
    arr2[0] = true;
    arr2[1] = true;
    for (int i = 0; i < arr2.length; ++i) {
      System.out.println("arr2[" + i + "]=" + arr2[i]);
    }

    // ** String
    String[] strs = new String[] {"First", "second", "third"};
    strs[1] = "Typhoon";
    strs[2] = "Typhoon2";

    for (int i = 0; i < strs.length; ++i) {
      System.out.println("strs[" + i + "]=" + strs[i]);
    }
    // other example
    String[] fruits = new String[5];
    fruits[0] = "apple";
    fruits[1] = "watermelon";
    fruits[2] = "orange";
    // null
    // null
    System.out.println(Arrays.toString(fruits));
    // [apple, watermelon, orange, null, null]
    byte[] bytes = new byte[6];
    bytes[3] = -4;
    System.out.println(Arrays.toString(bytes));
    //
    // [0,0,0,-4,0,0]



  }
}
