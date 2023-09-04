package Inheritance1.Hiding;

public class child extends Parent {

  public static void display(){
    System.out.println("我係細佬");
  }




  public static void main(String[] args) {
    Parent.display(); 
    child.display();

    Parent parent = new child();
    parent.display();

  }
  
}
