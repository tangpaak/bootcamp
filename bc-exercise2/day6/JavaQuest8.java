/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    // code here
    
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int max = nums[0];
    int secondMax = nums[0];
    for (int i = 0; i < nums.length; i++) {
if(nums[i] > max){
secondMax = max;
max = nums[i];

}else if (nums[i] > secondMax) {
  secondMax = nums[i];
}
    }    
    System.out.println("Max value= " + max);
    System.out.println("Second Max value= " + secondMax);

    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    max = nums[0];
    secondMax = nums[0];
    for (int i = 0; i < nums2.length; i++) {
      if(nums2[i] > max){
      secondMax = max;
      max = nums2[i];
      
      }else if (nums2[i] > secondMax) {
        secondMax = nums2[i];
      }
          }    
          System.out.println("Max value= " + max);
          System.out.println("Second Max value= " + secondMax);

    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    max = nums3[0];
    secondMax = nums3[0];
    for (int i = 0; i < nums3.length; i++) {
      if(nums3[i] > max){
      secondMax = max;
      max = nums3[i];
      
      }else if (nums3[i] > secondMax) {
        secondMax = nums3[i];
      }
          }    
          System.out.println("Max value= " + max);
          System.out.println("Second Max value= " + secondMax);

    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240
    max = nums4[0];
    secondMax = nums4[0];
    for (int i = 0; i < nums4.length; i++) {
      if(nums4[i] > max){
      secondMax = max;
      max = nums4[i];
      
      }else if (nums4[i] > secondMax) {
        secondMax = nums4[i];
      }
          }    
          System.out.println("Max value= " + max);
          System.out.println("Second Max value= " + secondMax);



    // Your program should be able to handle all the above test case.

    // int[] nums = new int[] {240, 800, -23, 6, 98};
    // int max = nums[0]; //代入第一個數目先，逐個睇大唔大得過
    // // for loop
    // for (int i = 0; i < nums.length; i++) {
    // // i = 0 , nums[0] -> 240
    // if (nums[i] > max) {
    // max = nums[i];
    // } // 代入i = 0既數目,再逐格i++對比係咪大過原本既num[i]數目,最尾就有最大數目
    // }
    // System.out.println("Max value= " + max);



  }
}
