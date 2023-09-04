package Inheritance1.Animalsample;

public abstract class Animal {

  private String name;
  private int age;
  private int weight;
  private String somepurpose;

  public void Animal(String name, int age, int weight, String somepurpose) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.somepurpose = somepurpose;
  }

  public void someSound() {
    System.out.println("隨意叫");
  }

  public void makeSound() {
    System.out.println("隨意叫");
  }

  public void sleep() {
    System.out.println("安妮毛 sleepppp");
  }

  public final void doNothing() {
    System.out.println("唔做野");
  }

  public static void someStaticMethod() {
    System.out.println("some static method");
  }


  public void sound() {
    System.out.println("你個安妮毛voice係?");
  }


  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getWeight() {
    return this.weight;
  }



  public static void main(String[] args) {
    Animal dog1 = new Dog("肥仔狗", 10, 10);
    dog1.sound();
    System.out.println(dog1.getName());

    Cat cat1 = new Cat();
    Cat cat2 = new Cat("黑咪", 9, 9);
    cat1.sound();
    System.out.println(cat2.getName());

    Dog dog3 = new Dog("喪狗", 1, 1);
    dog1.sound();
    dog3.sound("a");
    dog3.sound("animal");

    //
    Cat cat3 = new Cat("加菲", 10, 10);
    Dog dog = new Dog("高飛", 2, 2);
    cat3.makeSound();
    cat3.sleep();

    dog1.makeSound();
    dog1.sleep();

    System.out.println("some purpose: "+ cat3.somepurpose);
    System.out.println("get some purpose: " + cat3.getsomepurpose());
    System.out.println("貓重量= " + cat3.getWeight() + "g"); 
    //同81行個分別係public同private, 所以一定要用Getter

    Animal.someStaticMethod();
    dog.someStaticMethod();



  }



}
