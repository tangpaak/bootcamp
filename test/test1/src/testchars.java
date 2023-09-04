public class testchars {
  
  public static void main(String[] args) {
    
String str = "1234567";
int idx1 = 2;
int idx2 = 3;

  char[] chars = str.toCharArray(); // ms
  char temp = chars[idx1];
  chars[idx1] = chars[idx2];
  chars[idx2] = temp;

  System.out.println (String.valueOf(chars));
  System.out.println (chars);
  System.out.println (str); // need ask oscar what is the difference of these?

}
}
