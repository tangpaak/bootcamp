package Class;

import java.util.Arrays;

public class StringBox2 {

  char[] string;

  public StringBox2() {

  }// this is empty constructor

  public StringBox2(char[] sources) {
    this.string = new char[sources.length]; // new object
    // Approach 1:
    // for (int i = 0; i < sources.length; i++){
    // string [i] = sources [i];
    // }

    // Approach 2:
    // CopyOf() -> new array object, and with the copy values of the original array
    // 會copy原本果個array出黎, 去到新果個array入面
    this.string = Arrays.copyOf(sources, sources.length);
  }

  public StringBox2 append(String s) {
    // String -> toCharArray()
    char[] res = new char[this.string.length + s.length()];
    // res array = 舊array長度+新array長度, 即[ , , , , , ]

    int idx = 0; // 用於res上面 -> 0 1 2 -> a, c, b
    int j = 0; // 用於兩個新舊array上面, 0,1,2 ->食番a, c, b
    while (idx < this.string.length) { //即[a, c, b, , , ]
      res[idx] = this.string[j];
      idx++;
      j++;
    } // 再將 3, 4, 5 [d,e,f] 加落去 0, 1, 2 [a,c,b, , , ]
    j = 0; // j reset to 0, idx is 3
    while (j < s.length()) { // j一定會細過s.length, 所以可以加落去
      res[idx] = s.charAt(j); // idx = 4
      idx++;
      j++;
    } // 即[a,c,b,d,e,f]

    this.string = res; // 最尾this.string指派做result新果條
    return this;
  }


  public String toString() {
    return String.valueOf(this.string); // [a, c, b]
  }



  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'c', 'b'};

    StringBox2 box = new StringBox2(chars);
    System.out.println(box.toString()); // [a, c, b]

    chars[1] = 'x';
    System.out.println(String.valueOf(chars)); // [a, x, b]
    System.out.println(box.toString()); // [a, c, b]
    // pass by reference -> so change c to x


    System.out.println(box.append("def").toString());

  }



}
