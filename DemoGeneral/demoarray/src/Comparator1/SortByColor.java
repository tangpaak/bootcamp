package Comparator1;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class SortByColor implements Comparator<Ball> {


  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.color.id > b2.color.id ? 1 : -1;
    // b1 大過 b2

  }

  public static void main(String[] args) {

    // 排序由大至細
    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.BLUE));
    balls.add(new Ball(100, Color.RED));
    System.out.println("Original= " + balls);
    Collections.sort(balls,new SortByColor()); // 但係SortbyColor唔係空架咩
    System.out.println("New= " + balls);

    Queue q = new ArrayDeque<>();


  }

}
