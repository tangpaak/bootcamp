package Review.Usefulcode;

import java.util.Arrays;

public class copy_array {
  
public static void main(String [] args){
  int [] arr = new int[] {'I', 'D', 'I', 'D'};
  int[] arr2 = Arrays.copyOf(arr, arr.length);
  char[] arr3 = new char[arr.length];
  for (int i = 0; i < arr.length; i++) {
      arr3[i] = (char) arr[i];
  }
  System.out.println(Arrays.toString(arr3));



}
}
