package Animal1;

import java.util.ArrayList;
import Box1.Box;

public class MainAnimal {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    // Animal Example
    Zoo<Dog> zoo1 = Zoo.of(Dog.of("狗狗狗"));
    // zoo1.setAnimal(new Cat()); Complie error, strong type check
    zoo1.setAnimal(Dog.of("def"));
    System.out.println("test = " + zoo1.getName());

    Zoo<Animal> zoo2 = Zoo.of(new Cat()); // <-因為你set左<T>狗既範圍
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));// ?
    zoo2.setAnimal(new Cat());
    // Zoo < String > zoo3 = Zoo.of("動物園"); // 唔得, 因為declare左個範圍

    // Box
    Box<Integer> box = getBox(Integer.valueOf(100));
    System.out.println("box= " + box);


  }


  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }

}
