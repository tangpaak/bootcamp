/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {



  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    System.out.println(str.charAt(15)); 
    System.out.println(str.charAt(1)); 

    // prints J
    // prints e (the 1st e)
    // code here ...

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println("The index of t in str=" + str.indexOf('t'));
    System.out.println("The index of x in str=" + str.indexOf('x'));
    System.out.println("The index of L in str=" + str.indexOf('L'));


    // Use String trim()
    // prints "ab c"
    String abc = "    ab c    ";
    System.out.println("abc.trim()=" + abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace ("Java", "Coding"));


    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
System.out.println(str.toUpperCase().concat("!!!").replace('E','*'));
  }
}