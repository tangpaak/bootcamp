package generics1;

// Generic
public class Gum<T, S, D, B> {
  // test other type

  T value;
  S str;
  D double1;
  B boolean1;
  Object object;

  // <-你要明白呢個同 T value係另一個意思
  // 咁樣寫Object又要downcast番個(student)係好蠢
  // get一個Object出黎係get唔到野

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public S getStr() {
    return this.str;
  }

  public void setStr(S str) {
    this.str = str;
  }

  public D getDouble1() {
    return this.double1;
  }

  public void setDouble(D double1) {
    this.double1 = double1;
  }

  public B getBoolean() {
    return this.boolean1;
  }

  public void setBoolean(B boolean1) {
    this.boolean1 = boolean1;
  }

  public Object getObject() {
    return this.object;
  }


  public void print() {
    System.out.println("value = " + this.value);
    System.out.println("str = " + this.str);
    System.out.println("double1 = " + this.double1);
    System.out.println("Boolean = " + this.boolean1);
  }


  public static void main(String[] args) {
    Gum<Integer, String, Double, Boolean> p1 = new Gum<>();
    p1.setValue(1);
    p1.setStr("力威香口膠");
    p1.setDouble(10.0d);
    p1.setBoolean(true);

    p1.print();






  }



}
