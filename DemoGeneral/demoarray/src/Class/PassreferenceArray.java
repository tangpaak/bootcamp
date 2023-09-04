import java.util.Arrays;

public class PassreferenceArray {

  public static int[] addOne(int[] arr) { // arr-> object reference(地址)

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
    return arr;

    // 唔洗特登去寫多行result既array = new arr, 因為咁樣會令個電腦負荷高左
    // Array 一定係pass地址入去, (pass by reference)
    // pass by reference有得選擇去back up多條array (Array)
    // 但pass by value無得選擇, 一定係pass by value (String)

  }

  // *** All Wrapper Class + String -> Pass by Value
  public static String concat(String s1, String s2) { // pass by value
    s1 = "hello";
    return s1 + s2;
  }
  // --> to below call concat

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8}; // <- pass by reference地址
    addOne(nums); // [4,5,9] <- 咁樣已經係改左入面既數, 唔洗特登寫int result[] = addOne(nums);
    System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    // Call concat <-- pass by value
    String a = "abc";
    String b = "def";

    concat("abc", "def"); // abcdef
    System.out.println(a);
    System.out.println(concat("abc", "def"));

    // result should be hellodef -> concat (s1 = hello + def)



  }

}
