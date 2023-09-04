public class leetcode121 {

  // 121. Best Time to Buy and Sell Stock

  // You are given an array prices where prices[i] is the price of a given stock on the ith day.

  // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
  // to sell that stock.

  // Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



  // Example 1:
  // Input: prices = [7,1,5,3,6,4]
  // Output: 5
  // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  // Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

  // Example 2:
  // Input: prices = [7,6,4,3,1]
  // Output: 0
  // Explanation: In this case, no transactions are done and the max profit = 0.


  // Constraints:

  // 1 <= prices.length <= 105
  // 0 <= prices[i] <= 104

  // draft:
  // nestedloop?
  // then count 1 - each arr[j]
  // last length arr[i] is 1, then don't count, result is 0
  // may use update min & max?


  public static int maxProfit(int[] prices) {

    int max = 0;
    int minPrice = prices[0]; // 以最初既數做minPrice,如果count減出黎係負數, max就永遠都係0
    int count = 0;

    for (int i = 0; i < prices.length; i++) {
      count = prices[i] - minPrice;
      if (count > max) { // 當count大過個最大profit, 更新max
        max = count;
      }
      if (prices[i] < minPrice) { // 當現時數細過最細數最, 更新minPrice, 之後再計算
        minPrice = prices[i];
      }
      // 以現時price - 最細既數
      // // 再loop番上後面, 計count, 之後會再用現時數減min Price, 如果個count係最大, 更新個max
      // int[] arr1 = {7, 1, 5, 3, 6, 4};
      // int[] arr2 = {7, 6, 4, 3, 1};
      // int[] arr3 = {2, 4, 1};

      // arr1 
      // arr[1] find 1 is min Price
      // 5 - 1 = 4
      // 3 - 1 = 2
      // 6 - 1 = 5 (更新max)
      // 4 - 1 = 3

      // arr2 全部結果都係負數, 即max = 0;

      // arr3 
      // arr[0] find 2 is minPrice
      // 4-2 = 2 更新max = 0
      // arr[2] find 1 is minPrice
      // 1-2 = -1 不更新max

      // System.out.println("i =" + i);
      // System.out.println("prices[i]=" + prices[i]);
      // System.out.println("count =" + count);
      // System.out.println("max=" + max);
      // System.out.println("minPrice=" + minPrice);
    }

    return max;
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
