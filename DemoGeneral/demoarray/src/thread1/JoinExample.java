public class JoinExample {

  public static void main(String[] args) {
      Thread thread1 = new Thread(() -> {
          System.out.println("Thread 1 started");
          try {
              Thread.sleep(2000); // Simulating some work
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("Thread 1 finished");
      });

      Thread thread2 = new Thread(() -> {
          System.out.println("Thread 2 started");
          try {
              Thread.sleep(3000); // Simulating some work
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("Thread 2 finished");
      });

      thread1.start();
      thread2.start();

      try {
          thread1.join(); // Main thread waits for thread1 to finish
          System.out.println("Thread 1 joined");
          thread2.join(); // Main thread waits for thread2 to finish
          System.out.println("Thread 2 joined");
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      System.out.println("Main thread ends");
  }
}