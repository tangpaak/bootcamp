public class leetV1768 {

  public static String mergeAlternately(String word1, String word2) {

    if (word1 == null || word2 == null) {

    } // **防止word1 word2係無野

    int n = word1.length() > word2.length() ? word1.length() : word2.length();
    StringBuilder s = new StringBuilder();

    for (int i = 0; i < n; i++) {

      if (i < word1.length())
        s.append(word1.charAt(i));
      if (i < word2.length())
        s.append(word2.charAt(i));

      // word1: aaa a
      // word2: bbb

      // word1: aaa
      // word2: bbb b


    }
    return s.toString();

  }

  public static void main(String[] args) {

    String word1 = "abc";
    String word2 = "pqr";
    System.out.println(mergeAlternately(word1, word2));

    word1 = "ab";
    word2 = "pqrs";
    System.out.println(mergeAlternately(word1, word2));

  }



}
