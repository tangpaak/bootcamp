package Queue1;

public class Staff implements Walkable {

  @Override
  public void walk() {
    int count = 0;
    System.out.print("Staff walking ");
    count++;
    System.out.println(count + " times.");

  }

  public static void main(String[] args) {
    Walkable person = new Staff();
    int a = 0;
    while (a < 5) {
      person.walk();
      a++;
    }
  }


}
