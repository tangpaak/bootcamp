package general;
public class Integer3 {
  
// Internal Cache (-128 to 127)
  public static void main(String[] args) {

Integer i1 = 100;
Integer i2 = 100;
System.out.println(i1 == i2); // checking address // true,

Integer i3 = 128;
Integer i4 = 128;
if (i3 == 128){ // i3 -> int (Wrapper Class -> primitive)

}
System.out.println(i3 == i4); // checking address, false, why?
System.out.println(i3.equals(i4)); // checking value, true
System.out.println("\n");
// Since cache can only check from -128 to 127

Integer i5 = -128;
Integer i6 = -128;
System.out.println(i5 == i6); // checking address, true (-128 to 127)

// Byte b1 = new Byte(null); // 因為全部Byte係同一個波, 有internal cache, 產生唔到新既波null
Byte b2 = 127;

//Short, Long. Practice yourself
// Short sh1 = new Short(null); // 唔得
Short sh1 = 124; // 可以
Short sh2 = 124;
System.out.println(sh1 == sh2); //true

// Long l1 = new Long(128); // 唔得
Long l2 = 128L; // 可以

Float f1 = 1.3f;
Float f2 = 1.3f;
System.out.println(f1 ==f2); //false

Double d1 = 1.3d;
Double d2 = 1.3d;
System.out.println(d1 == d2); //false

Boolean bool1 = false;
Boolean bool2 = false;
System.out.println(bool1 == bool2); //true, same address

//Internal Cache -> ASCII
Character c1 = 'a';
Character c2 = 'a';
char h = 1000;
Character c3 = 'Ϩ';
Character c4 = 'Ϩ';
System.out.println(h);
System.out.println(c1 == c2); //true, same address
System.out.println(c3 == c4); //false, out range

Integer i7 = Integer.valueOf(127); //new Object 127
Integer i8 = 127;
System.out.println(i7 == i8); //true

Integer i9 = Integer.valueOf(128); //128
Integer i10 = 128;
System.out.println(i9 == i10); //false





}
}