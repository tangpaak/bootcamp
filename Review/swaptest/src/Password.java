package Review.swaptest.src;


public class Password {

public static int counter = 2;
private String password;

Password (String x){
this.password =x;
counter ++;
}

public void setPassword(String password){
  this.password = password;
  counter --;
}




  public static void main(String[] args) {
Password p1 = new Password ("ABC");
Password p2 = new Password ("ABC");
Password p3 = new Password ("BCD");

p2.setPassword("pw");
Password.counter *= Password.counter;
System.out.println(Password.counter);




  }
  
}
