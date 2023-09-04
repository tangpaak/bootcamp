package general;
import java.util.Arrays;

public class Arrays3 {
  // search
  public static void main(String[] args) {
    char target = 'm';
    char[] chars = new char[] {'j', 'p', 'm', 'q', 'c'};
    // Loop to find the index of the target in array chars
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("i=" + i);
      }
    }
    // *** toCharArray()
    String str = "I am a boy."; // 11 characters
    char[] arr = str.toCharArray();// length = 11
    System.out.println(Arrays.toString(arr));
    // Reuslt is [I, , a, m, , a, , b, o, y, .]

    // *** Find Max. value in the array

    int[] nums = new int[] {240, 800, -23, 6, 98};
    int max = nums[0]; //代入第一個數目先，逐個睇大唔大得過
    // for loop
    for (int i = 0; i < nums.length; i++) {
      // i = 0 , nums[0] -> 240
      if (nums[i] > max) {
        max = nums[i];
      } // 代入i = 0既數目,再逐格i++對比係咪大過原本既num[i]數目,最尾就有最大數目
    }
    System.out.println("Max value= " + max);



    // ** Find min. Value in the array
    int[] nums2 = new int[] {240, 800, -23, 6, 98};
    int min = nums2[0];//一樣代入第一個數,再逐個睇細唔細過原本果個數
    // for loop
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] < min) {
        min = nums2[i];
      }
    }
    System.out.println("Min value= " + min);
// min = -23



  }
}
