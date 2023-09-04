package inheritance.Machines;

import java.util.Objects;

public class Laptop extends Machine {

  // Laptop is kind of machine
  // student 可以係 extends person, 唔可以extends dinaosur

  // Laptop is subclass (children), Machine is superclass(parent)
  // Inherit Machine attribute ()"double weight")
  // Inherit Machine methods (start(), stop())
  // 個仔(children) 可以override個老豆 (parent)

  // double monitor

  private Keyboard keyboard;
  private Monitor monitor;

  private int volume;

  // subclass must call superclasss constructor

  public Laptop() { // empty constructor
    // super(); <- create a new Machine();

    // imoplicitly call superclass empty constructor

    // 如果你machine無打empty constructor, 呢度call唔到machine(super class)既empty constructor就行唔到
    // 雖然default係有set empty constructor, 但係你要習慣任何class一定要打定empty constructor
    // 因為你最基本一定會定義class 有包含d乜, 例如以下 :
    // public Machine(double weight) {
    // this.weight = weight;
    // }

  }


  public Laptop(Keyboard keyboard, Monitor monitor) {
    // imoplicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }


  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
    this.keyboard = new Keyboard(buttonType, noOfButton); // 係constructor入面new野
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // call new machine(5) // super(); + this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String color, Keyboard keyboard, Monitor monitor) {
    super(color); // call new machine(5) // super(); + this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Laptop))
      return false;

    Laptop laptop = (Laptop) o;

    return Objects.equals(laptop.keyboard, this.keyboard)
        && Objects.equals(laptop.monitor, this.monitor);

  }


  @Override // *** Method Overriding
  public void start() {
    // super.start(); // <- call番老豆既method
    System.out.println("Laptop start...");

  }

  @Override // Method Overriding
  public void stop() {
    System.out.println("Laptop stop...");
  }
  // 如果打左Override就知老豆有無打start()
  // Complier 會double check老豆d野岩唔岩
  // 使用 @Override 是一個好的實踐，
  // 因為它可以確保重寫的方法與它覆蓋的方法具有相同的名稱、參數類型、返回類型和異常類型。
  // 這有助於防止微妙的錯誤，並使代碼更易於理解和維護。


  // public static String staticMethod( String x, String y ){

  // } // Cannot override the father final method


  public void mute() {
    this.volume = 0;
  }



  public static void main(String[] args) {

    // 仔 children
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0);
    System.out.println(laptop.getWeight()); // 3.0
    laptop.start(); // machine start -> Laptop start (since @Override)
    laptop.stop();// machine stop -> Laptop stop (since @Override)

    // 老豆 parent
    Machine machine1 = new Machine();
    machine1.setWeight(5.0d);
    System.out.println(machine1.getWeight()); // 5.0
    machine1.start(); // Sunny machine start...
    machine1.stop(); // Sunny Machine stop...


    Laptop laptop2 = new Laptop(); // empty constructor
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight()); // 10.0

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("abc", "def")); // abcdef
    System.out.println(Laptop.staticMethod("abc", "def")); // abcdef
    // laptop3.staticMethod("abc", "def"); //abcdef not recommended to write this way



  }


}
