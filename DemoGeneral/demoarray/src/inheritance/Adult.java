package inheritance;

public abstract class Adult extends Person {
  // abstract class extends abstract class
  // implicitly "extends" abstract method

public Adult(){
  
}


  public abstract void read();

  public void eat() {
    System.out.println("I am eating");
  }

}
