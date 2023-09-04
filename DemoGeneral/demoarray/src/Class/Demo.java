public class Demo {
  
public static void main (String [] args){

Car car = new Car();
Car car2 = new Car(4, 7, "Red");
System.out.println(car2.getcapacity());
System.out.println(car2.getColor());
System.out.println(car2.getnoOfWheel());



//print car2
Person person = new Person(); //Constructor, class一定要透過constructor去new d野
Computer computer1 = new Computer(0, 0, null);
String str = new String ("Hello"); //<-

System.out.println(car2.getcapacity());
System.out.println(car2.getColor());
System.out.println(car2.getnoOfWheel());

//car2 = new Car(5, 10, "Yellow") ; later 
car2.setColor("YELLO"); // car2-> objeect reference, storing the object
car.setColor("BLUE");
//car2 -> YELLO
//car -> BLUE


System.out.println(car2); // Car@6b95977 -> Object reference storing object
car2 = new Car(3,4, "Black"); // 依家有三個ball, "Yello", "Blue", "Black"
car2 = null; //指住null, release memory, 減少ram負荷 
car2 = new Car(10, 3, "Pink"); // 指住新既ball 即係"Pink"



// Integer
person.setAge(15);
person.getAge(); // 15


Student student = new Student ("Eric","Lau",30);
System.out.println(student);





}




}
