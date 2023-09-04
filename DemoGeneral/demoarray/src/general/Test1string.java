package general;
import javax.swing.event.SwingPropertyChangeSupport;

public class Test1string {
  
public static void main(String[] args){
String str = "I am happy, but raining";
str = str +".";
System.out.println(str);// Will show I am happy, but raining.

// Method
int i = str.length();// length (), tool to return the length of str
System.out.println("i="+i); // convert i to String 24 > "i=24"

System.out.println("hello".length()); // Ask length of "Hello", which is 5

//equals ()
String str1 = "abc";
String str2 = "abcd";
String str3 = "abc";
boolean areTheyEqual = str1.equals(str2);//false
boolean areTheyEqual2 = str1.equals(str3);//true
boolean b4 = str2.equals(str1+"d"); //true
System.out.println(areTheyEqual);
System.out.println(areTheyEqual2);
System.out.println(b4);

// chatAt(2), find the index 2 of the string
String str4 = "helloworld";
//index is start from 0> so 0 is h,
//index 1 is e
System.out.println(str4.charAt(2)); //result: l
System.out.println(str4.charAt(4)); //result: o





}

}
