package Printer1;

import java.util.ArrayList;
import Animal1.Animal;
import generics1.Animal1.Cat;
import generics1.Animal1.Dog;
import generics1.Animal1.Zoo;
import generics1.Box1.Box;

public class DemoGenerics {
  // <E> -> E係java自己用左represent element
  // 一般黎講自己打果時係唔會用既, 正常情況下係打<T>, 或者<K>
  // <K>通常都唔會用, 因為stand for <Key>
  // <?> 唔係用黎寫class既


  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    // Animal Example
    Zoo<Dog> zoo1 = Zoo.of(Dog.of("狗狗狗"));
    // zoo1.setAnimal(new Cat()); Complie error, strong type check
    zoo1.setAnimal(Dog.of("好狗唔爛路"));
    System.out.println("阿狗個名係 = " + zoo1.getName());

    Zoo<Animal> zoo2 = Zoo.of(new Cat()); // <-因為你set左<T>狗既範圍
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));// ?
    zoo2.setAnimal(new Cat());
    // Zoo < String > zoo3 = Zoo.of("動物園"); // 唔得, 因為declare左個範圍

    // Box
    Box<Integer> box = getBox(Integer.valueOf(100));
    System.out.println("box= " + box.toString());

    // Object object <- Box<Double>
    Object object = getBox(Double.valueOf(1.0d));
    Box<Double> d1 = (Box<Double>) object; //
    for (double d : d1.getNumbers()) {
      System.out.println("d = " + d); // 1.0
    }


  }


  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }



}


