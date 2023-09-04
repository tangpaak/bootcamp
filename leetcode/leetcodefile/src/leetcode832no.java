// 832. Flipping an Image

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].


// Example 1:

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
// Example 2:

// Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
// Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
// Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


// Constraints:

// n == image.length
// n == image[i].length
// 1 <= n <= 20
// images[i][j] is either 0 or 1.

class leetcode832no {
  // public static int[][] flipAndInvertImage(int[][] image) {



    

  // }


  // public static void flip(int[] row) {

  //   for (int i = 0; i < row.length; i++) {
  //     if (row[i] == 1) {
  //       row[i] = 0;
  //     } else {
  //       row[i] = 1;

  //     }

  //   }


  // }

  // public static void invert(int[] row) {

  //   for (int i = 0; i < row.length; i++) {
  //     int temp = row[i];
  //     row[i] = row[row.length - i - 1];
  //     row[row.length - i - 1] = temp;

  //   }

  // }



  // public static void main(String[] args) {

  // }

  public static int[][] flipAndInvertImage(int[][] image) {
    int n = image.length;
    for (int i = 0; i < n; i++) {
      int left = 0;
      int right = n - 1;
      while (left <= right) {
        int temp = image[i][left] ^ 1;
        image[i][left] = image[i][right] ^ 1;
        image[i][right] = temp;
        left++;
        right--;
      }
    }
    return image;
  }

  public static void main(String[] args) {
    int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] result = flipAndInvertImage(image);
    
    for (int[] row : result) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }


}
