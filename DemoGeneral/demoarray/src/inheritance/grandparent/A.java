package inheritance.grandparent;

public class A //extends C extends: cannot A -> B -> C -> A

{
int num;

public void setNum (int num){
  this.num = num;
}


public void print (int anotherNum){
System.out.println(this.num + " "+ anotherNum);
}
  
}
