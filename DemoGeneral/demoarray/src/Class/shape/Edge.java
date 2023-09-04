package Class.shape;

public class Edge {

  private int id = 1;
  private double length;
  private String color;


  public Edge(int id, double length, String color) {
    this.id = ++id; // ++左先放入id
    this.length = length;
    this.color = color;

  }

  // public static void resetId(){ //無用過this, 所以可以reset counter
  // counter = 0;

  // }

  @Override
  public String toString() {
    return this.length + this.color;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    if (this.color.isBlank())
      this.color = color;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public static void main(String[] args) {
    // Edge[] edge1 = new edge[];


  }


}
