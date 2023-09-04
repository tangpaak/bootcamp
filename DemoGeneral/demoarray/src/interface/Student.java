
public class Student extends Person2 implements Runnable, Swimable, Move {

  private String name;
  private int score;

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }

  @Override
  public void up() {
    this.score += 1;
  }

  @Override
  public void down() {

  }


  @Override
  public void breath() {

  }

  @Override
  public void run() {
    System.out.println("student is running");
  }

  @Override
  public void eat() {
    System.out.println("student is eating");
  }

  @Override
  public void swim() {
    System.out.println("student is swimming");
  }


  public static void main(String[] args) {

    // how to make Move-> MAX_SPEED output?
    System.out.println(Move.MAX_SPEED); // result is 10

    // 究竟interface仲有咩用處？ declare variable
    Move student = new Student();
    student.up();
    student.down();
    student.left();
    student.right();
    // System.out.println(move.MAX_SPEED); // Not recommended

    Move dog = new Student();
    dog.up();
    dog.down();
    dog.left();
    dog.right();



    Swimable swimable = new Student();
    swimable.swim();

    Person2 person = new Student();
    person.breath();
    person.getAge();


  }

  @Override
  public void jump() {
    throw new UnsupportedOperationException("Unimplemented method 'jump'");
  }



}
