package inheritance.grandparent;

import java.util.Arrays;

public class C extends B //extends D <-- cannot two-line inheritance

{
  public void print(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }


  public static void main(String[] args) {
    C c = new C();
    c.num = 10;  // from A (grand parent)
    c.str = "hello"; // from B (parent)

    c.setNum(100); // from A (grand parent)
    c.setStr("abc"); // from B (parent)

    c.print(5); // 100 5 <-- from A (grand parent)
    c.print("def"); // abc def  <-- from B (parent)
    c.print(new int[] {-1, 0, 2}); // [-1, 0, 2] <-- from C



  }



}
