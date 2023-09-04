package Optional1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import Company2.Person2;

public class OptionalDemo {



  public static void main(String[] args) {


    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person2 p1 = new Person2("Ann", addresses);
    System.out.println(addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person2 p2 = new Person2("Betty", addresses2);
    System.out.println(addresses2);

    List<Person2> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);

System.out.println((getFromDb(persons, "Chan")));
System.out.println((getFromDb(persons, "Chan")));

// Optional <Person2> result = getFromDb2(persons, "Chan");
// result.ifPresnet(person ->{
//   person.getAddresses().stream().

// })


  }

  public static boolean getFromDb(List<Person2> persons2, String lastName) {
    return persons2.stream() //
        .filter(p -> p.getName().endsWith(lastName))//
        .findAny() // Optional<Person2>
        .isPresent()//
    ;
  }







}
