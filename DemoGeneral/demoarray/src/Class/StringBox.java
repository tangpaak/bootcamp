package Class;

public class StringBox {
  private String string; // String -> Class
  //一個學生可以reg好多科, 但科目只有一個科

  // constructor, getter, setter
  public StringBox() {


  } // This is empty constructor

  public StringBox(String string) {
    if (string == null) {
      this.string = "";
    }

    this.string = string;
  }


  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringBox append(String str) {
    if (str == null || "".equals(str))
      return this;

    this.string = this.string + str; // return this.string
    return this; // return StringBox object reference
  }




  // Static
  public static StringBox append(String str, String str2) {
    return new StringBox(str + str2); // create an object of StringbBox by constructor
  }

  // public String append2 (String str){
  // this.string = this.string + str;
  // return this.string;
  // }

  // StringBox insert
  /**
   * 
   * @param idx Range between something
   * @param s The string to be inserted
   * @return Object of StringBox
   */

  public StringBox insert(int idx, String s) {
    // idx range?
    if (idx < 0 || idx > this.string.length())
      return this;
    if (s == null || "".equals(s))
      return this;
    // s == null?

    // String start = s.substring(0,idx);
    // String end = s.substring(idx);
    this.string =
        this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;

  }


  public String toString() {
    return this.string;
  }

public char[] toCharArray(){ //no parameter
char[] chs = new char[this.string.length()] ;

for (int i = 0; i < chs.length; i++){
chs[i] = this.string.charAt(i);
}

  return chs;
}


  public static void main(String[] args) {

    StringBox s = new StringBox(); // Since have empty constructor, so can new StringBox
    s.setString("Java");
    System.out.println(s.append("Python")); // JavapPython
    s.append("Javascript").append("Javascript");
    System.out.println(s);
    s.append("HTML").toString();
    System.out.println(s);

    StringBox s2 = new StringBox(); // this.string -> null
    s2.append("java");

    String s3 = StringBox.append("hello", "world").toString(); // helloworld
    // 右邊StringBox, 出番黎係String, 所以成立到

StringBox sb = new StringBox("hello");
char[] chars = sb.toCharArray();
System.out.println(chars);




  }



}
