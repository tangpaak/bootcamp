package Comparator1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {

  public static void main(String[] args) {

    // Sort -> 張數字由細至大排好
    int[] arr = new int[] {4, -10, 9, -20, 100};
    Arrays.sort(arr); // n * logn, merge sort
    System.out.println(Arrays.toString(arr)); // [-20, -10, 4, 9, 100]
    // nlogn + n

    // Collection Sort -> 佢可以由細到大排好
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(88);
    arrayList.add(4);
    Collections.sort(arrayList); // nlogn
    System.out.println(arrayList); // [-100, 4, 88, 100]

    // 排序由大至細
    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(100, Color.YELLOW));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.BLUE));
    balls.add(new Ball(4, Color.YELLOW));
    System.out.println("Original= " + balls);
    Collections.sort(balls);
    System.out.println("New= " + balls);


  }

}
