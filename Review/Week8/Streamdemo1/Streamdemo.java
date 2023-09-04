package Streamdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Company2.Person;
import Company2.Person2;

public class Streamdemo {


  public static void main(String[] args) {
    // One table -> Many Records (where age>60)


    // // 1.Last Name:
    System.out.println(getFromDb("Lau").toString());
    // // result: person name = eric lau, person name = peter lau

    System.out.println(getFromDb("Chan").toString());
    // // result: person name = john chan

    // // 2. Full Name:
    System.out.println(getFullName("Lau").toString());
    System.out.println(getFullName("Chan").toString());

    // 3. FlatMap()
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
    System.out.println(getAllAddresses(persons));
    // return all addresses (List<String>) from List<Person>

  }

  public static List<String> getAllAddresses(List<Person2> persons) {
    return persons.stream() //
        .flatMap(person -> person.getAddresses().stream())
        .collect(Collectors.toList());

    //
  }


  public static List<String> getAllAddresses2(List<Person2> persons) {
    List<String> addresses = new ArrayList<>();
    for (Person2 p : persons) {
      for (String address : p.getAddresses()) {
        addresses.add(address);
      }
    }
    return addresses;

    // map
    // List<String> addressesmap = new ArrayList<>();
    // for(Person2 p : persons){
    // addressesmap.add(p.getAddresses());
    // }



  }

  public static List<String> getAllNames(List<Person2> persons) {


    return null;
  }


public static List<Person> getFullName(String lastName) {

  //1. Call Database, and returned a List of Person
  //SQL -> filter by lastname (where last_name = lastName)
  List<Person> persons = new ArrayList<>();
  persons.add(new Person("John Chan"));
  persons.add(new Person("Eric Lau"));
  persons.add(new Person("Peter Lau"));

  // Stream, last name = Lau
  return persons.stream() //
      .filter(p -> p.getName().endsWith(lastName)) //
      .map(p -> {
        return p.getName()
      })
      .collect(Collectors.toList())
      ; // List String
  
       
}

  public static List<Person> getFullName2(String lastName) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    // filter + map
    List<Person> names = new ArrayList<>();
    for (Person p : persons) {
      if (p.getName().endsWith(lastName)) {
        names.add(p.getName());
      }
    }
    return names;

  }


  // for (Person p : persons) {
  // String[] names = p.getFullName().split(" ");
  // String personLastName = names[names.length - 1];
  // if (personLastName.equals(lastName)) {
  // matchingPersons.add(p);
  // }
  // }

  // return matchingPersons;



  public static List<Person> getFromDb(String lastName) {

    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)

    // List of Person
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName))//
        .collect(Collectors.toList()) // List Person
    ;



  }



}
