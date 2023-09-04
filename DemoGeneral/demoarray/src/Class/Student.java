package Class;

public class Student {

  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  public boolean isAdult() {
    // if (this.age>=18){
    // return true;
    // } return false;
    // return this.age >= 18 ? true : false;
    return this.age >= 18;
  }

  public static boolean isAdult(int age) {
    return age >= 18;
  }


  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(String Age) {
    this.age = age;
  }


  public static void main(String[] args) {
    Student student1 = new Student("John", "wick", 99);
    System.out.println(student1.getFirstName()); // John
    System.out.println(student1.getLastName()); // Wick
    System.out.println(student1.getAge()); // 99
    System.out.println(student1.fullName());
    System.out.print("\n");

    System.out.println(student1.isAdult()); // check student1.age is over 18? true
    System.out.println(Student.isAdult(18)); // check input is over 18? true
    System.out.println(Student.isAdult(99));

  }

}
