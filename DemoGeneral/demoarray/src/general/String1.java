package general;
public class String1 {
  
public static void main(String[] args){
//length(), equals(), charAt()
String str = "hello";
System.out.println("isEmpty=" + str.isEmpty()); //false
String str2 = "";
System.out.println(str2.isEmpty()); //true
String str3 = " ";
System.out.println(str3.isEmpty()); //false
String str4 = "I AM A BOY";
System.out.println(str4.isEmpty() + "\n"); //false


//*** str.isEmpty就係check 你驗證果個野入面有無character 即使有空白都係有野

//isBlank()
System.out.println("isblank=" + str.isBlank()); //false
System.out.println(str2.isBlank()); //true
System.out.println(str3.isBlank()); //true
System.out.println(str4.isBlank() + "\n"); //false

  
// to LowerCase(), toUpperCase()
System.out.println(str.toUpperCase()); //HELLO
System.out.println(str4.toLowerCase()); //i am a boy
System.out.println(str.toUpperCase().toLowerCase()); //hello
System.out.println(str.toUpperCase().toLowerCase().isBlank()); //false, 轉三次
if (str.toUpperCase().equals("HELLO")){
  System.out.println("yes, it is HELLO");
}
System.out.println("\n");

// *** substring 
// (startIndex, is normal index)
// (endIndex is normal index -1)
// hello -> he
System.out.println(str.substring(0, 1)); //0 開始去到 1, end index會減1, 所以係h
//唔同平時, 佢只會由0去到1, 
//咁樣理解會好d-> System.out.println(str.substring(0, 1-1)); //直接減後面1
System.out.println(str.substring(0, 2)); //he, end index - begin index = 2, 所以係he
System.out.println(str.substring(2, 3));// 只會print "l", 後面3－1都係2
System.out.println(str.substring(0));// 如果只係打start index, end index會default係最後果個, 所以係hello
System.out.println(str.substring(3));// 如果只係打start index, end index會default係最後果個, 所以係lo
if( str.substring(3).equals("lo")){
  System.out.println("yes, str.substring(3) = lo");
} // string係用唔到==, 所以要用if( str.substring(3).equals("lo"))寫出黎

// *** contains()
String s = "lo";
System.out.println(str.contains(s)); 
//用鼠標指住contains,會見到boolean, 查s有無其中既字眼
// true (hello contains lo)
System.out.println(str.contains("ol")); 
// ol唔係str "hello"入面, 所以唔會搵到
//false(hello Not contains ol)

if (str.contains("lo")){
  System.out.println("str contains lo");
}
//如果str有lo, 就print "str contains lo"出黎

str = str.toUpperCase();//指派str去做大階
System.out.println(str); //HELLO
str += str.toLowerCase();
System.out.println(str);// HELLOhello





}

}
