package Person1;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person.Builder()
            .firstName("John")
            .lastName("Doe")
            .age(30)
            .build();

    Person person2 = new Person.Builder()
            .firstName("Jane")
            .lastName("Smith")
            .age(25)
            .address("123 Main St")
            .phoneNumber("555-1234")
            .build();

    System.out.println(person1);
    System.out.println(person2);
}
}
