public class leetV1539 {
  
// LeetCode: 1539

  public int findKthPositive(int[] arr, int k) {
      int count = arr[0] - 1;
      if (count >= k)
          return k;
      for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] + 1 == arr[i + 1])
              continue;
          if (arr[i + 1] - arr[i] - 1 + count >= k)
              return arr[i] + (k - count);
          count += arr[i + 1] - arr[i] - 1;
      }
      return arr[arr.length - 1] + (k - count);
  }
}



