package Inheritance1.Animalsample;

public class Cat extends Animal {

  private String name;
  private int age;
  private int weight;
  public String somepurpose;

  public Cat() {

  }

  public Cat(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.somepurpose = "貓既意義係 食+訓+玩+睇人產屎";
  }

  public void sound() {
    System.out.println("貓係Meow!");
  }

  @Override
  public void makeSound(){
    System.out.println("貓貓貓meow");
  }

  public String getsomepurpose(){
    return this.somepurpose;
  }

  public int getWeight(){
    return this.weight;
  }



}
