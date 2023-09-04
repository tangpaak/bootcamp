// 225. Implement Stack using Queues

// Implement a last-in-first-out (LIFO) stack using only two queues.
// The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:

// You must use only standard operations of a queue, which means that only push to back,
// peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively.
// You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.


// Example 1:

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False


// Constraints:

// 1 <= x <= 9
// At most 100 calls will be made to push, pop, top, and empty.
// All the calls to pop and top are valid.


// Follow-up: Can you implement the stack using only one queue?

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode225no {

  private Queue<Integer> mainQueue;
  private Queue<Integer> tempQueue;

  public leetcode225no() {
    mainQueue = new LinkedList<>();
    tempQueue = new LinkedList<>();
  }


  public void push(int x) {
        // Move all elements from the mainQueue to the tempQueue
        while (!mainQueue.isEmpty()) {
          tempQueue.offer(mainQueue.poll());
      }

      // Add the new element to the mainQueue
      mainQueue.offer(x);

      // Move all elements back to the mainQueue from the tempQueue
      while (!tempQueue.isEmpty()) {
          mainQueue.offer(tempQueue.poll());
      }
  }

  public int pop() {
    return mainQueue.poll();
  }

  public int top() {
      return mainQueue.peek();
  }

  public boolean empty() {
      return mainQueue.isEmpty();
  }

  public String queueToString() {
    return mainQueue.toString();
}


  /**
   * Your MyStack object will be instantiated and called as such: 
   * MyStack obj = new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
   */

  public static void main(String[] args) {
    leetcode225no myStack = new leetcode225no();
    myStack.push(1);
    myStack.push(2);
    System.out.println(myStack.queueToString());
    System.out.println(myStack.top());  // 2
    System.out.println(myStack.pop());  // 2
    System.out.println(myStack.empty());  // false
    System.out.println(myStack.queueToString());


}


}
