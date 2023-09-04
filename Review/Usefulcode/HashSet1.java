package Review.Usefulcode;

import java.util.HashSet;

public class HashSet1 {


public static void main(String[] args) {
  HashSet<Coordinate> coordinates = new HashSet<>();
  Coordinate c1 = new Coordinate(1, 1);
  System.out.println(coordinates.add(c1)); // true
  // Hashset -> 加左c1落去 (1,1)

  Coordinate c2 = new Coordinate(1, 1);
  System.out.println(coordinates.add(c2)); // false
  // Hashset -> 再加c2 (1,1) -> (1,1) -> 指住個address一樣

  System.out.println(coordinates.size()); // 1 -> "hello""

  Coordinate c3 = new Coordinate(2, 1);
  System.out.println(coordinates.add(c3)); // true
  System.out.println(coordinates.size()); // 2 

  Coordinate c4 = new Coordinate(2, 2);
  System.out.println(coordinates.add(c4)); // true
  System.out.println(coordinates.size());  //3
}

      // Example2:

}


public class Coordinate {

@Override
public boolean equals(Object o) {
  if (this == o) //reference 地址
    return true;

  if (!(o instanceof Coordinate))
    return false;  //class

  Coordinate coordinate = (Coordinate) o;
  return this.x == coordinate.x //value
      && this.y == coordinate.y;
      
}

@Override
public int hashCode(){ // (1,1)
  return Objects.hash(this.x, this.y);
}

}