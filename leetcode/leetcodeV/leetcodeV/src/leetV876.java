package leetcode.leetcodeV.leetcodeV.src;



// 876. Middle of the Linked List

// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.



// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

// Example 2:


// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


// Constraints:

// The number of nodes in the list is in the range [1, 100].
// 1 <= Node.val <= 100



// * Definition for singly-linked list.

// public class ListNode {
//   int val;
//   ListNode next;

//   ListNode() {

//   }

//   ListNode(int val) {
//     this.val = val;
//   }

//   ListNode(int val, ListNode next) {
//     this.val = val;
//     this.next = next;
//   }
// }


public class leetV876 {
  public ListNode midlleNode(ListNode head) {

    // head is object reference
    // head.next -> Next Node

    // Part 1: Count Node in head
    ListNode node = head;
    int count = 1; // 點解會1開始既??????

    while (node.next != null) {
      count++;
      node = node.next; // 搵個長度先
    }

    // Part 2: Loop to find the node by target count
    int target = (count / 2) + 1; // 長度既一半+1
    count = 1;
    node = head; // reset as head again
    while (count < target) {
      count++;
      node = node.next;// 點解唔係print 1,2,3既?????
    }

    return node;
  }



}
