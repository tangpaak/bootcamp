import java.util.Arrays;
import java.util.List;

public class Student {

  // Outer Class
  // Can access static nested class attribute

  // constructor, getter, setter, static method & variable

  // method -> Bag.method, instance variable

  // static nested class:
  // static class意思係佢係獨立既
  // 放係入面既意思係Bag Belongs to Student
  // Student 可以好輕鬆access到Bag既野
  // Bag如果只係Student玩既, 就可以直接private左佢

  // static nested class
  // Inner static class (Bag) cannot acces outer class (Student)

  String name;
  Bag bag;

  public Student(String string) {
    this.name = name;
    bag = new Student.Bag();
  }

  public Student() {

  }

  // public int getBagSize() {
  // return this.bag.getSize();
  // }

  public int getSize() {
    return new Student.Bag().getSize(); // new左個student.bag先可以getSize
  }

  public void clearBag() {
    Bag.clear(this.bag); // Outer Class can access "Static nested class" static method
  }

  public String getName() {
    return this.name;
  }

  public static int add(int a, int b) {
    return a + b;
  }


  @Override
  public String toString() {
    return "Student[name=" + this.name//
        + this.bag + "]" //
        + "]";
  }

  /////////////////////////// BAGGGGGGGGGGGGGGGGGGGGGGGGGGG
  public static class Bag {
    int size; // 0
    List<String> strings;
    // constructor
    // getter, setter
    // static method & variable
    // instance method


    public int getSize() {
      return this.size;
    }

    // Clear method
    public static void clear(Bag bag) {
      bag.strings.clear();
      // add(1 + 3); // compile error
    }

    // public void printStudentGrade() {
    //   System.out.println(Student.this.getScore());
    // }

    public static void printHello(){
      Grade.printHello();
    }

    @Override
    public String toString() {
      return "Bag[" + this.size //
          + "]" + "Strings=" + this.strings + "]";
    }

  }



  // inner class ( non- static nested class)
  ///////////////////////////// Gradeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
  public static class Grade {

    private int score;

    public Grade(){}

    public Grade(int score) {
      this.score = score;
    }

    public int getScore() {
      return this.score;
    }

public char getGrade(){
switch (this.score){
  case 90:
  return 'A';

  case 80: 
  return 'B';

  case 70: 
  return 'C';

  default:
  return 'F';
}
}


    public void printStudentName() {
      System.out.println(Student.this.getName());
    }

    public static void printHello() {
      System.out.println("hello");
    }


  }


  public static void main(String[] args) {
    Bag b1 = new Bag();

    Student student = new Student("John Wick"); // Student's constructor
    Student.Bag bag = new Student.Bag(); // Bag's constructor
    System.out.println(bag.getSize()); // 0
    System.out.println(student.getSize()); // 0

    // Grade
    Student.Grade grade = student.new Grade(70); // John wick儲左個Grade
    Student.Grade g2 = new Student("Dog").new Grade(90);
    grade.printStudentName(); //null
    System.out.println(g2);






  }



}
