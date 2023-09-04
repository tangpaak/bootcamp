package inheritance.grandparent;

public class D {
  int weight;

  public void setWeight (int weight){
  this.weight = weight;
}

public void print (int anotherWeight){
  System.out.println(this.weight + " "+ anotherWeight);
  }

}
