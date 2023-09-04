package Test;
import java.util.Vector;

// Vector係可以解決到mutli thread既問題

public class TestVector {

  Vector<Integer> integers = new Vector<>();

  public static void main(String[] args) {
    
    TestVector t = new TestVector();

    Runnable add = () -> {
      for (int i = 0; i < 100000; i++) {
      t.integers.add(1); // 

      }
    };

    Thread thread1 = new Thread(add);
    Thread thread2 = new Thread(add);

    thread1.start(); 
    thread2.start(); 

    try {
      thread1.join(); 
      thread2.join(); 

    } catch (InterruptedException e) {

    }
    System.out.println(t.integers.size());




  }
}
