package Inheritance1.Override1;

public class ClassB  extends ClassA {

  String string;
  
public void ClassB (String string){
  this.string = string;
}


@Override
public String getString(){
  return "print一d野係Class B 唔係Class A";
}


public static void main(String[] args) {
  ClassB str = new ClassB();
  System.out.println(str.getString()); //"print一d野係Class B 唔係Class A";



}

}
