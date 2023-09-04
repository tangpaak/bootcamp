public class DemoThread {


  public static void main(String[] args) {

    // Approch 1: Runnable(lambda) to implement Thread

    // 1. Task
    // 一個program可以好多個class , subclass
    // 唔係淨係得個task, 行幾耐, task個id等, thread係一個管理員
    // Thread thread = new Thread(); // Task Mangament

    // // i. Task logic
    // Runnable printout2 = () -> {
    //   for (int i = 0; i < 20; i++) {
    //     System.out.println("i = " + i);

    //   }
    // }; // step4

    // Thread thread4 = new Thread(printout2);
    // thread4.start();
    // // 呢個係長既function, 所以最後先會printout


    Runnable printout = () -> System.out.println("  print!");

    // ii. Task separate
    Thread thread = new Thread(printout);
    System.out.println("start thread"); // step 1
    thread.start(); // step 2
    System.out.println("end thread"); // step 3

    // Approach 2: Create PrintOut Class implement Runnable
    Thread thread2 = new Thread(new PrintOut());
    System.out.println("start thread"); // step 1
    thread2.start(); // step 2
    System.out.println("end thread");

    // Approach 3: Create PrintOut2 Class extends Thread
    Thread thread3 = new PrintOut2();
    thread3.start(); // Approach3 extends Thread!



    // Lambda code example
    // Thread thread5 = new Thread(() -> {

    //   for (int i = 0; i < 10; i++) {
    //     System.out.println("london bitch is falling down");
    //   }
    // });
    // thread5.start();

    // 2. try catch example
    try {
      thread.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {

    }
    System.out.println("Main Thread Ends");


    //


  }

}


