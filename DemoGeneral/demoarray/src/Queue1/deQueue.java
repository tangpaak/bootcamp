package Queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class deQueue {

  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("游學修");
    strings.add("腎仔");
    strings.add("豪哥");
    System.out.println("Original= " + strings); // [游學修, 腎仔, 豪哥]
    System.out.println(strings.poll()); // 游學修
    System.out.println("減一= " + strings); // [腎仔, 豪哥]
    System.out.println("Size= " + strings.size() + "\n"); // 全部有2

    strings.addLast("Locker"); // addLast() = add()
    System.out.println("addLast= " + strings.poll()); // addLast= 腎仔
    System.out.println("加Locker係尾,poll腎仔無左" + strings + "\n"); // [豪哥, Locker]

    strings.addFirst("Kayan9896"); // head
    System.out.println("addFirst = " + strings.peek()); // addFirst = Kayan9896
    System.out.println("加Kayyan9896係頭, peek " + strings + "\n");

    System.out.println(strings); // [Kayan9896, 豪哥, Locker]
    System.out.println(strings.peek());
    System.out.println(strings.pollFirst()); // PollFirst () = poll()
    System.out.println(strings.pollLast() + "\n"); //

    // ***point*** Queue
    // Queue同Deque既定義:
    // deque一定有哂queue d野, 一定將個範圍再收窄
    // queue就係一個水管頭放入去, 係個尾果度攞番出黎
    // deque就係係頭同尾都可以攞到野既
    // 一個好既interface就係將範圍再收窄
    // Queue就係一條隊 就係純排隊 由頭到尾行
    // Deque就鳩既, 鐘意頭攞同尾攞都可以, 唔洗特登排隊

    Deque<String> deque = new LinkedList<>(); // polymorhism <-留意呢度係生LinkedList
    Queue<String> queue = new LinkedList<>(); // polymorhism

    queue.add("abc");
    deque.add("abc");
    deque.addFirst("def");
    deque.addLast("ijk");

    Derun(new LinkedList<>()); // Linkedlist
    Derun(new ArrayDeque<>()); // array
    // Derun(new PriorityQueue<>()); // compile error 好似係兄弟生唔到priority queue

    Qurun(new LinkedList<>()); // linkedlist
    Qurun(new ArrayDeque<>()); // array
    Qurun(new PriorityQueue<>()); //

    Collection<String> arraylist = new ArrayList<>();



  }

  public static int Corun(Collection<String> collection) {
    collection.add(null);
    collection.add(null);
    collection.add(null);
    return collection.size();
  }


  public static void Derun(Deque<String> deque) {
    deque.addFirst("頭ss");
    deque.addLast("尾ss");
  }

  public static void Qurun(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }



}


