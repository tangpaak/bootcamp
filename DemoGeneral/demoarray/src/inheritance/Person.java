package inheritance;

// public final abstract class Person { // class係唔可以比人final abstract
public abstract class Person { // abstract係形容世界無Person

  private int age;// 0
  private double height; // 0.0

  public Person() {
    // 規矩就係要empty constructor
  }

  public int getAge() {
    return this.age;
  }

  public double getHeight() {
    return this.height;
  }

  // May contain instance method with implementation
  public void run() {
    System.out.println(" I am Person, running ");
  }

  // May cotain abstract method (without implementation)
  public abstract void sleep();



}
