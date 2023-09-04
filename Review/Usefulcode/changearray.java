

public class changearray {

  public static int minimum35Number(int num) {

    String str = String.valueOf(num); // 將num轉左做String先
    char[] chars = str.toCharArray();// 再將String轉做Array

    int count = 0; // 用於限制2次數目

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '5' && count < 2) {
        chars[i] = '3';
        System.out.println(chars[i]);
        count++;
      } else if (chars[i] == '3') {
      
      }

    }
    String res = String.valueOf(chars); // 將chars轉番做String先

    int result = Integer.valueOf(res); // 再將String轉做Int [Integer.valueof()]
    return result;
  }


  public static void main (String [] args){

    System.out.println(minimum35Number(3553)); 
  }


}
