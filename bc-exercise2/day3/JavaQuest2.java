/**
 * Expected Output:
 * 
 * a > 9 
 * str length < 27 
 * 2020 is a leap year. 
 * 2400 is a leap year.
 */
// Primitive types and operators
public class JavaQuest2 {
  public static void main(String[] args) {
    int a = 10;
    int b = 3 * a % 3;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a < 9 && a >= 0) {
      System.out.println("a is between 0 and 8");
    } else if (a >9){
System.out.println("a > 9");
      } // code here      
    else
  {
    System.out.println("a < 0");
  }

  String str = "I love Java. I love coding";
  if (str.length() == 27) { // code here. Fix the bug.
    System.out.println("str length=27");
  } else if (str.length() < 27) { // add the condition
    System.out.println("str length < 27");
  } else if (str.length() > 27) { // complete the code
    System.out.println("str length > 27");
  }
 // Question : Determine whether year n is a leap year.
  /*
   * Definiton of a leap year: If a year is divisible by 4 and not divisible by 100 
   * or divisible by 400, then, it is a leap year.
   */
  int year1 = 2009;
  boolean year1isleapyear = year1%4 == 0 && year1%100 != 0 || year1%400==0;
  // Program a condition to check if it is a leap year.
  // But should NOT print anything.]
  if(year1isleapyear);
  {
  }
  int year2 = 2020;
  boolean year2isleapyear = year2%4 == 0 && year2%100 != 0 || year2%400==0;
  if(year2isleapyear);
  // same as the above, but it will print out.
  {
    System.out.println("2020 is a leap year.");
  }
  int year3 = 2400;
  boolean year3isleapyear = year2%4 == 0 && year2%100 != 0 || year2%400==0;
  if(year3isleapyear);
  // same as the above, but it will print out.
  {
    System.out.println("2400 is a leap year.");
  }

  int year5 = 2100;
  boolean year5isleapyear = year2%4 == 0 && year2%100 != 0 || year2%400==0;
  if(year5isleapyear);{

  }
  // same as the above, but it will NOT print out.
 
}
}
