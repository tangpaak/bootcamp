package general;
public class Loopstar {
  public static void main(String[] args) {



    for (int star1 = 0; star1 < 5; star1++) {
      String Num = "";
      for (int star2 = 0; star2 < 5; star2++) {
        if (star2 < star1) {
          Num += "*";
        }
      }
      System.out.println(Num);
    }
  }
}