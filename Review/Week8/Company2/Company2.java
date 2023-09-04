package Company2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import Company1.Staff;

public class Company2 {

  private Staff[] staffs; // 5

  public Company2() {

  }

  public Company2(Staff[] staffs) {
    this.staffs = staffs;
  }

  public Staff[] getStaffs() {
    return this.staffs;
  }

  public void add(Staff staff) {
    Staff[] original = this.staffs; // reference
    this.staffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < original.length; i++) {
      this.staffs[i] = original[i];

    }
    this.staffs[this.staffs.length - 1] = staff;
  }


  public void remove(Staff staff) {
    // Step 1: find the remove staff [index]
    int indexToRemove = -1;

    for (int i = 0; i < this.staffs.length; i++) {
      if (this.staffs[i] == staff) {
        indexToRemove = i;
        break;
      }
    }
    // Step 2: create new staff and 覆蓋 the old staff, then delete [length-1] at last
    if (indexToRemove != -1) {
      Staff[] newStaffs = new Staff[this.staffs.length - 1];

      int process = 0;
      for (int i = 0; i < this.staffs.length; i++) {
        if (i != indexToRemove) {
          newStaffs[process] = this.staffs[i];
          process++;
        }
      }
      this.staffs = newStaffs; // new staff覆蓋 original staff
    }
  }

  public static void main(String[] args) {
    Company2 company = new Company2();
    company.add(new Staff(1, 5000, "John"));
    System.out.println(company.staffs.length); // 1
    company.add(new Staff(2, 10000, "Mary"));
    System.out.println(company.staffs.length); // 2

    Arrays.stream(company.getStaffs()) //
        .filter(s -> s.getSalary() > 20000) //
        .map(e -> new Person(e.getName())) //
        .collect(Collectors.toList());



  }


}

