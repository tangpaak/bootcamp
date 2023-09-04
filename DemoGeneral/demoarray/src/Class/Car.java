public class Car {

Intance Variables Instnandce 9>object
  int noOfWheel; // 0
  int capacity; // 0
  String color; // null

  // Empty Constructor
  public Car() {

  }

  // All arguements constructors (with all attributes)
  public Car(int noOfWheel, int capacity, String color) {
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color; // null
  }


  public int getnoOfWheel() {
    return this.noOfWheel;
  }


  public void setnoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }


  public int getcapacity() {
    return this.capacity;
  }

  public void setcapacity(int capacity) {
    this.capacity = capacity;
  }


  public Car(String color) { // (1) No return type, (2) Constructor name = Class name
    this.color = color;

  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "[" + this.getnoOfWheel() + " " + this.getcapacity() + " "
        + this.getColor();
  }

  public static void main(String[] args) {

    Person person = new Person();
    String str = new String("Hello");

    // Car example
    Car car1 = new Car(3, 5, null);
    Car car2 = new Car(0, 0, null);

    CarFactory carFactory = new CarFactory();

    car1.setColor("Black");
    car2.setColor("White");
    System.out.println(car2.getColor()); // white



    System.out.println(car1);
    // System.out.println(valueOf(car1));
    System.out.println(
        car1.getnoOfWheel() + " " + car1.getcapacity() + " " + car1.getColor());



  }



}
