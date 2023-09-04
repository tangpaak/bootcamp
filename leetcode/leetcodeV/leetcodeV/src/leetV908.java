public class leetV908 {
  // LeetCode: 908

  public int smallestRangeI(int[] nums, int k) {

      int max = -1;
      int min = 10000; 
    
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] > max)
              max = nums[i];
          if (nums[i] < min)
              min = nums[i];
      }
      return k * 2 > max - min ? 0 : max - min - k * 2;
  }

}
