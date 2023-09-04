package Queue1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQuene1 {

  public static void main(String[] args) {
    PriorityQueue<String> quene = new PriorityQueue<>();
    // First In, First Out
    // Quene入面一定係Array黎, 普通既StringArray, 係無get呢樣野
    // *** 個出既排序係根據個字母開頭去睇邊個出先

    quene.add("黃子華 出黎");
    quene.add("Dodo姐 出黎"); // 點解dodo姐出先既???

    // peek
    System.out.println(quene.peek()); // 偷望一望個element; 黃子華仲係果個水管入面 (唔影響水管入面既element)
    System.out.println(quene.size()); // 2, 子華仲係入面
    // poll
    System.out.println(quene.poll()); // 黃子華 2-1 =1
    System.out.println(quene.poll()); // Dodo姐 1-1 =0
    System.out.println(quene.size() + "\n"); // 0

    //
    quene.add("一蚊雞保錶");
    quene.add("毒舌大狀");
    quene.add("飯戲攻心");
    System.out.println(quene.remove("毒舌大狀")); // true
    System.out.println("刪左毒舌" + quene); // [一蚊雞保錶, 飯戲攻心]
    System.out.println(quene.poll()); // 一蚊雞保錶
    System.out.println(quene.poll()); // 飯戲攻心
    System.out.println(quene + "\n"); // []

    System.out.println(quene.offer("棟督神探")); // add, so true
    System.out.println(quene.offer("男親女愛")); // add, so true
    System.out.println("加神探同男親女愛= " + quene);
    System.out.println("size= " + quene.size()); // 2

    if (quene.contains("棟督神探")) { // true
      quene.remove("棟督神探"); // first occurence of element
    }
    System.out.println("無左棟督 = " + quene + "\n");

    for (String str : quene) {
      System.out.println(str);
    }
    //
    while (!quene.isEmpty()) { // 睇到佢無野為止, 所以睇左兩集男親女愛
      System.out.println(quene.poll()); // "男親女愛" , "男親女愛"
    }
    System.out.println(quene);

    // BackUP
    PriorityQueue<String> backup = quene;
    System.out.println(backup);

    while (!quene.isEmpty()) {
      System.out.println(quene.poll()); // [] []
    }
    System.out.println(quene.size()); // 0

    // Linked List example
    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0);
    queueNum.add(-3);
    queueNum.add(100);
    System.out.println("original queueNum = " + queueNum);

    // 淨係搵雙數除盡
    // 10, 9, -3, 100
    int countEven = 0;
    int element = 0;
    System.out.println("Start");
    int size = queueNum.size();
    int i = 0;

    while (i++ < size) { // 0,1,2,3,4,5
      element = queueNum.poll();
      if (element % 2 == 0 && ++countEven == 2) {
        continue;
      } 
      queueNum.add(element);
    }
    System.out.println("queueNum = " + queueNum);
//
// [10, 9, 0, -3, 100] 
// [9, 0, -3, 100, 10]
// [0, -3, 100, 10, 9]
// [-3, 100, 10, 9] <- del 0
// [100, 10, 9, -3]
// [10, 9, -3, 100]

  }



}

