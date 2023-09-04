package Inheritance1.Animalsample;

public class Dog extends Animal{

  private String name;
  private int age;
  private int weight;


public Dog(){

}

public Dog(String name, int age, int weight){
this.name = name;
this.age = age;
this.weight = weight;

}


public void sound(){
  System.out.println("狗叫更係汪!");
}

public void sound(String s){
  if(s == "animal")
  super.sound();

  }

@Override
public void makeSound(){
  System.out.println("人唔叫狗都吠");
}

@Override
public void sleep(){
  System.out.println("狗訓");
}

public static void someStaticMethod(){
  System.out.println("狗既 some static method");
}


}

  

