package Animal1;

public class Dog extends Animal {

private Dog(String name){
super(name); 
} // constructor

public static Dog of (String name){
  name = name == null ? "Default狗" : name;
  return new Dog(name);
 // Dog newDog = new Dog("name");
} // method of setting name

@Override
public String toString(){
  return String.valueOf(name);
}



public static void main(String[] args) {
  Dog dog = Dog.of("王阿狗");
System.out.println(dog);



}



  
}
