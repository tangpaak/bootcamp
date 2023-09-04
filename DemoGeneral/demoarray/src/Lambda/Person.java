public class Person implements Swimable {

  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void swim() {
    System.out.println("Swim, blackpink in your area");
  }

@Override
public String toString(){
  return "[name=" + this.name + "]";
}

  public static void main(String[] args) {
    // Person person = new Person();
    // person.swim();
    // 番到公司就無人咁樣寫既

    Swimable p1 = () -> System.out.println("P1 Swim");
    p1.swim();

    Swimable p2 = () -> System.out.println("P2 Swim");
    p2.swim();



  }
}
