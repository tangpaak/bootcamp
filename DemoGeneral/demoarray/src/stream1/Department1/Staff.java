package Department1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {

  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance) {

    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  @Override
  public String toString() {
    return "Dept[" //
        + " name = " + this.name//
        + " "//
        // + "department = " + this.department// 唔洗寫department, 因為groupingBy已經幫你去改左
        + "]";
  }


  public static void main(String[] args) {
    List<Staff> staffs =
        Arrays.asList(new Staff("Mary", new Department("HR"), 50), //
            new Staff("Peter", new Department("IT狗"), 60), //
            new Staff("Eric", new Department("IT狗"), 70)); //

    // 1. Map <Department , List <Staff>>
    Map<Department, List<Staff>> deptMap = staffs.stream() //
        .collect(Collectors.groupingBy(staff -> staff.department));

    // *** 要Override番HashCode同埋equal先可以做到print peter同eric
    deptMap.forEach(
        (dept, staffList) -> System.out.println(dept + " " + staffList));

    for (Staff staff : deptMap.get(new Department("IT狗"))) {
      System.out.println(staff.name);
    }

    // 2.
    Map<Boolean, List<Staff>> gradeMap = staffs.stream()
        .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));

    gradeMap.entrySet().stream() // list, set-> stream()
        .forEach(e -> System.out.println(e));



  }

}
