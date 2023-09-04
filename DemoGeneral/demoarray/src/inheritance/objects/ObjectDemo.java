package inheritance.objects;

import inheritance.shapes.Circle10;
import inheritance.shapes.Shape;

public class ObjectDemo {

  // Rule 1 = All classes extends Object Implicitly
  String name;

  @Override
  public String toString() {
    return this.name;
  }

  public static void main(String[] args) {
    // Example 1 = Objectdemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    // hash code -> int // 咩唔夠位裝野?????
    objectDemo.hashCode(); // another presentation of object reference
    // 32-bit咁短既range, 係裝唔到你部機所有野
    // Because hash code has a short range of value storage
    // so, it cannot store all memory address (object reference) in your machine

    int[] arr = new int[] {1, 2, 3}; // [I@6b95977 <-- hash code
    System.out.println(arr.toString()); // 佢係print緊hash code出黎, 所以java係middle level language, 仲有再lower d(hash code)

    String str = "abc";
    System.out.println(str); // 平時print str就係print緊value, 因為return this.str
    // abc

    System.out.println(objectDemo); // objects.ObjectDemo@7344699f
    System.out.println(objectDemo.toString()); // objects.ObjectDemo@7344699f
    // 唔override既情況下, 其實係call緊toString(),
    // 第8行 override左就會出"hello"

    // Example of hashcode:
    System.out.println("abc hashcode()=" + str.hashCode()); // 96354???
    // a * 31^2 + b* 31^1 + c
    System.out.println(97 * Math.pow(31, 2) + 98 * 31 + 99);


    // Integer既hash code就係佢自己
    Integer i1 = 3;
    System.out.println("i1.hashCode()=" + i1.hashCode()); // 3
    Long l1 = 10000000000000L;
    System.out.println(l1.hashCode()); // overflow -> 100?

    //
    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    System.out.println(a); // object.ObjectDemo@4e0e2f2a -> null?????
    System.out.println(b); // object.ObjectDemo@4e0e2f2a -> null
    if (a == b) { // address
    }

    // equals ()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println("s1.equals(s2)=" + s1.equals(s2)); // true
    // 整class一定要有ID, 因為要idenify每一個物品係唔同,
    // 如果唔咁樣set既話, 果兩個物品d特徵一樣, 佢地就會係define做同一樣野

    // instanceOf, Object.class
    Object obj = new String("abc");

    System.out.println(obj instanceof String); // true
    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    // chapter 17
    Shape shape = new Circle10(5.0d);
    // shape.print(); //no print ()method in shape
    // Hide Child print() method
    Circle10 c = (Circle10) shape;
    c.print(); // I am circle10

    // Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); // true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true

    // Primitives, for comparsion, we use ==



    // Wrapper Class, for comparsion, we use equals
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println("j1 compre j2 128= " + j1.equals(j2)); // true
    j1 = 127;
    j2 = 127;
    System.out.println("j1 compre j2 127= " + j1.equals(j2)); // true

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2)); //true
    


    // char sequence



  }

}
