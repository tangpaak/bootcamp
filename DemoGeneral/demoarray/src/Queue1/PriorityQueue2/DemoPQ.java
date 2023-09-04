import java.util.PriorityQueue;
import java.util.Queue;
// PriorityQueue

public class DemoPQ {

  public static void main(String[] args) {
    //Priority Queue: natural order by default
    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(queue); //[abc, bcd, def]
    System.out.println(queue.poll()); // abc, 一add果陣就已經resequence ("abc" "bcd" "def")

    //Priority: Custom Priority By Comparator (*** Last In First Out既寫法)
    PriorityQueue<String> custom = new PriorityQueue<>(new SortByDesending()); //<-要咁樣寫佢先會 First In First Out
    custom.add("zzz");
    custom.add("adf");
    custom.add("bcd");
    custom.add("abc");
    custom.add("def");
    System.out.println(custom); //[zzz, def, bcd, adf, abc]
    System.out.println(custom.poll()); // zzz,







  }

}
