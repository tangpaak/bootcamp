public class Person {
  // Class只係 一個文件
  // Main只係一個method比JVM去睇入口點
  // Class個本質係睇一個模
  // Class可以想像成有template

  // 形容一個Person有d乜野
  // 生產呢個person應該用咩係形容佢？
  // Descibe the person by attributes

  private int age; // 可以有年齡
  private char gender; // 可以有性別
  // 人類係要有年齡, 要有性別

  public static boolean isMale(char gender) { // 用你丟入去gender入面既事去決定答窯
    if (gender == 'F') { // belong to class
      return false; // 係F時,就係false
    }
    return true; // 否則就係true, (即係男人)
  }

  public boolean isMale() { // each object has this method
    if (this.gender == 'F') {
      return false;
    }
    return true;
  }


  // getter
  public int getAge() {
    return this.age; // this.age
  }

  // setter
  public void setAge(int age) {
    this.age = age; // 呢個this.age係形容緊果舊野幾多歲 //果個人幾多歲?
  } // 你要寫this. , 人地先會解釋到係放入age

  public int getGender() {
    return this.gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }


  public static void main(String[] args) { // main並不代表person
    String s = "abc";
    String s2 = "abad";
    String s3 = String.valueOf("abcde");

    Boolean b = new Boolean("true"); // new an objact in heap) 舊式寫法
    Boolean b2 = (Boolean.valueOf("false"));
    Boolean b3 = true; // auto-box ->直接攞黎用


    Person p = new Person(); // produce empty person object, with default value
    Person p2 = new Person(); // produce empty person object
    p.setAge(13);
    System.out.println(p.age); // 13
    System.out.println(p.getAge()); // 抽番set左既數值出黎

    // object係個memory入面, 唔係個program入面

    // Static vs Non-static

    // static (公家去使用)
    System.out.println(isMale('F')); // -> false

    // non- static
    p.setGender('M');
    System.out.println(p.isMale()); // -> true

    // Computer己open左個class
    // 所以以下已經可以打Computer出黎
    Computer computer = new Computer(); // Computer() -> empty constructor
    computer.setColor("RED"); // create a computer
    computer.setRam(128);
    computer.setWeight(2);

    // constructor
    Computer computer2 = new Computer("Yellow");
    computer2.getColor(); // ->yello
    computer2.setColor("black");
    computer2.getColor(); //



  }


}


