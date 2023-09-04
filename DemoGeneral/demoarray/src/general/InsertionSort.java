package general;
import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    // [ 5, 1, 4, 2, 8]
    // Step 1.1: [ 5, 1, 4, 2, 8] (insert 1 to arr[0], 1 < 5)
    // Step 2.1: [ 1, 5, 4, 2, 8] (1同5已經sort好, 所以係round2, Compare 4<5)
    // Step 2.2: [ 1, 4, 5, 2, 8] (Compare 1 < 4 -> [1,4,5])
    // Step 2.3: [ 1, 4, 5, 2, 8] after round 2, ([1,4,5]) is sorted
    // ...
    //

    int[] arr = new int[] {5, 1, 4, 2, 8};

    for (int i = 1; i < arr.length; ++i) {
      System.out.println("i time=" + i);
      int temp = arr[i]; // temp會成為arr[1]
      int j = i - 1; // j轉為0

      System.out.println(Arrays.toString(arr));
      // 一路向前search
      // 找到第一個數比原本數細, 將新數插入原本位置

      while (j >= 0 && arr[j] > temp) { //j大過或等於0, arr[0]大過arr[1]
        System.out.println("j time=" +i+"."+ j);
        arr[j + 1] = arr[j];
        j = j - 1;
        
      }
      arr[j + 1] = temp;

      System.out.println(Arrays.toString(arr));

    }
    System.out.println(Arrays.toString(arr));



  }
}
