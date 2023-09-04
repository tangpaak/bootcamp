package inheritance.Machines;

public class Machine {

  private double weight;
  private String color;

  public Machine() {

  }

  public Machine(double weight) {
    this.weight = weight;

  }

  public Machine(String color) {
    this.color = color;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void start() {
    System.out.println("Sunny Machine Start ...");
  }

  public void stop() {

    System.out.println("Sunny Machine Stop ...");
  }

  public static void stop(int code) {
    Machine machine = Machine.produce(code);
    machine.stop(); // different child class will have different implementation
  }

  public static final String staticMethod(String x, String y) {
    return x + y;
    // 點解要final? 因為唔想child去改佢d野 可能關於d業務既可能性
  }


  // Factory Pattern
  public static Machine produce(int code) { // cannot use Laptop
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();

    }
    return new Machine();

  }


  public static void main(String[] args) {

    Machine machine1 = Machine.produce(1); // Machine
    machine1.stop(); // Machine Stop...
    Machine machine2 = Machine.produce(2); // Laptop
    machine2.stop(); // Laptop Stop...


    System.out.println("Machine produce " + Machine.produce(1));
    System.out.println("Machine produce " + Machine.produce(2));

    boolean stopCondition = 3 > 2;
    if (stopCondition) {
      Machine.stop(1); // Machine Stop ...
    }

  }

}
