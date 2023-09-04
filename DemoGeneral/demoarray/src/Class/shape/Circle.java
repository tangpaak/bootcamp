package Class.shape;

public class Circle {

  private int id; // this is instance variable or attribute 
  private double radius;
  // pi係需要公家使用
  // static -> shared variable
  // final -> one time intiializaion ONLY
private static final double pi = 3.14159; // static variable or class variable

  private static int counter; // calculate the number of circle objects being created

  public Circle() {
    AddCounter(); // 每創造circle就counter++
    this.id = counter;
  }

  public static int AddCounter() {
    return ++counter;
  }

  public int getID() {
    return this.id;
  }

  public int getCounter() {
    return this.counter = counter;
  }

  public double area() {
    return Math.pow(this.radius, 2) * pi; // Math.pow次
  }

  public double cirumference() { // instance method
    return 2 * this.radius * pi; // 指向object本身attribute去做某d野, 所以一定有this先清楚d
    // this 係解將會放入黎既object
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius = radius;
  }



  public static void main(String[] args) {
    Circle c = new Circle(); // Contructor
    Circle CircleA = new Circle();
    Circle CircleB = new Circle();
    // circle.radius = 1;
    System.out.println(c.getRadius());

    c.setRadius(5);
    c.area();
    c.cirumference();

    System.out.println(c.area()); // 面積
    System.out.println(c.cirumference()); // 圓周
    System.out.println(c.getCounter());

  }

}
