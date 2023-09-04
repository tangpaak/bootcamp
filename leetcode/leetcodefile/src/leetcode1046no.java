// 1046. Last Stone Weight

// You are given an array of integers stones where stones[i] is the weight of the ith stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. 
// Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the weight of the last remaining stone. If there are no stones left, return 0.

 

// Example 1:

// Input: stones = [2,7,4,1,8,1]
// Output: 1
// Explanation: 
// We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
// we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
// we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
// we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

// Example 2:
// Input: stones = [1]
// Output: 1
 

// Constraints:

// 1 <= stones.length <= 30
// 1 <= stones[i] <= 1000

import java.util.PriorityQueue;

class leetcode1046no {
  public static int lastStoneWeight(int[] stones) {
    // [5, 9, 1, 3, 7]
    // Create a max heap to store the stones in descending order
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    // Add all stones to the max heap
    for (int stone : stones) {
      maxHeap.offer(stone);
    }

    // Smash the stones until there is at most one stone left
    while (maxHeap.size() > 1) {
      int heaviestStone = maxHeap.poll();
      int secondHeaviestStone = maxHeap.poll();

      int remainingWeight = heaviestStone - secondHeaviestStone;
      if (remainingWeight > 0) {
        maxHeap.offer(remainingWeight);
      }
    }

    // Return the weight of the last remaining stone or 0 if there are no stones left
    return maxHeap.isEmpty() ? 0 : maxHeap.poll();
  }

  public static void main(String[] args) {
    int[] stones = {2, 7, 4, 1, 8, 1};
    int lastWeight = lastStoneWeight(stones);
    System.out.println("Weight of the last remaining stone: " + lastWeight);
  }


}