package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Pocket {
  ArrayList<Ball> balls; // 形容緊attribute

  public Pocket() {
    this.balls = new ArrayList<>();
  }

  public boolean isFull() {
    return this.balls.size() >= 5;
  }


  public void add(Ball ball) {
    // if numbers of ball >= 5, remove 1st ball(idx = 0), and add
    if (this.balls.size() >= 5) { // 加入去既波最多只可以係5個波, 以上就要del,以防爆炸
      this.balls.remove(0); // ?

    }
    this.balls.add(ball);
  }

  public void remove(Ball ball) {
    this.balls.remove(ball); // first occurance
  }

  public void remove(int ballId) {
    // Overloading
    for (Ball b : this.balls) {
      if (b.getId() == ballId) { // primitive ==
        this.balls.remove(b);
        return; // remove the first and return
      }
    }
  }

  public void removeFirstBall() {
    this.balls.remove(0);
  }

  public int getSize() {
    return this.balls.size();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (Ball b : this.balls) {
      sb.append(b.toString());
      sb.append(",");
    }
    sb.append("]");
    return sb.toString();

  }


  public int totalScore() {
    int sum = 0;
    for (Ball b : this.balls) {
      sum += b.getScore();
    }
    return sum;
  }


}
