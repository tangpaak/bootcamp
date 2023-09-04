package general;
import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    // [ 5, 1, 4, 2, 8] //用nested loop去做

    // Step 1.1: [1, 5, 4, 8, 2]
    // Step 1.2: [1, 4, 5, 8, 2]
    // Step 1.3: [1, 4, 5, 8, 2] (No swap, due to 5 < 8)
    // Step 1.4: [1, 4, 5, 2, 8]
    // Step 2.1: [1, 4, 5, 2, 8] (No swap, due to 1 < 4) //Round2只係處理後面4個數字
    // Step 2.2: [1, 4, 5, 2, 8] (No swap, due to 4 < 5)
    // Step 2.3: [1, 4, 2, 5, 8]
    // ...

    // target: [1, 2, 4, 5, 8]

    // 只係用同一數列去改, 加一個backupnum = 0比自己去copy數字先
    // 之後再用nested loop 逐步行番去順序

    int[] arr = new int[] {5, 1, 4, 2, 8};

    int temp = 0;

    for (int i = 0; i < arr.length; i++) { // Set 4 round to search , 行0,1,2,3 round
      System.out.println("i time=" + i);
      System.out.println(Arrays.toString(arr));
      for (int j = 0; j < arr.length - i - 1; j++) { // arr.length - i - 1
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          System.out.println("j time=" + j);
          System.out.println(Arrays.toString(arr));
          System.out.println("\n");
        }

      }

    }

    System.out.println(Arrays.toString(arr));



  }

  public static int[] sort(int[] arr) {
    int temp = 0;

    for (int i = 0; i < 2; i++) { // Set 4 round to search , 行0,1,2,3 round

      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }

      }

    }
    return arr;
  }



}
