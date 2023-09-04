import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {

  public static void main(String[] args) {
    List<String> str = new ArrayList();
    str.add("abchtfhf");
    str.add("ghijhghjgjd");
    str.add("defjgjjksgfjhdsgfhdsfiaygd");
    str.add("defjujy");

    // for-each
    for (String s : str) {
      System.out.println(s);
    }
    //////////////////////////////////////////////////

    // 1. Stream
    Stream<String> streamstr = str.stream();

    // i. Filtering
    streamstr = streamstr.filter(s -> s.startsWith("a")); // 入面係放呢個predicate

    // ii. Stream.forEach
    streamstr.forEach(s -> System.out.println(s)); // abc

    str.stream()//
        .filter(s -> s.endsWith("k"))//
        .forEach(s -> System.out.println("test subject= " + s)); // abc

    str.stream() //
        .filter(s -> s.length() == 3) //
        .collect(Collectors.toList());

    List<String> str2 = str.stream().collect(Collectors.toList());// Collect轉佢做List > filter哂全部長度==3既野, 放入str, 再放入str2
    // .filter(s -> s.length() == 3)//
    // .collect(Collectors.toList());
    // System.out.println(str2.size()); // 有三舊野, result is 3, abc ghi def
    System.out.println("str2= "+ str2);



    // 2. map() - 轉做Integer
    List<Integer> lengths = str.stream()//
        .filter(e -> e.startsWith("a") || e.startsWith("d"))// abc def
        .map(e -> e.length()) // 轉形態做 Stream <Integer>//3 3
        .collect(Collectors.toList()); // List <Integer>// 3 3
    System.out.println("lengths= " + lengths);


    lengths.forEach(e -> System.out.println(e)); // 3 3
    // 3. Stream.sorted()
    str2.stream()//
        .sorted((s1, s2) -> s2.compareTo(s1)) // descending order
        .collect(Collectors.toList()) // 會出左逆時針
        .forEach(s -> System.out.println(s));
    // 4. Stream.anymatch()
    if (str2.stream().anyMatch(e -> e.startsWith("a"))) {
      System.out.println("ONe of tht elements starts with a");
    }

    // 5.
    // interminate operations of Stream:
    // fiter(), map(), sorted(), anyMatch()

    // terminated operations:
    // collect(), for Each()

    // Stream can only terminate once,
    // but it may have multiple interminate operations


    // 6. Person example
    List<Person999> persons =
        Arrays.asList(new Person999("John", 30), new Person999("Mary", 25));

    // stream -> get all the ages from persons
    List<String> names = persons.stream()//
        .map(e -> e.getName())//
        .collect(Collectors.toList());

    System.out.println(names);


    System.out.println(names.stream().filter(e -> e.equals("John")).toString());

    // 7. Stream static method - distinct
    long l = Stream.of("abc", "defz", "ghivv")//
        .filter(e -> e.length() == 3)//
        .distinct() // 消滅一d Dupliate既野
        .count(); // 1

    Stream.of(1, 2, 3, 4).map(e -> {
      System.out.println(e);
      return e;
    }).count();

    // stream仍然可以由自己出發, 或者由一條ArrayList出發都得
    // 我地唔會係stream既狀態攞d野, 一般黎講只會用list去攞
    // stream係一d暫時性既野黎

    // 8. 點解print唔到個e
    Stream.of(1, 2, 3, 4)//
        .map(e -> {
          System.out.println(e); // why?
          return e;
        }).count();

    // .count(); <- terminate operation
    // execution 同count係兩回事

    // 9.
    int setSize = Stream.of(1, 2, 3, 3) //
        .collect(Collectors.toSet()).size();
    System.out.println(setSize); // 3


    // 10. For each example
    Stream.of(1, 2, 3, 3, 5)//
        .filter(e -> e < 6 && e > 2) // e係細過6大過2既數字
        .forEach(e -> System.out.println(e)); // 3 3 5

    // 11. Stream String (Map example)
    List<String> animals = Arrays.asList("lion", "tiger", "bear");

    Map<String, Integer> animalMap = animals.stream() //
        .collect(Collectors.toMap(snake -> snake, snakelength -> snakelength.length()));
    // key String- > snake
    // value Integer -> snakelength



    // 12. Loop Map example (Please check 11, is related animalMap)
    for (Map.Entry<String, Integer> entry : animalMap.entrySet()) { // 寫住Set, 意思return type就係Set
      System.out.println(entry.getKey() + " " + entry.getValue());
      // 都係搵key入value

      // Stream.iterate()
      Stream.iterate(1, n -> n + 2) //
      .limit(10) //
      .forEach( e -> System.out.println(e));

      // 


    }



  }

  public static boolean find(List<Person999> persons) {
    return persons.stream() //
        .filter(e -> e.getAge() >= 65) //
        .findFirst() //
        .isPresent();
  }



}
