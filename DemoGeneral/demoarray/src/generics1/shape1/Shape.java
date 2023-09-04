//
// public abstract class Shape<T>{
// T value; //<--咁樣寫係唔對路, 形容唔到
// int area;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape {

  abstract double area();

  // 呢度係出面: (shape-> circle)
  // circle -> ? extends Shape -> OK

  public static double area(List<? extends Shape> shapes) { // 假polymorhsim
    // public static double area(List <? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    // shapes.add(new Circle()); // 先入為主 <--not ok, since 係入面
    // data type is not right
    // compile-time check, type-safe ?????

    for (Shape shape : shapes) {
      shape.area();
      total.add(BigDecimal.valueOf(shape.area()));
    }

    return total.doubleValue();
  }
  // shape > Circle
  // shape > 三角形
  // shape > 正方形

  public static void main(String[] args) {

    // List<? extends Shape> shapes = new ArrayList<>(); // <--咁樣寫係會look柒 因為你declare左個門檻極闊 佢唔會比下面任何野放入去shape
    // //你定義左佢係四不象
    // shapes.add(new Circle());// <--咁樣係寫唔到 因為上面? extends Shape, 你放唔到Circle比四不象
    // shapes.add(new Square());//
    // shapes.add(new <? extends Shape>()); // <--四不象都係look柒


    List<Shape> shapes2 = new ArrayList<Shape>();
    shapes2.add(new Circle());
    shapes2.add(new Square());

    Shape shape3 = new Circle();
    Shape shape4 = new Square();
    ArrayList <Shape> shapesA = new ArrayList <Shape>();
    // shapesA = new ArrayList <Circle>(); // compile error

    List<? extends Shape> list = new ArrayList <Circle>();
    list = new ArrayList<Square>(); // <-支針由Circle指住Square
    list.add(new Circle()); // 呢句唔得 compile check refer declaration
    //所以見到唔可以隨意加Circle入去, 因為你有機會突然轉左Circle做Square, 所以唔比你add

    List<Shape> shapesB = new ArrayList<Shape>();
    shapesB.add(new Shape()); // abstract class
    shapesB.add(new Square());

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());

    //  Shape list 唔可以直接變Circle list
    List<Shape> shapesC = new ArrayList<Shape>();
    shapesC = new ArrayList<Circle>();
    // 因為ShapeC只可以放Circle同Square
    //你唔可以改變佢放List Circle




  }


}


