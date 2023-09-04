package checked1.Exception;

import checked1.AmountZeroException;
import checked1.NameNotMatchException;
import checked1.NameTooLongException;

// 總之中任何一槍個Program就Suppose唔應該繼續比佢行出黎

public class Student{

  String name;
  long pocketMoney;

  // except name
  // except zzzzzero
  // except 符號

  public Student(String name) {
    this.name = name;
  }

  public Student() {

  }

  // Approach 2:
  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10)
      throw new NameTooLongException("name is too long(>10)"); // check exception

    this.name = name;
  }

  public void setPocketMoney(long pocketMoney) throws AmountZeroException {
    if (pocketMoney < 1)
      throw new AmountZeroException("Amount<=0");
    this.pocketMoney = pocketMoney;

  }

  public static void main(String[] args) throws NameTooLongException, AmountZeroException {

    // Approach 1: 自已試下果個係咪exception -> try -> catch

    // 1. NameNotMatchException
    Student student = new Student("John");
    student.setName("Peter abc abc abc wick"); // if exception, throw it to the Caller(用家)
    student.setPocketMoney(-3);

    try {
      student.setName("Peter abc abc abc ");
    } catch (NameTooLongException e) {
      System.out.println("nothing happen");
    }

    // 2. Using NameTooLongException (but it must be subclass of NameNotMatchException)
    Student student2 = new Student("J");
    student2.setName("J");// ??????

    try {
      // checked exception
      // int i = 10 / 0;
      student2.setName("vjhgvyjguyjygjhgjI");  // ??????
      student2.setPocketMoney(-3);
    } catch (NameTooLongException | AmountZeroException e) { // Else if

      System.out.println(e.getMessage());
      System.out.println("Student setter issue, message, " + e.getMessage());
      throw new NameTooLongException("abc");

    } catch (RuntimeException e) { // Else if
      System.out.println(e.getMessage());
      // } catch (Exception e) {
      // System.out.println(e.getMessage());

    } finally { // Else
      System.out.println("finally 最尾係一定會行, 無論catch唔catch到野");

      // *** Using Exception
      try {
        // checked exception
        student2.setName("Peter");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } finally {
        System.out.println("finally 最尾係一定會行, 無論catch唔catch到野");
      }
      // 呢個Exception係最大既, 佢係包埋Run time係入面check
      // finally唔係Else, 唔係else if, 係最尾一定會行呢個finally, 即使無catch任何野


      // Approach 2: 呢個係throws比用家去試, 果個nothing happen比用家睇
      // 所以main右邊一定要寫throw NameNotMatchException (你睇下24行)
      Student student4 = new Student();
      student4.setName("aiusfhsdjfhdiskfhdkjasfh");


      // *** null pointer
      Student student3 = new Student();
      student3.name.length(); // null pointer, unchecked exception



    }


  }
}
