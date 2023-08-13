

//
// Given a 0-indexed string s, repeatedly perform the following operation any number of times:
//
// Choose an index i in the string, and let c be the character in position i.
// Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
// Your task is to minimize the length of s by performing the above operation any number of times.
//
// Return an integer denoting the length of the minimized string.
//

import java.util.ArrayList;
import java.util.List;

public class JavaQuest31 {
  public static void main(String[] args) {
    // System.out.println(minStringLength("null"));// output : 3, delete l
    // System.out.println(minStringLength("aaa"));// output : 1, delete a on left and right
    System.out.println(minStringLength("abcabcabc"));// output : 3,
    // System.out.println(minStringLength("bbccdd"));// output : 3, delete b, c, d
    // System.out.println(minStringLength("helloworld"));// output : 7
  }

  public static int minStringLength(String s) {
    // code here
    List<Character> remainingChars = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) { //創造新Array
        char c = s.charAt(i);
        System.out.println(remainingChars);
        if (remainingChars.contains(c)) {
            int leftIndex = -1;
            int rightIndex = -1;

            for (int j = remainingChars.size() - 1; j >= 0; j--) {
                if (remainingChars.get(j) == c) {

                    leftIndex = j;
                    System.out.println(leftIndex);
                    break;
                }
            }

            for (int j = leftIndex + 1; j < remainingChars.size(); j++) {
                if (remainingChars.get(j) == c) {
                    rightIndex = j;
                    System.out.println(rightIndex);
                    break;
                }
            }

            if (leftIndex >= 0 && rightIndex >= 0) {
                remainingChars.remove(rightIndex);
                remainingChars.remove(leftIndex);
            }
        } else {
            remainingChars.add(c);
        }
    }

    return remainingChars.size();
}
}


