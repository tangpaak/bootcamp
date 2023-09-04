package HashSet1;

import java.util.Objects;

public class Coordinate {

  int x;
  int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

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
