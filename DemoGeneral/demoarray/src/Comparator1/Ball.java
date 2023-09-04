package Comparator1;

import java.util.Comparator;

public class Ball implements Comparable<Ball> { // Comparator 得Compare一個method <-要override
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  @Override
  public String toString() {
    return "[id= " + this.id  + ", color= " + this.color + "]";
  }

  // Yellow come first, id desending order
  // if not Yellow, id descending order
  @Override
  public int compareTo(Ball ball) {
    // if(ball.color == Color.YELLOW){
    //   if (ball.id > this.id){
    //     return ball.id > this.id? 1:-1;

    //   }
    // }
    return ball.color == Color.YELLOW? 1: -1;
    // return ball.id > this.id ? 1 : -1; // 大過this ball就會1, 細過就-1

  }

}
