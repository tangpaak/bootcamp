package general;
public class ReverseString {
  public static void main(String[] args){
String str = "hello";
String reversestr = "";
//output olleh
//str.charAt()
//index
for (int i = str.length()-1; i>=-0; i--){
  reversestr += str.charAt(i);

}System.out.println(reversestr);




  }


}
