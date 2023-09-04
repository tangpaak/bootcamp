package Review.Usefulcode;

public class maxmin {
  public static void main(String[] args) {
    int[] arr = new int[] {};
    int max = 0;
    int min = 1000;

    for (int num : arr) {
      if (num != 0) {
        if (num > max)
          max = num;
        if (num < min)
          min = num;

      }
    }


  }
}
