package ArrayList;

import java.util.Arrays;

public class Person {

  Pocket[] pockets;

  public Person() {
    pockets = new Pocket[] {new Pocket(), new Pocket()};
  }

  public int calLeftScore() {
    return this.getLeftPocket().totalScore();
  }

  public int calRightScore() {
    return this.getRightPocket().totalScore();
  }

  public int calculateScore() {
    return this.getLeftPocket().totalScore()
        + this.getRightPocket().totalScore();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }

  public static void fillThePocket(Pocket pocket) { // 填充個袋袋袋袋袋

    while (!pocket.isFull()) { // 如果個袋袋滿左5個波,就刪除第一個[0]波,等佢有空間
      // Random a ball with a random color
      pocket.add(Ball.random());// ?????
    }
  }

  public static void main(String[] args) {
    // 比較兩個人既分數
    Person fokgor = new Person();
    Person.fillThePocket(fokgor.getLeftPocket());
    Person.fillThePocket(fokgor.getRightPocket());
    System.out.println("霍哥= " + fokgor.getLeftPocket().getSize()); // 5
    System.out.println("霍哥= " + fokgor.getRightPocket().getSize()); // 5
    System.out.println("霍哥cal score= " + fokgor.calculateScore());
    // System.out.println("Left Score : " + fokgor.getLeftPocket());
    // System.out.println("Right Score : " + fokgor.getRightPocket());

    System.out.println("Left = " + fokgor.getLeftPocket().toString());
    System.out.println("Right = " + fokgor.getRightPocket().toString());

    Person chow = new Person();
    Person.fillThePocket(chow.getLeftPocket());
    Person.fillThePocket(chow.getRightPocket());
    System.out.println("周永恆= " + chow.getLeftPocket().getSize()); // 5
    System.out.println("周永恆= " + chow.getRightPocket().getSize()); // 5
    System.out.println("周永恆cal score= " + chow.calculateScore());



  }



}
