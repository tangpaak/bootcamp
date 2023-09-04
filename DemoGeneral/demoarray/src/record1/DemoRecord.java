import java.util.HashSet;
import java.util.Set;

public class DemoRecord {

  public static void main(String[] args) {

    Person person = new Person("王阿狗", 30);
    Person10 person1 = new Person10("李阿貓", 30);
    Person10 anotherperson = new Person10 ("洪阿鼠", 30);

    System.out.println(person.getAge()); // 30
    System.out.println(person1.age()); // 30

    System.out.println(person.getName()); // 30
    System.out.println(person1.name()); // 30

    System.out.println(person1.equals(anotherperson)); //true
    System.out.println(person1); //Person1 [name=jogn, age=30]

    System.out.println(person1.hashCode() == anotherperson.hashCode());

    //HashMap, Set -> equals(),hashCode
    Set <Person10> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anotherperson)); //false
    



  }

}
