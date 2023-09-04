package Math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {

  public static void main(String[] args) {

    // 1. Function interface:
    // 可以用lambda砌落去
    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);
    System.out.println(lengthFunc.apply("abc")); // 3
    System.out.println(firstCharFunc.apply("month")); // m

    // 2. Length Function
    LengthFunction lengthFunction = new LengthFunction(); //
    System.out.println(lengthFunction.apply("def")); // 3

    // Function Example
    // 兩個variable既時候一定要寫括號
    Map<String, String> map = new HashMap<>();
    map.put("abbbc", "瑪莉");

    // Function <String, String> formula = s -> "default";
    String result = map.computeIfAbsent("abc", s -> "default");
    System.out.println(result);
    System.out.println(result.length());
    System.out.println(map.size()); // 2

    // 3. BiFunction:

    // i - Integer Integer (example)
    BiFunction<Integer, Integer, BigDecimal> addition =
        (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addition.apply(-4, 3).abs()); // 1

    // ii - StringBuilder StringBuilder (example)
    BiFunction<StringBuilder, StringBuilder, String> addition1 =
        (x, y) -> String.valueOf(x.append(y));
    String.valueOf("abc");

    // iii - String String (example)
    BiFunction<String, String, StringBuilder> addition3 =
        (x, y) -> new StringBuilder(x).append(y);
    // *** 一定要生左StringBuilder (x) object先可以再append object (y)


    //
    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);
    stock.compute("clothes",
        (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    System.out.println(stock.get("clothes")); // 90

    // @@@ new value: null, remove item
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.size());

    //
    stock.compute("shoes", (item, oldPrice) -> 120);
    System.out.println(stock.get("abc"));

    //



  }


}
