package Math;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) throws Exception {
    // i .developer duties
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 92)
          return false;
      }
      return true;
    };

    // ii. tester duties
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUpperCase, "AbcD", false);
    test(isUpperCase, "ABCDD", true);
    System.out.println(isMale.test('F')); // False

    // 1. BiPredicate
    BiPredicate<String, String> equals =
        (s1, s2) -> s1 != null && s1.equals(s2);

    test(equals, "abc", "abc", true);
    test(equals, "abc", "bcd", false);
    test(equals, null, "bcd", false);
    test(equals, "abc", null, false);
    test(equals, null, null, false); // <-唔好深究d傻野 比tester諗
    test(equals, null, "", false);
    test(equals, "", null, false);

    // 2. Predicate
    Predicate<LocalDate> isCoolingOff =
        effDate -> effDate.plusMonths(1).isBefore(LocalDate.now());
    // 查以下Date係咪係Local date前一個月, 係既話就仲係effect date
    test(isCoolingOff, LocalDate.of(2023, 6, 16), true);
    test(isCoolingOff, LocalDate.of(2023, 7, 17), false);
    System.out.println(isCoolingOff);


  }

  ////////////////////////////////////////////////////////////////////////////////////////////////
  public static <T> void test(Predicate<T> testcase, T data,
      boolean expectedResult) throws Exception {

    if (testcase.test(data) == expectedResult)
      return;
    throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2,
      boolean expectedResult) throws Exception {

    if (testcase.test(data, data2) == expectedResult)
      return;
    throw new Exception();
  }
///////////////////////////////////////////////////////////////////////////////////////////////


}


