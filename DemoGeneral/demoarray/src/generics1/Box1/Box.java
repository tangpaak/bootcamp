package Box1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  public Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public Box(ArrayList<T> numbers) {
    this.numbers = numbers;
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    this.numbers.add(number);
    // 未new既話齋呢一句係會null pointer
  }

  public int size() {
    return this.numbers.size();
  }

  @Override
  public String toString() {
    return String.valueOf(this.numbers);
  }



  // public void setNumbers(T[] numbers){
  // this.numbers = numbers;
  // }

  // public ArrayList<T> getBox() {
  // return this.numbers;
  // }

  public static void main(String[] args) {

    // Box <String> box1 = new Box<>(); //->Complie error 個範圍無得用String
    Box<Integer> box1 = new Box<>(); // 只比用家去放number
    System.out.println("box size= " + box1.size());
    System.out.println("Orginal = " + box1);
    box1.add(10);
    System.out.println("add10= " + box1);
    // box1 = new Box<>("abc"); // new Box <>("abc") is not Box <Number>
    
    //
    Collections.sort(1234);
    // public static <T extends Comparable<? super T>> void sort(List<T> list) {
    // list.sort(null);
    // }
    // <? super T>佢自已或者parent都可以



  }

}
