package HashMap1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {



  public static void main(String[] args) {
    // Back ground: String[int],
    // Limitation: you can only access the element by int index
    // Solution: Hashmap<>
    // 第一係key, 第二係value <key, value>

    HashMap<String, String> map = new HashMap<>();
    // String represent另一個String, 乜鬼?????
    // <String, String > -> <key, value>
    map.put("abc", " hello world"); // first entry
    System.out.println("add1 = " + map + "\n");

    map.put("bcd", "I am Developer"); // second entry
    System.out.println("map有幾多entry = " + map.size()); // total 2 entries
    System.out.println("add2 = " + map + " \n"); // {bcd= I am Developer, abc= hello world}, 點解bcd反而係前面咁搞笑->因為無順序

    // Map.Entry -> Key + Value
    // if Duplicated (equals(), hashCode()), override
    map.put("陳冠A", "影音部");
    System.out.println("陳冠A係咩部門 = " + map.get("陳冠A")); // 查佢係咩部門 ->影音部 ,
    System.out.println("阿嬌係咩部門 = " + map.get("阿嬌")); // 搵唔到所以係既就會null
    System.out.println("map有幾多entry = " + map.size()); // 3 entries
    System.out.println("依家個Map= " + map + "\n");

    // Remove
    if (!map.containsKey("abc"))
      return;

    // Map - Loop Entries
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue() + " \n");
    }
    // Loop Keys
    for (String key : map.keySet()) {
      System.out.println(key + " \n");
    }
    // Loop value
    for (String value : map.values()) {
      System.out.println(value + " \n");
    }


    System.out.println(map.remove("陳冠A")); // 刪左陳冠A
    System.out.println("刪左陳冠A個Map= " + map);
    System.out.println(map.remove("bcd", "I am NOT Developer")); // 刪唔到 false
    System.out.println(map.remove("bcd", "I am Developer")); // 刪左 true
    System.out.println("Remove依家個Map= " + map + "\n"); // abc = hello world



  }

}
