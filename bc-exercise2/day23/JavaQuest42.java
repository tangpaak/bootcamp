

/* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
 Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.

 

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.

Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 

Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100*/

import java.util.LinkedList;

public class JavaQuest42 {
  public static void main(String[] args) {
    System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));//output : 6 
    System.out.println(maximumWealth(new int[][]{{1,5},{3,7},{3,5}}));//output : 10
    System.out.println(maximumWealth(new int[][]{{2,8,7},{3,7,1}}));//output : 17
    System.out.println(maximumWealth(new int[][]{{1,2,3,4},{5,6,7,8}}));//output : 26 
  }
  public static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;

    for (int i = 0; i < accounts.length; i++) {
      int wealth = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        wealth += accounts[i][j]; // wealth加總, accounts[0] (入面既[j1] [j2] [j3])
      }
      maxWealth = Math.max(maxWealth, wealth); //將現有maxWealth同之前既MaxWealth對比
    }

    return maxWealth;
  }
}


