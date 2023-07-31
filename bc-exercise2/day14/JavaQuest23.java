

/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, // and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). // Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?

public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    StringBuilder originalstr = new StringBuilder(s);

    StringBuilder str1 = new StringBuilder("");
    StringBuilder str2 = new StringBuilder("");

    int halflength = originalstr.length() / 2;
    int fulllength = originalstr.length();

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < halflength; i++) {
      str1.append(originalstr.charAt(i));
      if(originalstr.charAt(i) == 'a' || originalstr.charAt(i) == 'e' || originalstr.charAt(i) == 'i'|| originalstr.charAt(i) == 'o' ||originalstr.charAt(i) == 'u' ){
      count1++;
    }
    }

    for (int j = halflength; j < fulllength; j++) {
      str2.append(originalstr.charAt(j));
      if(originalstr.charAt(j) == 'a' || originalstr.charAt(j) == 'e' || originalstr.charAt(j) == 'i'|| originalstr.charAt(j) == 'o' ||originalstr.charAt(j) == 'u' ){
      count2++;
    }
    }

if (count1 == count2){
    return true;
  } 
  else { return false;
  }
    

  }
}
