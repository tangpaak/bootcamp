public class JoinExample2 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
        for (int i = 0; i < 100; i ++){
            System.out.println("p杳劣杯屠");
        }});

        Thread thread2 = new Thread( ()->{
          for(int i=0;i<100;i++){
            System.out.println("ASDFASDFASDFASfd");
          }
        }
        );

        thread1.start();
        thread2.start();

        try{
          thread1.join();
          thread2.join();
        } catch(InterruptedException e){
          
        }
        
  
        // Thread thread2 = new Thread(() -> {
        //     System.out.println("Thread 2 started");
        //     try {
        //         Thread.sleep(3000); // Simulating some work
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     System.out.println("Thread 2 finished");
        // });
  
        // thread1.start();
        // thread2.start();
  
        // try {
        //     thread1.join(); // Main thread waits for thread1 to finish

        //     thread2.join(); // Main thread waits for thread2 to finish

        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
  
        // System.out.println("Main thread ends");
    }
  }
