package polymorphism;

public class Demo {

  // Dynamic Polymorphism (Run-time) , only Runtime會發生d野

  public static void main(String[] args) {
    Building building = new House(); // new個仔出黎

    // compile time checks
    // building.getCapacity(); //compile error
    // building.print(); // complie error
    // run緊果陣既this

    building.print(); // I am 候時
    // complie-time confirm you can call print() method

    // In run time, will new an object
    // Run-time decide which print() is going to call
    // So, "building" variable call House's print () method

    building.print2(); // I am 候時
    building.print3(); // I am 錶定 <--original building既print3

    // Static Polymorphism (Complie-time)
    // Method Signature (Method Name + parameters)
    // Constructor Signature

    House house = new House();
    house.print("hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();
    // House house3 = new House("String"); // Constructor not found
    // house2.print(3L); // print(long) method not found

    long l1 = Long.valueOf(1L); // wrapper class ->unbox
    Long l3 = 3L; // wrapper class -< auto-box
    long l2 = 2; // upcasting
    int i2 = (int) 3L; // <-- cannot downcast

    // downcast

    Object obj = new Container();
    if (obj instanceof Cube) {
    Cube cube = (Cube) obj;// explicit downcast , down cast: Object -> Cube
    System.out.println("obj ia instance of Cube");
    }

    Object obj2 = new Cube();
    if (obj2 instanceof Container) {
      Container container = (Container) obj2;// explicit downcast , down cast: Object -> Cube
      System.out.println("obj2 is instance of Convertor");
    }

    //
    Object obj3 = new Clone();
    Cube Cube2 = (Cube) obj3; // java.lang.ClassCastException
    // runtime exception: Run-time polymorphism

    //兄弟姊妹唔可以用(Cube)轉, 但老豆可以用(Cube)轉
     
    Number number = Integer.valueOf(3);
    Double d1 = (Double) number; // java.lang.ClassCastException



  }



}
