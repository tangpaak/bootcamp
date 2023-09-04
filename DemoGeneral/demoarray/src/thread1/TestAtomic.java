import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {

  // Integer number = Integer.valueOf(0); //
  AtomicInteger number = new AtomicInteger(0);

  public static void main(String[] args) {

    // 1. Thread AB example (With Same Speed)
    // Thread A 17 + 1 =18 同時間
    // Thread B 17 +1 = 18

    // i approach 1 開鎖門:
    // 但我想outcome A行一次 B又行一次 姐係結果要19 , 要點做?
    // 可以用開關門既index = 1, 轉index = -1去行

    TestAtomic i = new TestAtomic();
    // i.number++; // 非原子性操作 Non-Atomic Operation
    // System.out.println(i.number); // 1

    Runnable increment1000 = () -> {
      for (int x = 0; x < 1000; x++) {
        i.number.incrementAndGet(); // Atomic operation
      }
    };

    Thread thread1 = new Thread(increment1000);
    Thread thread2 = new Thread(increment1000);

    thread1.start(); // 1-1000
    thread2.start(); // 1000-1

    try {
      thread1.join(); 
      System.out.println("i1= " + i);
      thread2.join(); 
      System.out.println("i2= " + i);
    } catch (InterruptedException e) {

    }
    System.out.println(i.number);



  }



}


