package HashSet1;

public class Book1 {

  public String author;
  public String name;

  public Book1 (String author, String name){
    this.author = author;
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public String getAuthor() {
    return this.author;
}

@Override
public String toString() { 
    return "[Author name: " + this.author + ", name= " + this.name + "]";
}

  // @Override
  // public boolean equals(Object o) {
  //   if (this == o) //reference 地址
  //     return true;

  //   if (!(o instanceof Book))
  //     return false;  //class

  //     Book book = (Book) o;
  //   return this.author == book.author; //value
        
  // }


  // @Override
  // public int hashCode(){ //
  //   return Objects.hash(this.author);
  // }

  
  
}
