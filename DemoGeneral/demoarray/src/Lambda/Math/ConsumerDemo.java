package Math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

  public static void main(String[] args) {

    // 1. Consumer
    // - accept 只係食野唔output
    // - conumer 只可以係void


    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("譚仔三哥雲南米線");
    // - BiConsumer
    BiConsumer<String, String> biConsumer =
        (s1, s2) -> System.out.println(s1 + s2);
    biConsumer.accept("abc", "def");

    // Example - List
    // 第4種For loop 寫法
    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    int f = 8;
    strings.forEach(s -> {
      int i = 0;
      int a = 0;
      int total = i + a + f;
      if (i < 1)
        System.out.println(total);
    });
    // System.out.println(c); // c係括號入面 你操作唔到

    // Example - Map
    Map<String, Integer> map = new HashMap<>();
    map.put("orange", 3);
    map.put("apple", 2);
    map.put("bannanananana", 1);
    map.forEach((key, value) -> {
      if ("apple".equals(key)) //
        System.out.println(value); // 2
    });



  }

}
