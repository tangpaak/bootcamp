public class TestException {


  public static int method(int amount) throws BusinessException {
    if (amount >= 0)
      return amount * 100;
    throw new BusinessException("amount < 0");

  }

  public static int method2(int amount) throws ABCException {
    if (amount >= 0)
      return amount * 100;
    throw new ABCException();

  }

  // Approach 2 : throws the BusinessException in method signature
  public static void main(String[] args) throws BusinessException {
    // Exception // checked exception
    // Runtime Exception // unchecked exception

    // Approach 1: handled by try & catch
    try {
      int result = method(-2);
      // once hit one error, cannot process the rest code
      // skip the rest of the codes...

    } catch (BusinessException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("this is final code block");
    }



    // RuntimeException // unchecked exception
    // don't need to handle Runtime Exception
    int a = 10;
    if (a >= 0) {
      int result2 = method2(a);
    }



  }

}
