package Test;

public class ATestSynchronize {

  int number;

  public synchronized void increment() { // like a atomic method
    this.number++; //non-atomic operation
  } 

  public static void main(String[] args) {

    ATestSynchronize t = new ATestSynchronize();

    Runnable formula = () -> {
      for (int i = 0; i < 100000; i++) {
        t.increment(); // concat() -> non-atomic operation
        
      }
    };

    Thread thread1 = new Thread(formula);
    Thread thread2 = new Thread(formula);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();

    } catch (InterruptedException e) {

    }
    System.out.println(t.number);



  }



}
