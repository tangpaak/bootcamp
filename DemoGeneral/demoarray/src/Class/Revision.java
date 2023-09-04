package Class;

public class Revision {

  // instance variable (non-static)
  String name; // non- primitive -> address

  public void print(String input) {
    System.out.println("hello" + input + " " + this.name);
  }

  public static void print2(String input) {
    System.out.println("hello " + input);
  }


  public static void main(String[] args) {

    Revision r1 = new Revision();
    r1.name = "John";
    Revision r2 = new Revision();
    r2.name = "John";
    System.out.println(r1 == r2); // false
    System.out.println(r1.name == r2.name); // true

    r1.print(" world");
    Revision.print2("world");



    r2.name = new String("John");
    System.out.println(r1.name == r2.name); // false

    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1 == s2); // true, Literal Pool

    String s3 = new String("abc");
    System.out.println(s1 == s3); // false

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2); // true, Since cached range is -128 to 127, outside of this range will be new object

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4); // false

    String temp = s1;
    s1 += "d";
    System.out.println(temp == s1); // false



  }

}
