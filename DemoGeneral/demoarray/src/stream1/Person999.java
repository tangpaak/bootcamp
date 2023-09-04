public class Person999 {

  String name;
  int age;

  public Person999(String name, int age){
    this.name = name;
    this.age = age;
  }


  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public boolean isEldenly(){
    return this.age >=65;
  }
 
  
}
