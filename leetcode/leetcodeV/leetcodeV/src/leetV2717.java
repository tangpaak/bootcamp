


public class leetV2717 {
  public int semiOrderedPermutation(int[] nums) {
    int startIdx = -1;
    int endIdx = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1)
        startIdx = i;
      if (nums[i] == nums.length)
        endIdx = i;
    }
    int times = nums.length - endIdx - 1 + startIdx;
    return startIdx > endIdx ? times - 1 : times;
  }
}
