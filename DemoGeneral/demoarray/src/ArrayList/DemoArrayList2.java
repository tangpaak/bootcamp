package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {


  public static void main(String[] args) {
    // ***ArrayList String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");
    strs.add("陳冠希");
    strs.add("陳冠A");
    strs.add("陳冠say");


    System.out.println("original=" + strs);

    // subList, 用黎選擇某位置至到某位置
    System.out.println(strs.subList(1, 2)); // def, from idx1 to idx1 (1, 2-1)

    // **remove
    strs.remove("def"); // remove by Object, remove the first occurence of "def"
    System.out.println(strs); // [abc, def, xyz, def] -> [abc,xyz,def]
    // remove (揀位置)
    strs.remove(1);
    System.out.println(strs); // 刪除第1位置既value -> [abc, def]

    // **Iterator
    Iterator<String> iterator = strs.iterator();
    System.out.println("Original iterator= " + iterator);
    //
    while (iterator.hasNext()) { //
      System.out.println("Next= " + iterator.next()); // abc def
    }
    for (String s : strs) { // for-each support Array and ArrayList, 特別說兩個都可以用for each去check有冇下一個數係度
      System.out.println("for each= " + s); // abc def
    }

    // **Object example
    Object[] objects = strs.toArray(); // ArrayList<String> -> 轉左做object[]

    for (Object o : objects) {
      if (o instanceof String) { // 用instanceof去check o 係咪String
        String str = (String) o; // 轉o做String
        System.out.println(" object = " + str);
      }
    } //check String (using object)

    // Array -> ArrayList
    String[] strings = new String[] {"hello", "world", "!"};
    List<String> s2 = new ArrayList<>();// List is Interface, 用緊ArrayList生s2出黎
    // List parent , ArrayList son , 好處?

    System.out.println("Original= " + Arrays.toString(strings)); // [ hello, world, !]
    System.out.println("Original= " + s2); // [ hello, world, !]

    s2.add("鄭中基"); // add() method must be reflecting the add() in ArrayList
    s2.add("鐘欣桐");
    s2.remove("鄭中基");
    System.out.println("鄭中基, 鐘欣桐=" + s2);

    // Move m = new Student();

    // Read Only -> Big Bug (因為你唔可以修改佢)
    List<String> stringList = Arrays.asList(strings); // Arrays.asList唔係ArrayList, 所以有bug
    // 生成唔到, 所以bug, 因為左右邊都係List
    //  stringList.add("ijk"); // run-time error

    // Read & Write (Solution for the Bug)
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings));
    stringList2.add("ijk");
    System.out.println(stringList2); // [ hello, world, !, ijk]



    // // For example: Fruits
    // ArrayList<String> fruits = new ArrayList<>();
    // fruits.add("Apple");
    // fruits.add("Banana");
    // fruits.add("Orange");

    // Iterator<String> iterator2 = fruits.iterator();

    // // Iterate over the elements using the iterator
    // while (iterator2.hasNext()) {
    // String fruit = iterator2.next();
    // System.out.println(fruit);
    // }

    // // Removing elements using the iterator
    // iterator2 = fruits.iterator(); // Reset the iterator
    // while (iterator.hasNext()) {
    // String fruit = iterator2.next();
    // if (fruit.equals("Banana")) {
    // iterator2.remove(); // Remove the current element ("Banana")
    // }
    // }

    // System.out.println(fruits); // Output: [Apple, Orange]



  }


}
