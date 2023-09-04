package polymorphism;

public abstract class Building {
  
  double height;


  public void print(){
    System.out.println("I am 錶定");
  }

public void print2(){
  this.print(); //用番print()自己既method
}

public void print3(){
  System.out.println("I am 錶定");
}



}
