package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {


  public static void main(String[] args) {

    // fixed length
    int[] arr = new int[] {1, 3, 2};
    Integer[] integers = new Integer[] {1, 3, 2};

    // resize, which is create new object
    integers = new Integer[] {1, 3, 2, 4};
    // Integers[2] = "abc" :// compile time error
    // 留意Array既極限, 比如整購物車要set 1000個單位為極限

    // Declaration
    ArrayList<Integer> numbers;

    // Intialization, create ArrayList object
    numbers = new ArrayList<>(); // 呢個鑽石符號基本一定要放野

    ArrayList<Integer> numbers2 = new ArrayList<>(); // empty array
    numbers2.add(1); // 第一個length 1 array [1]
    System.out.println("numbers2= " + numbers2);
    numbers2.add(2); // 刪除[1]並新增第二個length 2 array [1,2]
    System.out.println("numbers2= " + numbers2);
    numbers2.add(3); // 刪除[1,2]並新增第三個length 3 array [1,2,3]
    System.out.println("numbers2= " + numbers2);
    numbers2.add(4); // 刪除[1,2,3]並新增第四個length 4 array [1,2,3,4]
    System.out.println("numbers2= " + numbers2);
    numbers2.add(null); // 刪除[1,2,3,4,null]並新增第五個length 5 array [1,2,3,4,null]
    numbers2.add(4);
    System.out.println("numbers2= " + numbers2);
    // numbers2.add((Integer) Long.valueOf(3)); // Cannot cast Long to Integer


    // variable-length

    // Conversion, ArrayList -> Array
    Integer[] arr2 = new Integer[numbers2.size()]; // size係arraylist個長度
    arr2 = numbers2.toArray(arr2); // Define output array type for toArray() perform conversion
    System.out.println("arr2=" + Arrays.toString(arr2)); // [1,2,3,4,null]

    // ArrayList <int}, not support primitive

    for (int i = 0; i < numbers2.size(); i++) {
      System.out.println(numbers2.get(i)); // Possible to have IndexOutofBound

    }

    int original = numbers2.set(2, 100); // Unbox, Replace the element at index 2 with 100 and return the original value
    System.out.println("original = " + original); // print緊第三個array, 所以係3

    System.out.println("numbers2.isEmpty()= " + numbers2.isEmpty()); // false
    System.out.println(numbers2.size() == 0); // false

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    numbers2.addAll(numbers3); // add all items from numbers3 to numbers2
    System.out.println("numbers3= " + numbers3); // [1000,2000]
    System.out.println(numbers2.size()); // 7

    // Remove
    numbers2.remove(2); // remove by index, remove Integer100
    System.out.println(numbers2.size()); // 6
    System.out.println("test removeAll= " + numbers2);

    numbers2.removeAll(numbers3); // remove Integer 1000,2000, 刪除所有關於numbers3既數字
    System.out.println("removeAll =" + numbers2);
    System.out.println(numbers2.size()); // 4
    System.out.println("test" + numbers2); // [1,2,4,null]

    //
    System.out.println("indexOf(1000)= " + numbers2.indexOf(1000)); // -1, 無果個number既位置就會寫-1
    System.out.println("indexOf(3)= " + numbers2.indexOf(null)); // 1 <- 搵果個number既位置 null就係第3 [0,1,2,3]

    // lastIndexOf, Find the last occurance of element 4
    System.out.println("lastIndexOf=" + numbers2.lastIndexOf(4));
    System.out.println();
    // 搵最後果個4係array邊個位置 [0,1,2,3,4] [1,2,4,null,4] 所以最後係numbers2[4]

    System.out.println(numbers2); // [1,2,4,null,4]

    //
    System.out.println(numbers2.contains(4)); // true
    System.out.println(numbers3.contains(900)); // false, check array入面有無900呢個數字
    System.out.println(numbers2.containsAll(numbers3)); // false
    
    //
    numbers2.add(1, 5); // 加5字係 numbers[1]呢個位, insert function
    System.out.println("add(1,4)=" + numbers2); // [1,5,2,4,null,4]


    numbers2.clear(); // remove all elements , 要放最後面
    System.out.println(numbers2.size()); // 0



  }

}
