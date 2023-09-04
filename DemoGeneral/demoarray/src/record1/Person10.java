

public record Person10 (String name, int age) implements TestInterface {
  // 1. Immutable Objects
  // 2.final class, support Generics
  // 3. private final String name;
  // 4. private final int age;
  // 5. All-args constructor ONLY
  // 6. All Getters
  // 7. No Setters (final instance variable)
  // 8. 佢 record意思姐係佢背後係一個final class, 唔比你修改佢所有既野
  // 9. custom static methods, static variables
  // 10. custom instance methods
  // 11. no other instance variables -> int salary; <- this is fail, since it s final
  // 12. Support Interface, but cannot further extends (extends Object.class)
  // 13. Already @Override equals(), hashCode(), toString()


  // 1. Tools
  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constant

  public boolean isElderly(int age) {
    return age >= 65;
  }


  public static int add(int x, int y) {
    return x + y;
  }


  @Override
  public void eat() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eat'");
  } //?????


}


