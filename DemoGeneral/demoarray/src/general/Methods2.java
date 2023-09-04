package general;
import java.util.Arrays;

public class Methods2 {

  public static int[] products(int[] arr){
    // {2, 20, 30, 12, 80, 20}
    // 第一粒乘第二粒就override第一粒數據
    int backup = 0;
    for (int i = 0; i < arr.length-1 ; i++){
    arr[i] = productToMultiple(arr[i], arr[i+1]);
    } 
      return arr ;
    } 
    
    
      public static int productToMultiple(int a, int b) {
        return a * b;
      }

  public static void main(String[] args) {
int [] nums = new int [] {1, 2, 10, 3, 4, 20};
int [] ans =  products(nums);
System.out.println(Arrays.toString(ans));

int [] nums1 = new int [] {2, 20, 30, 12, 80, 20};
int [] ans1 =  products(nums1);
System.out.println(Arrays.toString(ans1));

  }




}
