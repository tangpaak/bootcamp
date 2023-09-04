package HashSet1;

import java.util.HashSet;

public class HashSet2 {

  public static void main(String[] args) {
    // HashSet Byte
    HashSet<Byte> bytes = new HashSet<>();
    System.out.println("add4 = " + bytes.add(Byte.valueOf((byte) 4))); // true 加到4入個Hashset
    System.out.println(bytes);
    System.out.println("bytes依家有無4 = " + bytes.contains((byte)4) + "\n"); //有, 加到
    // int (4) -> Byte 轉唔到, 如果寫bytes.add(4)
    // bytes now have 4

    boolean Added10 = bytes.add(bytes(10)); // int ->byte->Byte (用緊下面Byte bytes (int num),轉做byte既格式)
    System.out.println("Add10 = " + Added10); // true, 因為入到
    System.out.println(bytes);
    System.out.println("bytes依家有無10 = " + bytes.contains((byte)10) + "\n"); //有, 因為加左
    // Java is not necessary to handle return value
    // bytes now have 4, 10

    boolean isAdded4 = bytes.add(bytes(4));
    System.out.println("Add4 again= " + isAdded4); // false, 重複左4, 入唔到
    System.out.println(bytes + "\n");
    // bytes now have 4, 10 so cannot add 4 again

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(bytes(4));
    bytes2.add(bytes(10));
    System.out.println("bytes2= " + bytes2); // [4,10]
    System.out.println("bytes等唔等如bytes2= " + bytes.equals(bytes2) + "\n"); // true, Byte equals()

    boolean isRemoved10 = bytes.remove(bytes(10)); // bytes刪除10 -> [4]
    System.out.println("Remove10既bytes = " + bytes);
    System.out.println("isRemoved10 = " + isRemoved10 + "\n"); // true

    bytes.clear();
    bytes2.clear();
    System.out.println("clear bytes = " + bytes); // []
    System.out.println("clear bytes2 = " + bytes2); // []
    System.out
        .println("Clear既 bytes[] 等如 bytes2[] = " + bytes.equals(bytes2) + "\n"); // true, [] 等如 []

    System.out.println("[] 有無null = " + bytes.contains(null)); // [] 唔係null
    System.out.println("[] 有無space = " + bytes.contains(" ")); // [] 無space
  }


  public static Byte bytes(int num) {
    return Byte.valueOf((byte) num);
  }



}
