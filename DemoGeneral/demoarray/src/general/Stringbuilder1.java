package general;
import java.util.Arrays;

public class Stringbuilder1 {

  public static void main(String[] args) {

    StringBuilder s = new StringBuilder("Hello"); // Constuctor
    // s -> address (reference)
    // 裝住左"Hello"
    System.out.println(s);
    System.out.println(s.toString()); // String -> "Hello", toString就係getter
    //
    s.append(" world"); // append() is faster than "+" in String
    System.out.println(s.toString()); // String,加world入去 -> "Hello world"
    //
    s.append(1.3f);
    System.out.println(s.toString()); // String, 加1.3f入去
    // Hello World1.3true4000
    System.out.println(s.append(true).append(4000L).length()); // result is 22

    //
    String str = "  he llo ";
    String[] strs = str.trim().replace('h', 'e').split(" ");
    System.out.println(Arrays.toString(strs)); // result [ee, llo]
    System.out.println(strs.length); // result is 2

    //
    StringBuilder s2 = new StringBuilder("start");
    // s2.append('a').toString().append(); <-- toString左唔可以append, 因為轉左type

    // Approach 1
    System.out.println(s2.append('a').toString().charAt(3)); // result is r
    // Approach 2
    StringBuilder s3 = s2.append('a');
    String s4 = s3.toString();
    s4.charAt(3); // r
    // *** StringBuilder同String係兩個完全唔同既class黎
    // 所以String係用唔到StringBuilder入面既method既

//insert
String s10 = "hello"; // how to insert a space between ll
StringBuilder s11 = new StringBuilder("hel lo");
s11.insert(3, ' '); //唔洗s11= s11.insert(3, ' '), 因為直接係用address去改
System.out.println(s11); //第3個位置加一個空白

s11.insert(0, "world ").append( " world");
System.out.println(s11); //第0個位置加world , 最尾加 world

System.out.println(s11.deleteCharAt(3).toString()); // 刪除第3個位置,再轉String
// result is word hel  lo world 
System.out.println(s11); // 因為直接改左address, 所以已經變word hel  lo world
System.out.println(s11.append("abc"));

Integer a = 10; 
System.out.println(a + 10); // Ans is 20
System.out.println(a); // a 仲係10, 因為上面果個+唔會轉address

// ** setCharAt function
s11.setCharAt(4, 'J'); //第4個位轉做J
System.out.println(s11); // wordJel loworldabc







  }
}
