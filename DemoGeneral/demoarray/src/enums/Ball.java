package enums;

public class Ball {

  private Color color; // String -> "RE D", " RED", "red", " RE D "


  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;

    if (!(o instanceof Ball))
      return false;

    Ball ball = (Ball) o;

    return this.color == ball.color;


  }


  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println("ball.getColor().name()= " + ball.getColor().name());


    // Object is topmost parent
    Object object = new Ball(Color.RED); // object is reference
    // Compile-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time check if object class has hashCode() method
    // Complie-time check if Ball class ingerit Object

    // Run-time object variable stores an address, point to a Ball object in heap
    // Run-time determine if Class Ball has hashCode() method.
    // If no, then invoke Class Object hashcode()
    // If yes, invoke the Class Ball hashCode()

    Color color = ((Ball) object).getColor(); //
    System.out.println("Ball(object) color is " + ((Ball) object).getColor()); // Compile-time type checking

    // Color extends enum.class. Enum extends Object
    Class<?> clas = color.getClass();
    System.out.println(clas.getName()); // Color
    System.out.println(clas.toString()); //class color
   

if (Color.BLUE instanceof Color){ //true
  System.out.println("Color,Blue is instance of Color");
}
double a = 1.01;
Object a1 = a - 'a';
System.out.println(a1.getClass().getName()); // Double, 運算轉左做double - char, 套落去就會變double

Object o = 1 - 'a'; // int -> Integer
System.out.println(o.getClass().getName()); // Integer
Object o2 ='b';
System.out.println(o2.getClass().getName()); // Character

Object o3 = new Ball (Color.GREEN);
System.out.println(o3.getClass().getName()); // Ball

System.out.println(o3.getClass().isEnum()); // false
System.out.println(clas.isEnum()); // true





  }
}
