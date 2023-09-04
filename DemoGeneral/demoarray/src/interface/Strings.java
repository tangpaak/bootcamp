public class Strings implements CharSequence {

  char[] arr; // "abc" , [a, b, c]

  private Strings(String str) {
    arr = new char[str.length()];
    //
    for (int i = 0; i < arr.length; i++) {
      arr[i] = str.charAt(i);
      //ASCII 'a' = '97'
      // a <- 

    }
  }

  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }


  public CharSequence subSequence(int start, int end) {
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || end > this.arr.length){
      return String.valueOf(this.arr);
  }

    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) { // end-1
      sb.append(this.arr[i]);
    }

    return sb.toString(); // String
  }


  public static void main(String[] args) {
    // CharSequence - > interface
    // 應該留意邊個implment緊佢
    // String is implment CharSequence

    String str = "abc";
    Strings s = Strings.valueOf("def");


    System.out.println(str);
    System.out.println(s.subSequence(1,3));

    int[] a = new int[]{};


  }
}
