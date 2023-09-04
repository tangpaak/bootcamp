import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Lambda {


  static Comparator<Integer> getComparator() {
    return (a, b) -> b.compareTo(a);
  }


  public static void main(String[] args) {


    // int a =1;
    // System.out.println(a);

    // Lambda
    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    // numbers.forEach(n -> System.out.println(n));

    // Lambda - Comparator
    List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1);
    Comparator<Integer> descendingComparator = getComparator();
    numbers.sort(descendingComparator);

    System.out.println("Numbers in descending order:");
    numbers.forEach(n -> System.out.println(n));

    
    // Lambda - other example:

    // Example 1: Sum of two integers
    IntBinaryOperator sum = (a, b) -> a + b;
    int result1 = sum.applyAsInt(5, 3);
    System.out.println("Sum: " + result1);

    // Example 2: Difference between two integers
    IntBinaryOperator difference = (a, b) -> a - b;
    int result2 = difference.applyAsInt(8, 4);
    System.out.println("Difference: " + result2);

    // Example 3: Product of two integers
    IntBinaryOperator product = (a, b) -> a * b;
    int result3 = product.applyAsInt(6, 2);
    System.out.println("Product: " + result3);


    // Here are a few realistic examples where lambda expressions can be used effectively:

    // Sorting a List:

    List<String> names = Arrays.asList("John", "Alice", "Bob", "Mary");
    
    // Sort the names in alphabetical order using lambda expression
    names.sort((name1, name2) -> name1.compareTo(name2));
    
    // Print the sorted names
    names.forEach(System.out::println);

    
    // In this example, a lambda expression is used to define the sorting criteria for a list of names. 
    // The `sort` method of the `List` interface takes a lambda expression as an argument, 
    // which specifies how to compare two elements. Here, the names are sorted in alphabetical order.
    
    // Filtering a Collection:
    
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Filter even numbers using lambda expression
    List<Integer> evenNumbers = numbers1.stream()
                                       .filter(n -> n % 2 == 0)
                                       .collect(Collectors.toList());
    // Print the even numbers
    evenNumbers.forEach(System.out::println);
    
    // In this example, a lambda expression is used to filter even numbers from a list of integers. 
    // The `filter` method of the `Stream` interface takes a lambda expression as a predicate, 
    // which determines whether an element should be included in the resulting stream. Here, 
    // the lambda expression `(n -> n % 2 == 0)` checks if a number is even.
    
    // Event Handling:
    
    // JButton button = new JButton("Click me");
    
    // // Add an event handler using lambda expression
    // button.addActionListener(e -> System.out.println("Button clicked"));
    
    // // Display the button in a JFrame
    // JFrame frame = new JFrame();
    // frame.getContentPane().add(button);
    // frame.pack();
    // frame.setVisible(true);
    
    // In this example, a lambda expression is used as an event handler for a button's click event. 
    // The `addActionListener` method of the `AbstractButton` class takes an `ActionListener` interface as an argument, 
    // which can be conveniently implemented using a lambda expression. Here, the lambda expression 
    // (e -> System.out.println("Button clicked"))` defines the action to be performed when the button is clicked.


  }



}


