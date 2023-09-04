package Company1;
import java.util.ArrayList;
import java.util.List;

public class Company{
  List<Staff> staffs;
  List<List<Staff>> staffLists;
  private static int counter;


  public Company() {
    staffs = new ArrayList<>();
    staffLists = new ArrayList<>();
  }

  public Company(List<Staff> staffs) {
    this.staffs = staffs;
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
    counter++;
  }

  public List<Staff> getStaffs() {
    return this.staffs;
  }

  /**
   * GET staff name by staff id
   * @param staffid
   * @return
   */

  public String getStaffName(int staffId){
    return this.staffs.stream()//
    .filter(s -> s.getId() == staffId) // List<Staff>
    .map(s -> s.getName()) // Convert List <Staff> to List <String>
    .findAny() //Optional <String>
    .orElse(null);
  }

  public static void main(String[] args) {
    Company company = new Company();
    System.out.println(company.getStaffs().add(new Staff(1, 20000, "John"))); // True
    company.add(new Staff(2, 10000, "Peter"));

    System.out.println(company.getStaffName(1));   // "John"

    

      
}



}


