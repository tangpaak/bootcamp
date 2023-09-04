public class Dog extends GameMember implements Move,Move2 { // what is implements?????

  // int score = 0;
  String name;

  @Override
  public void jump() {
    super.addScore(1);
  }

  @Override
  public void up() {
    System.out.println("Moving up");
    super.addScore(2);
    // GameMember.up(this);
  }

  @Override
  public void down() {

  }

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }

  @Override
public void print(){
 System.out.println(" good dog.");
}

public static void main(String[] args) {
  

  Dog dog = new Dog();
  dog.print(); //print () from GameMember or Move?
}

}
