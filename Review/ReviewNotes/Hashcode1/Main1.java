package Hashcode1;

public class Main1 {

  public static void main(String[] args) {
    Student s1 = new Student("100", "Alice");
    Student s2 = new Student("100", "Alice");

    System.out.println(s1.hashCode()); // represents the object reference
    System.out.println(s2.hashCode()); 
    System.out.println(s1.hashCode() == s2.hashCode()); // false, reference not same

  }


  public native int hashCode();
  
}
