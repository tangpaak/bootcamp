import java.lang.Math;

public class UsefulMath {
  
  public static void main(String[] args) {
    // 計數字既長度
    int num1 = 121;
    int numDigits = (int) (Math.log10(num1) + 1);
    System.out.println("numDigits = " + numDigits);
    
    //放數字入array
    int num =999;
    int numlength = 10;
    int[] arr = new int[numlength];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = num % 10; //餘數就會係最後果個位
      System.out.println("arr[i]= " + arr[i]);
      num /= 10; //除10搵下個位
      System.out.println("num= " + num);
    }
}

//轉int做str, 轉str做int
String strnum = Integer.toString(divide) + Integer.toString(leftnum);
int tempnum = Integer.parseInt(strnum);
}




