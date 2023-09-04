interface Reading {
  void read();
}



public class AnonymousExample {

  public static void main(String[] args) {

    // 1. Lambda寫法
    Reading read1 = () -> {
      System.out.println("I am Linda, reading...");
    };

    read1.read();

    // 2. 普通寫法
    Reading read2 = new Reading() {

      int x;

      @Override
      public void read() {
        this.x++;
        System.out.println("I am Anonymous, reading ... x=" + x);
      }
    };

    read2.read();
    read2.read();

    //


  }

}
