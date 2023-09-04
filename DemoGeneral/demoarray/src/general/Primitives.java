package general;
public class Primitives {

  public static void main(String[] args) {
    // Correct Syntax

    // ** Upcasting (Implicit) <-即隱藏地做某樣野
    // byte ->short -> int ->long -> float -> ->double
    // char -> int 特別既轉換
    byte b = 127; //
    short s = b; // byte->short, upcasting (promotion)
    int i = s;

    long l = i;
    float f = l;
    double d = f;
    // char ->int
    char c = 'A';
    int j = c;

    // Downcasting
    double d2 = 10.3d;
    // float f2= d2; // why error? double precisiion is larger than float
    float f2 = (float) d2; // developer take responsibility for the risky

    short s2 = 128;
    // byte b2 = s2; // error, cannot put short in byte
    byte b2 = (byte) s2;
    System.out.println("b2=" + b2); // -128

    // for (byte k = 127; k <129; k++){
    // System.out.println("hello"); // error, since -128 to 128 is max
    // }

    // int[] arr = new int[Integer.MAX_VALUE]; //
    // for (int n = 0; n < arr.length; n++) {

    // }

char c2 = 'B'; //66
if (c2 =='B'){
  System.out.println("c2 is B");
}

if (c2 ==66) {
  System.out.println("C2 is 66");
}
char c3 = 67;
if (c3 =='C') {
  System.out.println("c2 is C");
}


// 由ASCII (int) to char, （int係大過char）
int g = 'a';
int g2 = 10;
char k = (char) g2; //Explicit converion / downcasting, Char 係可以同數字相通
// char k = (char)g; // downcast cannot be done
char k2 = 66; //why? downcast


//
int h = (int) 1000L; //downcasting, Explicit conversation

short s10 = 128;
byte o = (byte) s10;
// byte o2 = 128; //error

char character = 'a' + 1 ;
if ( character =='b'){
System.out.println ("character=" + character);
}
if ( character == 98){
System.out.println ("character=" + character);
}
if (character > 'a'){
  System.out.println("character >a");
}





  }


}
