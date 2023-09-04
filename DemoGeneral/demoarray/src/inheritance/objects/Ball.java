package inheritance.objects;

public class Ball {

  private String color;

  public Ball() {

  }

  public Ball(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(Object o) { // instance method
    // if address same, values insides the object must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball)) //
      return false;

    Ball ball = (Ball) o; // downcast

    return ball.color.equals(this.color);
  }

  @Override
public String toString(){

  return "[color= " + this.color //
  + "]" ;
}


  public static void main(String[] args) {
    Ball b1 = new Ball("Blue"); // address 1
    Ball b2 = new Ball("Blue"); // address 2

System.out.println(b1 ==b2); //false
System.out.println(b1.equals(b2)); //true, checking color, instead of 

System.out.println(b1); //[color= Blue]
System.out.println(b1.toString()); //[color= Blue]
  }

}
