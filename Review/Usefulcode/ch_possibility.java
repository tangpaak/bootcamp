public class ch_possibility {
  

    public static boolean isThreePossibility(int n) {
      int count = 0;
      for (int i = 1; i <= n; i++) {
          if (n % i == 0) {
              count++;
          }
          if (count > 3) {
              return false;
          }
      }
      return count == 3;
  }

  public static void main(String[] args) {
    System.out.println(isThreePossibility(1)); // false 1/1
    System.out.println(isThreePossibility(3)); // false 3/1, 3/3
    System.out.println(isThreePossibility(4)); // true, 4/1, 4/2, 4/4
    System.out.println(isThreePossibility(12)); // false 12/1, 12/2, 12/4, 12/6
    System.out.println(isThreePossibility(9999)); // false
    System.out.println(isThreePossibility(9)); // true, 9/1, 9/3, 9/9
    System.out.println(isThreePossibility(25)); //true, 25/1, 25/5, 25/25
    System.out.println(isThreePossibility(49)); //true
    System.out.println(isThreePossibility(81));


  }

}
