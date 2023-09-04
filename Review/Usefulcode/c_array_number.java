import java.util.Arrays;

public class c_array_number {

  public static int arraynumber(int n) {
    // code here
    String str = String.valueOf(n);
    int[] arr = new int[str.length()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Character.getNumericValue(str.charAt(i));
      System.out.println(Arrays.toString(arr));
    }
    return n;
  }

    public static void main(String[] args) {

      System.out.println(arraynumber(4568));
    }
  
}
