package generics1;

// Generic
public class Printer<T> {
  // 1. Class Signature add <>, T represent any Class
  // <T> represent any type, 我簡單理解<T>係任你放d野入去比你寫
  // <T>同Object係兩碼子既事, object係實際存在既class, 但<T>係真係唔知放咩入去

  T value; // <--未定義之物
  Object object; // <-萬物之母class

  // <-你要明白呢個同 T value係另一個意思
  // 咁樣寫Object又要downcast番個(student)係好蠢
  // get一個Object出黎係get唔到野

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public Object getObject() {
    return this.object;
  }

  public void print() {
    System.out.println(this.value);
  }


  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    // Strong Type checking -> check if you put a real class into <>
    p1.setValue("abc");
    System.out.println("p1 = " + p1.getValue()); // "abc"

    Printer<Integer> p2 = new Printer<>();
    p2.setValue(100);
    System.out.println("p2 = " + p2.getValue()); // 100

    Printer<Double> p3 = new Printer<>();

    Printer<Boolean> p4 = new Printer<>();
    p4.setValue(true);
    //p4 -> object -> null
    System.out.println("Original= " + p4.getValue());
    System.out.println("Original= " + p4.getObject());

    p4.setObject("String");
    System.out.println("變左之後get value= " + p4.getValue());
    System.out.println("變左之後get object= " + p4.getObject());
    System.out.println(p4);

    System.out.println("shoud be S = " + ((String) p4.getObject()).charAt(0));



  }



}
