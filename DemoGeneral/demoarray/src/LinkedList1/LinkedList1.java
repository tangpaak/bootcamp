
package LinkedList1;

import java.util.LinkedList;

public class LinkedList1 {
  
  public static void main(String[] args) {
    LinkedList<String> quene = new LinkedList<>();

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
    System.out.println("電影睇左= " + quene + "\n"); // []

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
    LinkedList<String> backup = quene;
    System.out.println(backup);

    while (!quene.isEmpty()) {
      System.out.println(quene.poll()); // abc, ijk
    }
    System.out.println(quene.size()); // 0



  }

}
