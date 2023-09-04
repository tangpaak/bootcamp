package Animal1;

public class Zoo<T> {

  T animal;

  // Empty
  public Zoo() {

  }

  // Constructor
  private Zoo(T animal) {
    this.animal = animal;
  }

  // static<T> ->用黎描術T既範圍
  // T -> input parameter
  // <T> -> the range of T
  // < T extends Dog> 姐係Dog講緊Dog呢一個範圍
  // < T extends Animal> 姐係Animal呢一個範圍, 所以包埋Dog同Cat
  // 如果set左係只可以<T extends Dog>係封死番個範圍只能生Dog

  public static <T extends Animal> Zoo<T> of(T animal) {
    return new Zoo<>(animal);

  }


  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }

  public T getName(){
    return this.animal;
  }

public static void main(String[] args) {
  Zoo<Boolean> zoo1 = new Zoo<>(true);
  System.out.println(zoo1);
  

}

}
