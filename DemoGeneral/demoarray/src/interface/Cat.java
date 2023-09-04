public class Cat extends GameMember implements Move,Move2{

  String name;



  @Override
  public void up() {
    System.out.println("Moving up");
    super.addScore(1);
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
  public void jump() {
    super.addScore(6);
  }

  @Override
  public void BigJump() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'BigJump'");
  }



}
