package general;
public class Operators {
  public static void main(String[] args) {
    int a = 1;
    a = a + 1;// 2
    a = a - 2; // 0
    int b = 10 / 5; // 2
    b = b * 3 + 5; // 11
    System.out.println("a append b=" + a + b);

// + 1 operation
    int x = 1;
    x = x + 1;
    x++; // means x = x+1;
    ++x; // means x = x+1;
    x += 1;// means x = x+1;
    System.out.println("x=" + x); // x=5
// -1 operation
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println("y=" + y); // y=6

    // other +,-,*,/
    int z = 4;
    z = z + 2;
    z += 2; // ans is 8
    // 加+
    int i = 6;
    i = i - 3;
    i -= 3; // ans is 0
    // 減-
    int w = 9;
    w = w * 3;
    w *= 3; // ans is 81
    // 乘*
    int u = 81;
    u = u / 9;
    u /= 3;
    // 除/
    // u= 9/3, so u = 3
    System.out.println(w);

    int integer = 12 % 5; // ans is 2
    int integer2 = 12;
    integer2 %= 5; // ans is 2
    System.out.println(integer);
    System.out.println(integer2);

    // ++, --
    int m = 3;
    m++; // 4
    int preIncrement = ++m; // ++ first ? or assignment first? should be assign first
    // +1 first, assignment later
    System.out.println("preIncrement=" + preIncrement); // ans is 5

    int postIncrement = m++;
    // assignment first, m+1 later, m still is 5 on column 61,
    System.out.println("postIncrement=" + postIncrement);// ans is 5
    System.out.println("m=" + m);// ans is 6

    // example of -- usage
    int n = 5;
    n--; // 4
    int preIncrement1 = --n; // 3
    System.out.println("preIncrement1=" + preIncrement1);

    int postIncrement1 = n--;// still is 3, as assignment first,
    System.out.println("postIncrement1=" + postIncrement1);// 3
    System.out.println("n=" + n);// 2

    int g = 3;
    g -= ++g;
    System.out.println(g);// -1

//String +=
String str = "hello";
str += "world"; // hello world as result
System.out.println(str);




  }
}
