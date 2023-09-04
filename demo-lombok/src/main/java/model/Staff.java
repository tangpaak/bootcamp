package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode
@SuperBuilder 
@Builder
// @AllArgsConstructor

public class Staff extends Human { //<--since Human don't have empty constructor
private double salary;

// You have to manually code the constructor with parent's attribute
public Staff(String name, double salary){
  super(name);
  this.salary = salary;
}

@Override
public String toString(){
  return "[name = " + this.name + ", salary = " + this.salary +  "]";
}


public static void main(String[] args) {
  
  Staff staff = new Staff("John", 3000.0);
  Staff staff2 = new Staff("Peter", 3000.0);

  System.out.println(staff.equals(staff2)); //true -> since you don't call super to check (@EqualsAndHashCode)

  Staff s3 = Staff.builder() //<-- builder
  .name("Johnny Depp")
  .salary(5000.0)
  .build();

System.out.println(s3);




}

  
}
