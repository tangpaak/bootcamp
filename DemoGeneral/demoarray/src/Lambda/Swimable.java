// Annotation: check if this interface has one abstract method only
// if no, compile error

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
public interface Swimable {
  void swim();

  public static void main(String[] args) {

    // Comparator Example:
    // Lambda: You have to use "return", if you use {}
    Comparator<Person> sortByNameDesc = (Person p1,
        Person p2) -> p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;

    List<Person> persons =
        Arrays.asList(new Person("Alison"), new Person("Eric")); 

    Collections.sort(persons, sortByNameDesc);
    System.out.println(persons);
    System.out.println();


    // Swimable Example:
    // New object <- " () -> System.out.println("P1 swim");"
    // Person person = new Person();
    // person.swim();
    // 番到公司就無人咁樣寫既, 所以要用以下既方法寫:

    Swimable p1 = () -> System.out.println("P1 Swim");
    p1.swim();

    Swimable p2 = () -> {
      System.out.println("P2 Swim");
      System.out.println("P2 Stop Swim");
    };
    p2.swim();

    Swimable p3 = () -> {
      System.out.println("P3 Starts Swim");
    };
    p3.swim();



  }



}
