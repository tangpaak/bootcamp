public class leetV121 {
  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int buyDay = 0;
    int currProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < prices[buyDay]) {
        buyDay = i;
        continue;
      }

      currProfit = prices[i] - prices[buyDay];
      maxProfit = Math.max(currProfit, maxProfit);

    }
    return maxProfit;
  }

  public static void main(String[] args) {

    int[] arr1 = {7, 1, 5, 3, 6, 4};
    int[] arr2 = {7, 6, 4, 3, 1};
    int[] arr3 = {2, 4, 1}; //

    System.out.println(maxProfit(arr1));
    System.out.println(maxProfit(arr2));
    System.out.println(maxProfit(arr3));


  }



}
