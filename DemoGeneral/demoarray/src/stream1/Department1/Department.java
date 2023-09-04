package Department1;

import java.util.Objects;

public class Department {


  String name;


  public Department(String name) {
    this.name = name;

  }

  @Override
  public String toString() {
    return "Dept[" //
        + " name = " + this.name//
        + "]";
  }

  // *** equals ***
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
      
    if (!(o instanceof Department))
      return false;

    Department department = (Department) o;
    return this.name == department.name; //
 
  }

  // *** hashCode ***
  @Override
  public int hashCode() {
    return Objects.hash(this.name);

  }


}
