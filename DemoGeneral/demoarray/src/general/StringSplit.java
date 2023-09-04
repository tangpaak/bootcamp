package general;

import java.util.Arrays;

public class StringSplit {



  public static void main(String[] args) {
    String s = "abc def xyz";

    for (String str : s.split(" ")) {
      System.out.println(str);
    }

    for (String str : s.split("\\s")) { // 咩野\\s??????? space??
      System.out.println(str);
    }


    String s2 = " abc      def  xyz pld";

    for (String str : s2.split("\\s+")) {// 一個或者多個space都會當為分隔既方式
      System.out.println(str);
    }

    //
      String s3 = "annabelle is coming to town";
    System.out.println(Arrays.toString(s3.split(" "))); //分隔佢變Array
    System.out.println((s3.split(" ").length)); // split(" ").length就會搵長度
    



  }

}
