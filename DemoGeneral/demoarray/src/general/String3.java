package general;
public class String3 {
  
  public static void main (String []args ){
String str1 = "abc";
String str2 = "abc";
System.out.println(str1.equals(str2)); //true, "abc" same as "abc"
System.out.println(str1 == str2); //true, address is it same??

//String Literal Pool -> "abc"
// 如果無用new去生產新既"abc", 會跌入magic

String str3 ="abcd";
System.out.println(str1.equals(str3));//false
System.out.println(str1 == str3); //false, their address are not same

str1 = "abc123"; // str2 = "abc", because "abc123" is not equal to "abc" -> immutable ->
System.out.println(str1 == str2); //false
str1 = "abc";  // transfer again to "abc", check if str1 equals to str2
System.out.println(str1.equals(str2));// true

String temp = str1; // str1 = "abc", temp = "abc"
str1 = new String ("abc");// new object -> not same, since it's new String!
System.out.println(temp == str1); //false
System.out.println(temp.equals(str1)); //true?? is it since check value?




// Integer a = 10;
// a = a + 20; //左手邊果個a係address, 右手邊果個a係copy出黎既值
// // a = 30


String str7 = new String ("hello").intern();
String str8 = "hello";
System.out.println(str7.equals(str8));  //true, checking value
System.out.println(str7 == str8);  //true, checking address



  }
}
