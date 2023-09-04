package unchecked1;
public class DemoNullPointer {


  public static void main(String[] args) {
    String[] strings = new String[4];
    try {
      for (String string : strings) {
        if (string.charAt(0) == 'a') { // 指住第一格試下係咪'a', 但第一格係null
          System.out.println("first character is a");
        }
      }
    } catch (NullPointerException e) {
      System.out.println("null pointer exception");
    }

  }


}
