package Stack1;

import java.util.Queue;
import java.util.Stack;

public class Stack2 {

  public static void main(String[] args) {
    // First in, Last Out
    // 個水管得一邊

    // 第一次
    System.out.println();
    Stack<String> stack1 = new Stack<>();
    stack1.push("野比大雄 出黎啦");
    stack1.push("多啦A夢 出黎啦");
    System.out.println("First List" + stack1.pop()); // 先搵多啦a夢

    // 第二次
    System.out.println();
    stack1.push("小夫 出黎啦"); //add 小夫
    stack1.push("胖虎 出黎啦"); //add 胖虎
    while (!stack1.isEmpty()) {
      System.out.println("Seond List" + stack1.pop());  //胖虎 小夫 野比大雄
    } 
    
    //第三次 stack
    System.out.println();
    stack1.add("靜香 出黎啦");
    stack1.push("出木衫 出黎啦");
    stack1.add("靜香 出黎啦");
    System.out.println("Third List" + stack1.pop()); //靜香 出黎先
  






  }



}
