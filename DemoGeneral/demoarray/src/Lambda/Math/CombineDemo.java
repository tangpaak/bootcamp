package Math;

import java.util.function.Predicate;

public class CombineDemo {

  public static void main(String[] args) {

    Predicate<String> startsWithV = s -> s.startsWith("V");
    Predicate<String> endsWithE = s -> s.endsWith("E");

    Predicate<String> combined = startsWithV.and(endsWithE); //同時滿足V係頭同E係尾
    System.out.println(combined.test("VE")); // true
    System.out.println(combined.test("AE")); //false
    System.out.println(combined.test("VA")); //false

    Predicate<String> combined2 = startsWithV.or(endsWithE); //是旦V係頭或者E係尾
    System.out.println(combined2.test("VE")); //true
    System.out.println(combined2.test("AE")); //true
    System.out.println(combined2.test("VA")); //true





  }

}
