package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
// @AllArgsConstructor

@SuperBuilder

public class Staff2 extends Human { // <--since Human don't have empty constructor
  private double salary;

  // You have to manually code the constructor with parent's attribute
  public Staff2(String name, double salary) {
    super(name);
    this.salary = salary;
  }


  public static void main(String[] args) {

    Staff2 staff = new Staff2("John", 3000.0);
    Staff2 staff2 = new Staff2("Peter", 3000.0);

    System.out.println(staff.equals(staff2)); // false


    Staff2 s3 = new Staff2("Wick", 4000.0);
    Staff2 s4 = Staff2.builder()//
        .name("Karina")//
        .salary(6000.0)//
        .build();

        System.out.println(s4);


  }


}
