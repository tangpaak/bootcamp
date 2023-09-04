package Class.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Square {

  private final Edge[] edges; // instance variable

  // private final Double length = 3.0; // instance variable


  public Square(double length) { // 封裝-> getter setter, 讀取同埋存寫
    if (length <= 0.0)
      length = 1.0d;
    int id = 0;
    this.edges = new Edge[4]; // [ null, null, null, null]
    this.edges[0] = new Edge(++id, length, "RED");
    this.edges[1] = new Edge(++id, length, "RED");
    this.edges[2] = new Edge(++id, length, "RED");
    this.edges[3] = new Edge(++id, length, "RED");
    // Square.resetId();
  }

  public static Square Of(double length) {
    return new Square(length);
  }

  public static Square Of(String length) {
    return new Square(Double.valueOf(length));
  }



  // public double getLength() {
  // return this.length;
  // }

  // public void setEdge (Edge[] edges){ // ()入面既係解出面放條address入面
  // this.edges = edges;
  // }

  public Edge getEdges(int edgeId) {
    if (edgeId == 0) {
      System.out.println("id cant be 0");
    }
    return this.edges[edgeId - 1];
  }

  private Edge[] getEdges() {
    return this.edges;
  }

  public void modify(double length) {
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);

  }

  public void modify(int edgeId, String color) {
    this.getEdges()[edgeId].setColor(color);

  }



  @Override
  public String toString() {
    return Arrays.toString(this.edges);
  }


  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);
    // s1 -> edges[0] color -> "YELLOW"

    s1.getEdges()[0].setColor("YELLOW");
    System.out.println(s1.getEdges()[0].getColor()); // YELLOW
    // System.out.println(s1.getEdges(1).getColor()); //  index -1
    // getEdges() -> 條Array會有4 address. -> getEdges()[0] -> 第0個位既address
    // s1.getEdges()[0]; <- 攞番第0個位果個address

    System.out.println(s1.getEdges(1));
    // s1.getEdges() =
    Square s10 = Square.Of(5.0d);
    Square s11 = Square.Of(4.5f);
    Square s12 = Square.Of("5");




  }


}
