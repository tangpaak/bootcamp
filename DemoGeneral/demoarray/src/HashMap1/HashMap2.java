package HashMap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import HashSet1.Book1;


public class HashMap2 {

  public static void main(String[] args) {
    
HashMap<Integer, Book1> books = new HashMap<>(); //
// key = address of Bytes or valie of Bytes?
// books.put(128, new Book ("Eric"));
// books.put(128, new Book("Steve"));
System.out.println(books.size()); // 1

HashMap<Author, Book1> bookMap = new HashMap<>();
// Author unique key? -> equals(), hashcode()

Author author1 = new Author("John", 30);
Author author2 = new Author("ken", 29);

bookMap.put(author1, new Book1("Author", "Book3")); // put -> add既意思
System.out.println("authur1 " + bookMap + " ");
bookMap.put(author2, new Book1("Author special", "Book4")); // 因為只係對John(key), Author special只係value
System.out.println("authur2 " + bookMap);
System.out.println("Size= " + bookMap.size()); //1 
// 因為John係Map上面係同一個位置, 所以size係1, 除非有第二個key出現先會係2


//
ArrayList<ArrayList<String>> strs = new ArrayList<>();

// ArrayList<Integer[]> 


//bookMap2
HashMap < Author, ArrayList<Book1>> bookMap2 = new HashMap<>();

ArrayList<Book1> booklist1 = new ArrayList<>();
booklist1.add(new Book1("Author", "Book1")); // 因為係ArrayList要用add
booklist1.add(new Book1("Author2", "Book2"));

ArrayList<Book1> booklist2 = new ArrayList<>();
booklist2.add(new Book1("Author3", "Book3"));
booklist2.add(new Book1("Author4", "Book4"));

bookMap2.put(author1, booklist1); //用番阿John加落去
System.out.println("BookMap2加author1先= " + bookMap2);
bookMap2.put(author2, booklist2);
System.out.println("BookMap2加埋author2= " + bookMap2 + "\n"); //{ John=[Author3, Author4]}
//呢個動作會覆寫左本身果個John, author author2變左author3 author4

// Loop bookMap2, print out all the books from each Author
System.out.println("for loop bookMap2:");
for (Map.Entry<Author, ArrayList<Book1>> author: bookMap2.entrySet()){ // 
    // System.out.println(author.getKey().name );
    for (Book1 book : author.getValue()){
        System.out.println("Author name: " + author.getKey().getName() + ", Book Name: " + book.getName()+"\n");
    }
}
System.out.println("booklist:");
System.out.println("booklist1 = " + booklist1);
System.out.println("booklist2 = " + booklist2);
System.out.println("Bookmap2 = " + bookMap2+"\n");

//
for(Book1 book : bookMap2.get(new Author("John",0))){
  System.out.println(book);

}




// Map<Nationality,Autuor>;

// enum Nationality{

// }

// class Autuor{
//   Nationality -> NationalityId
//   AutuorId
//   List<Book>;
// } 

// class Book{
//   Autuor 
//   int pages;
// }
















  }


 



  
}
