package general;
public class Wrapper {
  
  public static void main (String []args ){

// Prmitives: byte, short ...
// Wrapper Classes, corresponding primitive

boolean isMale = true; // isMale is not an object
Boolean isFemale = true; // isFemale is an object reference

isMale = false; // isMale無野可以做到, 只有check true or false
if (isMale){

}

if (isFemale.compareTo(isMale)==0){ 

}

isFemale = null; // true/ false / null

int num = 2;
Integer num2 = 4; // num2 is an object reference, 佢係一個地址
num2 = null;

num2 = 1000;
String s = num2.toString(); // "1000"
Integer i = Integer.valueOf("123"); // 123
Integer num3 = 4;

if (num3.compareTo(3) < 0){
System.out.println("num3 is >3");
}

char c = 'a';
Character c2 = 'A';
char result = Character.toLowerCase('B'); //static method 

//Difference?
Character c3 = Character.valueOf('s');
Character c4 = 's';




}
}