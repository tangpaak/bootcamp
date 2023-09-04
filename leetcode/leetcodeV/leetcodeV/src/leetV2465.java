class leetV2465 {
  public int distinctAverages(int[] nums) {
      Arrays.sort(nums);
      Set<Double> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
          set.add((double) (nums[i] + nums[nums.length - 1 - i]) / 2);
      }
      return set.size();
  }
}
