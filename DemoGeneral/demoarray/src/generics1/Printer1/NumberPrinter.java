package generics1;



public class NumberPrinter {

  String str;
  int num;
  Double double1;

  public void print(int num, String str, Double double1) {
    this.num = num;
  }

  public void print() {
    System.out.println(this.str);

  }

  public void print(int num) {
    System.out.println(this.num);

  }

  public void print(Double double1) {
    System.out.println(this.double1);
  }



}
