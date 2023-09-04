import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {



  public static void main(String[] args) {
    // 記住個structure係:
    // 左邊係what can you do
    // 右邊係how you do

    Deque<String> arrayDeque = new ArrayDeque<>(); // array
    arrayDeque.addFirst("A");
    arrayDeque.addLast("A");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();

    Deque<String> linkedDeque = new LinkedList<>(); // linked list
    linkedDeque.addFirst("A");
    linkedDeque.addLast("A");
    linkedDeque.pollFirst();
    linkedDeque.pollLast();

    Queue<String> arrayQueue = new ArrayDeque<>(); // array
    arrayQueue.add("A");
    arrayQueue.poll();

    Queue<String> linkedQueue = new LinkedList<>(); // linkedlist
    linkedQueue.add("A");
    linkedQueue.poll();


    Queue<String> pQueue = new PriorityQueue<>(); // array
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arraylist = new ArrayList<>(); // array
    arraylist.add(3);
    arraylist.remove(3);

    List<Integer> linkedlist = new LinkedList<>(); // linked list
    // linkedlist.poll();
    linkedlist.add(3);
    linkedlist.remove(3);

    Stack<String> stack = new Stack<>(); // <-stack我地永遠唔會用List去接住
    stack.add("abc");
    stack.remove(0);

    Vector<String> stack2 = new Stack<>(); // Vector vs List
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("abc");
    stack3.pop();



  }

}
