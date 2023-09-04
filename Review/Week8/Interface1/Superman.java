package Interface1;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Formatter.BigDecimalLayoutForm;

public class Superman implements Flyable {

  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  public static void main(String[] args) {

    // 3 ways to new a flyable object:

    // 1.Polymorphism
    Flyable superman = new Superman();

    // 2. Anonymous (好少人咁寫)
    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("I am announyums");
      }
    };

    // 3. Lambda
    Flyable superman3 = () -> System.out.println("I am Lambda");



    // 4. Optional
    Optional<String> string = Optional.ofNullable("abc");
    // int sum = 0;;
    string.ifPresent(e -> {
      // sum++;
      // String s = "";

    });

    // s = s + "hello";
    int total = 0;
    if (string.isPresent()) {
      total++;
      // String s = "";

    }
    // s = s+ "";''
  

  }

    // 5. BigDecimal
    public static double add(double a, double b){
      return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
    }

}
