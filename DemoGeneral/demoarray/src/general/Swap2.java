package general;
import java.util.Arrays;
public class Swap2 {

public static double average (int[] arr) { 
  // calculate the average of all numbers in arr
int sum = 0;
for (int i = 0; i < arr.length; ++i){
sum += arr[i];
}
  return ((double) sum) / arr.length;

}




  public static void main(String[] args) {
    int[] nums = new int[] {8, 3, -10, 30, 100, -19};
    int[] backup = new int[] {8, 3, -10, 30, 100, -19};
    // Move the max number to the tail
    // {8, 3, -10, 30, 100, -19}
    // int temp;

    int max = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println("max=" + max);

    for (int i = 0; i < nums.length; i++) {
      nums[nums.length - 1] = max;
      nums[nums.length - 2] = backup[backup.length - 1];

    }
    System.out.println(Arrays.toString(nums));

//  Test Average (int[])
int [] testCase = new int [] {2, 3, 0};
System.out.println(average(testCase)); //1.0

//






  }
}
