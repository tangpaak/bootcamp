package general;
public class String2 {

  public static void main (String []args ){

// Method signature = method name + parameter type & quantity
// trim(), remove leading space and tail space
String str = "hello ";
String str2 = "   hel   lo  ";
String str3 = "hello";

System.out.println("str.trim()=" + str.trim()); // "hello"
System.out.println("str2.trim()=" + str2.trim()); // "hel   lo"
// trim將頭尾既空白del

// startWith(), check if the string start with the target string
if (str.startsWith("hel")){
  System.out.println("The string starts with hel");
}

// endWith(), check if the strinf ends with the target string
boolean endsWithSpace = str.endsWith(" ");
if (endsWithSpace) {
  System.out.println("The string ends with space");
}

// indexOf(int) or indexOf(char) 
System.out.println("The index of o in str=" + str.indexOf('o')); //4

// indexOf(String)
System.out.println("The index of ll in str=" + str.indexOf("ll")); //2
System.out.println("The index of lll in str=" + str.indexOf("lll")); //-1
// 所有搵唔到既情況就會出-1為result 

System.out.println("The index of o in str, searchg from index 5=" + str.indexOf('o', 5)); 
//search 位置5既時候係空白, 唔係'o', 所以係-1 (cannot find).
System.out.println("The index of ll in str, search from index 3=" + str.indexOf("ll", 3));
//search 位置3既時候係le, 唔係'll', 所以係-1 (cannot find).

//LastIndexOf(int), the last ocurrence of the char/string in the string
System.out.println(str.lastIndexOf('l')); //3
System.out.println(str.lastIndexOf("ll")); //2
System.out.println(str.lastIndexOf('l', 3)); //3

//** replace
String s = "Java is a programming language";
System.out.println(s.replace("Java" , "Python")); //Python is a programming language
System.out.println(s.replace('p','q')); // Java is a progrramming language

// equals(), equalsIgnoreCase()
if ("hello".equals(str3)){
  System.out.println("str3=hello"); // true
}
if ("Hello".equals(str3)){
  System.out.println("str3=Hello"); // false , case sensitive
}
if ("Hello".equalsIgnoreCase(str3)){ // true, non case sensitive
  System.out.println("non case sensitive checking");
}
if ("HELLO".equals(str3.toUpperCase())) { // true
  System.out.println("Alternative"); 
}

// concat(String), append something 加d野係後面
String newString  = str3.concat("Java!"); // + operation
System.out.println("newString=" + newString); // newString= hello Java!

str3 = str3.concat("Java!");
System.out.println ("str3="+str3); // str3= hello Java!


// CompareTo
String apple = "apple";
String facebook = "facebook";
System.out.println (apple.compareTo(facebook)); 
// result is -5, 1 - 6 -> ('a' - 'f')-> ASCII(97-120)








  }

}
