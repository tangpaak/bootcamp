package general;
public class DataType {
  public static void main(String[] args){
// Number, Text
// Declaration
int num; // int is a way to declare a variable
// from now on, you can only put integer to variable num.
//Assignment
num = 3; // from right to left
System.out.println("3"); 
System.out.println(3);
System.out.println(num);

//Text
String str = "Hello   !";
System.out.println(str);

// String str2 = 1; //error < String cannot use as define num
// int num2 = "hello"; int cannot define as text

//re-assignment 
num = 10;
// floating point 
// int num3 = 1.1; //error, int can only store Integer
double f = 1.03;
double f2 = 1; // can put integer by double

// byte, short, long
byte b = 127; byte b3 = -128;
System.out.println(b3);

short s = 23; short s2 = -60;
System.out.println(s2);

long l =400; long l2 = 1000;long l3 = 30L; //norm >L, but not l
System.out.println(l3);

//floating point> double/ float
float f3 = 1.00000000003f; // norm > f, but not F
System.out.println(f3);

double d4 = 23.9;
System.out.println(d4);

//char, value should be assigned by single quote''
char gender =  'M';
char s10 = ' ';
// char empty = '';//error

//boolean
boolean isMale = true;
boolean isSalaryGreaterThan = true;
boolean isValid = false;

//initialization, means the 1st time of assignment
int a10 = 0;
a10 = 100;
System.out.println(a10);

//String + operation
String a11 = "Venturix lab";
String a12 = " Welcome!";
String result = a11 + a12;
System.out.println(result);// Venturix lab + Welcome!

String result2 = "Venturix lab" + " Welcome!";
System.out.println(result2); //Venturix lab + Welcome!

System.out.println(result + " " + result2);
//Venturix lab + Welcome! + Venturix lab + Welcome!

String str3 = "abc"+13; //default behaviour; convert 13 to String
//abc13
System.out.println(str3);
//

String str4 = "abc"+'A'; // 'A' > String "A", abcA
System.out.println(str4);


String str5 = "abcd" + true;
System.out.println(str5);

//String str6 = 13 + 13; //error<-String cannot use for number, need int
String str7 = "" + 13 + 13; //13>String "13", result 1313
System.out.println(str7);

//
int a = 1 + 3; //4
int A = 6 + 3; //9
int b10 = 1 - 3; //-2
int c10 = 2 - 80; //-78
int i = 2 * 101;//202
int p = 10 / 3; //3 (must not /0, it will error)
int o = 10 % 3; //1, 1 is reminder

System.out.println(a);
System.out.println(A);





  }
}
