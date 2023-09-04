public class leetV2000 {

  // Tips:
  // 1. check if ch exists?
  // 2. lowercase only. word length() >=1
  // 3.

  public static String reversePrefix(String word, char ch) {
        
    // 1. check if ch exists?
      int idx = word.indexOf(ch);
      if (idx == -1) {
        return word;
      }
    // 2. lowercase only. word length() >=1
    // idx
    char[] arr = word.toCharArray(); //slow
    char temp;

    int strLength = idx + 1;

    for (int i = 0; i < strLength ;i++){
  // 1, 2, 3, 4, 5 // > length / 2-1
  // 1, 2, 3, 4, 5, 6 // > length / 2-1
  
  if (i > strLength / 2 - 1) {// 1 2 3 4 5要除2-1, 因為係單數 如果除2就係4 （四捨五入）, 所以要減1, 攞番3出黎
  System.out.println("strLength/2-1 =" + (strLength/2-1));
  break;
  }
  //swap
  temp = arr[i];
  arr[i] = arr[strLength -1 -i];
  arr[strLength -1 -i] = temp;
    } 
    return String.valueOf(arr);
      }
    




      public static void main(String[] args) {

        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    
      }





}


