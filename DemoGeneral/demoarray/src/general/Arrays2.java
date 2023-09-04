package general;
public class Arrays2 {


  public static void main(String[] args) {

    System.out.println((swap("123", 1, 2)));

  }

  public static String swap(String str, int idx1, int idx2) {
    // Swap two characters in the string (index1 and index2)
    // return the modified String
    if (str == null) {
      return null;
    }
    if (str.isBlank()) {
      return str;
    }
    if (idx1 < 0 || idx1 >= str.length()) {
      return str;
    }
    if (idx2 < 0 || idx2 >= str.length()) {
      return str;
    }


    char[] chars = str.toCharArray(); // ms
    char temp = chars[idx1];
    chars[idx1] = chars[idx2];
    chars[idx2] = temp;
    return String.valueOf(chars); // ms
  } 
  // str = "abcde";
  // int backupnum = 0;
  // backupnum = idx1;
  // idx1 = idx2;
  // idx2 = backupnum;
  // return str;



}
