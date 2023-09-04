package HashSet1;
import java.util.Arrays;
import java.util.HashSet;

public class HashSet1 {

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("abc"); // true
    strings.add("def"); // true
    System.out.println(strings.size()); // 2

    // **HashSet
    // HashSet天生會消除duplicate既element
    strings.add("abc");
    System.out.println(strings.size()); // result is 2,因為唔會額外有
    boolean result = strings.add("abc");
    System.out.println(result); // false,
    // 因為加左個abc係3 ("abc" "def" "abc"重複左), 而實際outcome係2 ("abc" "def"無重複)

    if (strings.add("def")) { // false
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example2:
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1); // 我咪整左Coordinate int x int y
    System.out.println(coordinates.add(c1)); // true
    // Hashset -> 加左c1落去 (1,1)

    // c1.equals(c2)
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c2)); // false
    // Hashset -> 再加c2 (1,1) -> (1,1) -> 指住個address一樣
    // HashSet add() -> Cooidingate c2.equals(any of coordinates in hashset)
    // //////////////-> c2.equals(c1) - > true
    // //////////////-> Hashset not allow duplicates
    // //////////////-> return false;
    System.out.println(coordinates.size()); // 1 -> "hello""

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true
    System.out.println(coordinates.size()); // 2, 座標依家Hashset有2粒

    Coordinate c4 = new Coordinate(2, 2);
    System.out.println(coordinates.add(c4)); // true
    System.out.println(coordinates.size()); // 3

    // Example 3: Without Override equal() method
    HashSet<Book1> books = new HashSet<>();
    System.out.println(books.add(new Book1("Eric","")));// true
    System.out.println("Step1 add eric " + books); // print唔到個eric出黎 ?????? 又唔係Array to String, 要用咩方法???

    System.out.println(books.add(new Book1("Eric",""))); // true, diff address
    System.out.println("Step2 add eric again " + books);

    System.out.println(books.add(new Book1("Steven","")));
    System.out.println("Step3 add Steven " + books); // true, diff address
    // 除非我寫左Override既equals同埋hashCode, 否則佢都係會入到落HashSet
    // 因為第二個Eric唔會阻佢入 (different address)


  }


}
