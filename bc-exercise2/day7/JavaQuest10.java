import java.util.Arrays;
import java.util.Scanner;

// Input a Index Position: 3
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
// hints: 由尾數上黎

// Input a Index Position: 10
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
//
// Question:
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the inputted index is the last index + 1, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    int[] backup = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    int[] temp = new int [] {my_array.length};

  //方向1 -> 應該要backup左成組數字, 拍左新個index Position同newValue
  //再將後面既數字轉做backup果組數字

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    //my_array[i] = newValue <-我會固定左new value全部係120



for(int i = 0; i < my_array.length-1; i++){
if (i < indexPosition){

} 
else if (i == indexPosition){
my_array[i] = newValue;
my_array[i+1] = backup[i];
}

else if (i > indexPosition){
my_array[i+1] = backup[i];
}

  
}   

    // code here

    System.out.println("New Array: " + Arrays.toString(my_array));
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]

    // int set1 = my_array[1];
    // my_array[1] = my_array[1];

    // int set2 = my_array[2];
    // my_array[2] = set2;

    // int set3 = my_array[3];
    // my_array[3] = newValue; // new value

    // int set4 = my_array[4];
    // my_array[4] = set3;

    // int set5 = my_array[5];
    // my_array[5] = set4;

    // int set6 = my_array[6];
    // my_array[6] = set5;

    // int set7 = my_array[7];
    // my_array[7] = set6;

    // int set8 = my_array[8];
    // my_array[8] = set7;

    // int set9 = my_array[9];
    // my_array[9] = set8;


  }
}
