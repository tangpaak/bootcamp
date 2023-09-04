package unchecked1;
public class DemoNUmberFormatException {


  public static void main(String[] args) {

    try {
      Integer.valueOf("abc");

    } catch (NumberFormatException e) {
      System.out.println("number format issue");
    }



  }
}
