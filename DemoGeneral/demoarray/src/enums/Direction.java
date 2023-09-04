package enums;

public enum Direction { // special keyword since Java 1.5
  // 全局唯一, 4 objects (EAST, SOUTH, WEST, NORTH) 東南西北
  // new Direction ("EAST")
  // enums 係design一d野係全局使用既, 唔應該去改變
  // 1. public class Direction extends Enum
  // 2. enum is final class
  
  EAST('E', 90), 
  SOUTH('S', 180), 
  WEST('W', 270), 
  NORTH('N', 360);
  // 



  private char direction;
  private int degree;


  private Direction(char direction, int degree) {
    this.direction = direction;
    this.degree = degree;
  }

public char getDirection(){
  return this.direction;
}

public void setDirection(char direction){
  this.direction = direction;
}

public int getDegree(){
  return this.degree;
}

public void setDegree(int degree){
  this.degree = degree;
}

public boolean isOppsite(Direction direction){
  return (Math.abs(this.degree - direction.getDegree()) == 180);

}




  public static void main(String[] args) {
System.out.println( Direction.EAST.isOppsite(Direction.WEST)); // TRUE 東係咪西
System.out.println( Direction.WEST.isOppsite(Direction.EAST)); //TRUE 西係咪東
System.out.println( Direction.WEST.isOppsite(Direction.NORTH)); //FALSE 西係咪北
System.out.println( Direction.SOUTH.isOppsite(Direction.NORTH)); //true


  }



}
