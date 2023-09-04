import java.util.Arrays;

public abstract class GameMember {
  // Game is a Class
  int score;

  public static void upOnce(Move2[] moves) {
    for (Move2 move : moves) {
      move.up(); // dog objects / student objects
    }
  }

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score = score;
  }

  public void print() {
    System.out.println("GameMember is jumper");
  }

  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) {
    for (GameMember member : members) {
      member.up(); // dog /cat object
    }
  }

  public static void moveOnce(Move2[] members) {
    for (Move2 member : members) {
      member.jump();// override jump() in cat
    }

  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore()); // 2
    System.out.println(cat.getScore()); // 1

    Move[] members = new Move[] {dog, cat};
    GameMember.moveOnce(new Move2[] {dog, cat});
    System.out.println(dog.getScore()); // 1
    System.out.println(cat.getScore()); // 6
    System.out.println("output : " + Arrays.toString(members));
    GameMember.upOnce(members);

    // Interface Move default instance method
    dog.print();
    cat.print();

    // static method
    System.out.println(Move.concat("abc", "def"));


    // After Java 8
    Cow cow = new Cow();
    cow.print();
    // 如果你老豆同老母個技能係一樣, 就唔可以extend二次


  }

}
