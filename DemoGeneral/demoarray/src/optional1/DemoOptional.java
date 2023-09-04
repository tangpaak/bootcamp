import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Optional千其唔好做parameter 無意思

public class DemoOptional {

  public static void main(String[] args) throws Exception {

    // Optional <Book> -> Book -> String
    Optional<Book> o = getBook();

    if(!o.isPresent()){

    }
    
    o.ifPresent(e -> {

    });


    // Create a List first
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("aPeter"));

    Optional <Book> book = books.stream() // object book is not null
        .filter(b -> b.author.startsWith("a")) // -> null
        .findAny();

    // 1. ifPresent
    book.ifPresent(b -> {
      System.out.println("ifPresent = " + b); // 搵到peter就print
      // codes...
    });


    if (book.isPresent()) {
      System.out.println("If isPresent().get()= " + book.get()); // <--中左再print多次
    } else {
      System.out.println("No Book found");
    }

    // 2. Other example (new object, null)
    Optional<Book> book2 = Optional.of(new Book("Karina"));
    // Optional <Book> book3 = Optional.of(null)); //runtime error唔會咁寫
    Optional<Book> book4 = Optional.ofNullable(null); // false
    Optional<Book> book5 = Optional.ofNullable(new Book("JennieKim"));
    Optional<Book> book6 = Optional.empty();
    System.out.println(book6.isPresent()); // false

    // 3. orElse
    // Optional <book> -> Book
    Optional<Book> book7 = null;
    Book newBook = book6.orElse(new Book("Default"));

    // Optional <book> -> Book
    Book newBook1 = book6.orElse(null);

    // orElseGet orElsethrow
    newBook1 = book6.orElse(new Book("default"));
    Book newBook2 = book6.orElseGet(() -> new Book("default"));
    Book newBook3 = book6.orElseThrow(() -> new Exception());

  }


  public static Optional<Book> getBook() {
    // get book logic...
    return Optional.empty();
    // return null;
  }



}


