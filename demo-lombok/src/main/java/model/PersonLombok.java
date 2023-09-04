package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // (annotation) step 1: all argument consstructor in your class create, you no need to create constructor

@NoArgsConstructor // Step 2:  Empty constructor

@Getter // Step 3: getter apply

@Setter // Step 4: setter apply

@ToString (onlyExplicitlyIncluded = true) // step 5: 



public class PersonLombok extends Person {

  @ToString.Include //只print Name
  private String name; 
  private int age;

  // public PersonLombok PersonLombok(String name, int age){
  // this.name = name;
  // this.age = age;
  // }
  

  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Petter", 30);
    PersonLombok p2 = new PersonLombok();

    p2.setAge(13);
    p2.setName("Eric");
    System.out.println(p2.getAge()); //13
    System.out.println((p2.getName())); //Eric
    System.out.println(p2.toString()); // PersonLombok(name=Eric, age=13)
    System.out.println(p2.getClass());
    







  }

}
