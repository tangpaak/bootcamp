import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {

  int number;


  public Card(int number, int size) {
    super(size); // super一定要放this前面 如果唔係會出事
    this.number = number;
  }

  @Override // Compiler
  public String toString() {
    return "[Number=" + this.number //
        + ", size= " + super.size //
        + "]";

  }


  public static void main(String[] args) {

    // Comparator -> @Override compare (Class SortByNumber.java)
    // 寫完以後任何class extends Paper就自動有左呢個compare
    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(4, 3));
    Collections.sort(cards, new SortByNumber());
    // public static <T> void sort(List<T> list, Comparator<? super T> c) {
    // list.sort(c);
    // }
    // cards係 List<T> list, new SortByNumber()既compare就係Comparator<? super T> c
    System.out.println(cards);

    //繼承關係 
    List<? extends Number> numbers = new ArrayList<Integer>();
    //<? extends Number> 任何under Number既type都可以配落去
    numbers = new ArrayList<Double>();

    Number number = new Integer(10); // Polymorhism
    number   = new Double (2.0); // Polymorhism
    number = Integer.valueOf(15); //<-咁樣係行快d
    System.out.println("Integer.valueOf(15)= " + number);






  }





}
