package general;
public class Rectangle {

public static double area (double length, double width ) {
return (length * width);
}

public static double perimeter (double length, double width){
return (length + width) * 2;
}


  public static void main (String[] args ){

// area
double area1 = area (5.0d, 3.0d);
double area2 = area (13.0d, 5.0d);
System.out.println("area1=" + area1 + " " + "area2=" + area2);

// perimeter
double perimeter1 = perimeter(10.0d, 90.0d);
double perimeter2 = perimeter(55.0d, 44.0d);
System.out.println("perimeter1=" + perimeter1 + " " + "perimeter2=" + perimeter2);






  }
  
}
