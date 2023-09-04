import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {



  public static void main(String[] args) {

    // 1. Stream().distinct() - remove duplicate data
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

    List<Integer> distinctNumbers =
        numbers.stream().distinct().collect(Collectors.toList());

    System.out.println(distinctNumbers);
    // result is [1,2,3,4,5]



    // 2. Stream - is one time use
    numbers = Arrays.asList(1, 2, 3, 4, 5);

    Stream<Integer> stream = numbers.stream().filter(n -> n % 2 == 0);
    long count = stream.count();
    System.out.println("Count: " + count);

    // i. Attempting to reuse the same stream will result in an "IllegalStateException"
    // since stream is one time use as below:

    // int sum = stream.mapToInt(Integer::intValue).sum(); //<- this will show Runtime ERROR
    // System.out.println("Sum: " + sum);

    // 3. Stream.map()
    // i. add data , but we need John, Sarah, Michael
    List<Person> people = Arrays.asList(//
        new Person("John", 25), //
        new Person("Sarah", 30), //
        new Person("Michael", 35)); //
        
    // ii. use map to get Name, so we don't show 25,30,35, only show John, Sarah, Michael
    List<String> names = people.stream() //
        .map(e -> "hello")  //
        .collect(Collectors.toList()); //

    System.out.println(names);
    // result is John, Sarah, Michael

    // 4. AnyMatch
    numbers = Arrays.asList(1, 2, 3, 4, 5);
    boolean anyMatchGreaterThanTen = numbers.stream().anyMatch(num -> num > 3);

    System.out.println(anyMatchGreaterThanTen);


    // 5. filter
    numbers = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> evenNumbers = numbers.stream()//
    .filter(num -> num % 2 == 0) //西選
        .collect(Collectors.toList());

    System.out.println(evenNumbers);


  }



}
