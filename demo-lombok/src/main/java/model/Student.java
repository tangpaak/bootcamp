package model;

import javax.annotation.processing.SupportedSourceVersion;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

// @NoArgsConstructor
@RequiredArgsConstructor // The Minimal args to create Student Object
@AllArgsConstructor


@SuperBuilder
public class Student extends Human{
  // No final and no @Nonnull attribute in the class
  private int age;

  public int getAge(){
    return this.age;
  }



  public static void main(String[] args) {
    Student student = new Student(); // come from RequiredArgsConstructor
    System.out.println(student.getAge()); //0
    Student s2 = new Student(10); 
    System.out.println(s2.getAge()); //10






  }
}
