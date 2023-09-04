public class CarFactory {
  
// attributes ...

public void changeColor (Car car, String color){
car.setColor(color);

}

public static void main (String [] args){
  String car2 = "abc";
CarFactory carFactory = new CarFactory();
carFactory = changeColor(car2, "WHITE");
System.out.println(car2.getColor()); //white

}


}
