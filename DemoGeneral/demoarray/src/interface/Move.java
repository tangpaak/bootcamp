// Before Java8, 100% abstraction

public interface Move extends BigMove { //interface extends interface
  // Move is an interface

  // int age; <- interface唔可以有instance variable
  // 可唔可以有variable? no instance variables -> camlcase

  // Constant
  static final int MAX_SPEED = 10; // public // (SPEED)為免誤會, 一般全部寫哂大寫


  // Java -> Camlcase
  // "noOfDay"

  // *** Behaviors
  void jump();

  void up(); // public abstract 上

  void down(); // public abstract 下

  void left(); // public abstract 左

  void right(); // public abstract 右

  // No method implemenetions

  // After Java 8, lambda, stream
  default void print() { // instance method, implicitly public
    System.out.println("I am Java8 default method");

  }

  static String concat(String a, String b) {
    return a + b;

  }



}
