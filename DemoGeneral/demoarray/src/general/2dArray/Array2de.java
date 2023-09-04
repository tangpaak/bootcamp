import java.util.Arrays;
import java.util.Random;

public class Array2de {

  int age;

  public static void main(String[] args) {
    int[] nums = new int[3];
    // int [] nums; -> declaration
    // new int [p3] - > initialization

    nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // re assignment

    int[][] matrix = new int[3][4]; // new int [row] [column]
    // 3 rows x 4 columns
    // 1, 2, 3, 10
    // 4, 5, 6, 7
    // 10, 2, 3, 1

    // Random a number and assign to an 2D array (0-12)
    // Nested loop
    // for (int i = 0; i < matrix.length)
    System.out.println(matrix.length); // 3
    System.out.println(matrix[0].length); // 4 (column length of row = 0)

    for (int i = 0; i < matrix.length; i++) {
      // 0, 1, 2
      // matrix[0] -> return int[]
      // matrix[0][2] -> Get the idx 2 from the array of the row 0
      for (int j = 0; j < matrix[0].length; j++) { // 用column [0]果行 直線拉落下面睇
        // 0, 1, 2, 3
        matrix[i][j] = new Random().nextInt(13);
      }
    }
    System.out.println(
        "Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));


    // Convert 2D array to 1D array
    int idx = 0;
    int[] arr = new int[matrix.length * matrix[0].length]; // row3 x column4 =12

    for (int i = 0; i < matrix.length; i++) { // 0,1,2 // row
      for (int j = 0; j < matrix[0].length; j++) { // 0,1,2,3 //colummn
        arr[idx++] = matrix[i][j];
      }
    }
    System.out.println("Convert 2D array to 1D array= " + Arrays.toString(arr));



    // Convert 2D array to a String
    String str = "";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        str += matrix[i][j];
      }
    }
    System.out.println("2D array to String = " + str);

    // 3D array
    int[][][] arr3d = new int[1][2][3];

    // 4D array
    int[][][][] arr4d = new int[1][2][3][4];

    // example of Array
    Array2de[][] Array2de = new Array2de[2][2];
    Array2de[0][0] = new Array2de();
    Array2de[0][1] = new Array2de();
    Array2de[1][0] = new Array2de();
    Array2de[1][1] = new Array2de();


    for (int i = 0; i < Array2de.length; i++) {
      for (int j = 0; i < Array2de[0].length; j++) {
        System.out.println(Array2de[i][j].age);

        // ????? out of bound?
        // 0, print age of each demo object
      }
    }

    // PiKachu, Charmander, Squirtle, Bulbasaur
    String[][] strings = new String[][] {{"比卡超", "小火龍"}, {"車理龜", "奇異種子"}};
    for (int i = 0; i < strings.length; i++) {
      for (int j = 0; i < strings[0].length; j++) {
        System.out.println(strings[i][j]);

      }
    }

  }


}
