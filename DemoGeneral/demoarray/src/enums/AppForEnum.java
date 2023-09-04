package enums;

public class AppForEnum {

  public static void main(String[] args) {
    // enum
    // 1. Finite number of members
    // Example 1 : (Direction : LEFT, RIGHT, UP, DOWN)
    // Example 2 : (Weekday: Monday, Tuesday ...)
    // Example 3: (Double Entry: Debit, Credit)

    System.out.println("Direction.EAST= " + Direction.EAST); // result is EAST, 背後係call緊 EAST.name()
    System.out.println("Direction.EAST= " + Direction.EAST.name());
    System.out.println("Direction.EAST= " + Direction.EAST.toString()); // return this.name
    //
    System.out.println("Direction.NORTH= " + Direction.NORTH);

    //
    Direction east = Direction.EAST; // TBC(heap) // enum set做EAST
    System.out.println((east == Direction.NORTH)); // false
    System.out.println(east != Direction.NORTH); // true
    // == and != are checking te object reference

    // values() -> loop
    for (Direction d : Direction.values()) { // Direction.values() -> static method?????
      System.out.println(d.getDirection());
    }



    // 2. Growth of Enum
    System.out.println("Direction.EAST.ordinal()= " + Direction.EAST.ordinal()); // 0
    System.out
        .println("Direction.SOUTH.ordinal()= " + Direction.SOUTH.ordinal()); // 1
    // getter setter
    System.out.println(east.getDegree()); // 90
    System.out.println(east.getDirection()); // E


//
Color ball = Color.RED;
System.out.println(ball.getCode());
System.out.println(ball.getColor());






  }



}
