package Review.Usefulcode;

public class StartMiddleEnd {

  public static void main(String[] args) {
    int pd = 1;
    int[] arr = new int[] {};

    if (arr.length > 0) {
      for (int i = 0; i < arr.length; i++) {
        if (i == 0) {
          pd = arr[i];
        }
        if (i != arr.length - 1) {
          pd = pd * arr[i + 1];
          // System.out.println("pd= " + pd);
          // System.out.println("arr[i]=" + arr[i]);
          // System.out.println("arr[i+1]=" + arr[i + 1]);
        } else if (i == arr.length) {
          pd = pd * arr.length - i - 1;
        }
        // System.out.println(arr[i]);
      }


    }

  }
}
