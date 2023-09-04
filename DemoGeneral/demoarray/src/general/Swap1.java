package general;
import java.util.Arrays;

public class Swap1 {
// Vincent method 1
  public static String swapOddEvenCharacterV (String str){
    char[] chars = str.toCharArray();
    char temp;
    for (int i = 0; i < chars.length -1; ++i){
if (i % 2 ==0) {
temp = chars[i];
chars[i] = chars[i+1];
chars[i+1] = temp;

}      
    }
    return String.valueOf(chars);
  }


  // print all elements
  // // ** Swap
  public static String SwapOddEvenCharacter(String str) {


    char[] arr = str.toCharArray(); // abcd > badc abc -> bac

    for (int i = 0; i < arr.length; i++) { // 0,1,2,3
      char set = ' ';

      if (i % 2 == 1) { // 0,2,4,6
        set = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = set;
      } 
    }
    String test2 = new String(arr); // b,a,d,c -> "badc"
    return test2;
  }



  public static void main(String[] args) {

    int[] arr = new int[] {100, -400, 3, 99};
    // code here ... to swap 100 and 99
    int setnum = 0;

    setnum = arr[0];// back up左先
    arr[0] = arr[3];// 數字1代替 100 to 99
    arr[3] = setnum;// 數字3代揩 99 to setnum
    System.out.println(Arrays.toString(arr));
    // 調位，將數字放係一個未set既variable 入面, 再將原本d數再取代,最尾將改左既數用空左出黎個數字代替

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]=" + arr[i]);
    }


    // return;
    // }
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    // abcdef -> badcfe
    // abc -> bac
    // c -> c



    // }
    // 方法1 hello! -> ehll!o
    // String str2 = "hello!";
    // char ch = ' ';
    // char[] arr2 = str2.toCharArray();
    // ch = arr2[0]; // swap h and e
    // arr2[0] = arr2[1];
    // arr2[1] = ch;

    // ch = arr2[4]; // swap o and !
    // arr2[4] = arr2[5];
    // arr2[5] = ch;
    // System.out.println(Arrays.toString(arr2)); // out put is ehll!o

    // 方法2 用method做 (abcd -> badc)
    String str2 = "hello!";
    System.out.println(SwapOddEvenCharacter(str2));
    String str3 = "abcd";
    System.out.println(SwapOddEvenCharacter(str3));
    String str4 = "aabb";
    System.out.println(SwapOddEvenCharacter(str4));
    String str5 = "abcdef";
    System.out.println(SwapOddEvenCharacter(str5));
    String str6 = "abc";
    System.out.println(SwapOddEvenCharacter(str6));
    String str7 = "c";
    System.out.println(SwapOddEvenCharacter(str7));



  }
}
