package String1;

public class ReversePrint {
  public static void main(String[] args) {
    System.out.println(finalString("string")); // rtsng
    System.out.println(finalString("poiinter")); // ponter
    System.out.println(finalString("applei")); // elppa

  }

  public static String finalString(String s) {
    StringBuilder sb = new StringBuilder();
    boolean reverse = false;

    for (char c : s.toCharArray()) { //s要轉做toCharArray先可以逐個行
        if (c == 'i') {
            reverse = !reverse; //有i就轉做true, 再撞i又變番false
 
        } else {
            if (reverse) { 
                sb.insert(0, c); //係0位置加番前面果組字
            } else {

                sb.append(c);
            }
        }
    }

    if (reverse) {
        sb.reverse();
    }

    return sb.toString();
}

}

