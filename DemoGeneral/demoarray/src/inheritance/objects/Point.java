package inheritance.objects;

import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;

  }

  @Override
  public String toString() {
    return "x[=" + this.x + ", y =" + this.y + "]";
  }


  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    //check reference

    if (!(o instanceof Point))
      return false;
    //check class

    Point point = (Point) o;
    // return point.x == this.x && point.y == this.y;
    // return ball.color.equals(this.color) <- String唔可以.equals()
    return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
    //check value
  }


  public static void print(Long l) {
    System.out.println("l=" + l);
  }


  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);

    System.out.println(p1 == p2); // false
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false
    System.out.println(p3.toString()); // x = 1, y = 2

    //
    Long l = 1L; // 1, unbox -> primitive long
    int i = 1; // 1, auto-box - > Integer
    Point.print(10L); // long -> autobox -> Long
    // Point.print(10); <- cannot convert int to Long, complie error

    Point.print((long) 10);// int ->long -> autobox -> Long


    if (Long.valueOf("100") < 101) {
      // Convert Long 100 -> long 100
      // 101 -> int
      // long vs int, compare

    }

    if (Boolean.valueOf(false).equals(false)) {
      // right: false - > boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean

    }


    // unbox Long and upcast int
    System.out.println(l == i); // true, finally long vs long
    // *** Big Bug here
    System.out.println(Objects.equals(l, i));
    // <-- 用緊long既equals, false ?????
    // 因為放object a係int, 但object b唔係int, 出既結果就唔岩了
    l.equals(i);
    System.out.println(Objects.equals(Long.valueOf(1L), Integer.valueOf(1)));


  }



}
