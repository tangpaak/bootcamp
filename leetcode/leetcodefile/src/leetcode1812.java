public class leetcode1812{

  public static boolean isWhiteSquare(String coordinates) {
    char letter = coordinates.charAt(0);
    int number = Integer.parseInt(coordinates.substring(1));

    // Check if the letter coordinate is an even or odd index
    if (letter % 2 == 1) {
        return number % 2 == 0;
    } else {
        return number % 2 != 0;
    }
}

public static void main(String[] args) {
    System.out.println(isWhiteSquare("a1"));  // Output: false
    System.out.println(isWhiteSquare("h3"));  // Output: true
    System.out.println(isWhiteSquare("c7"));  // Output: false
}


}