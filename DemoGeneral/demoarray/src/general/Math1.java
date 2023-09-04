package general;
import java.util.Arrays;

public class Math1 {


public static void main ( String [] args){
// Math round四捨五入

System.out.println(Math.round(5.4)); // result 5
System.out.println(Math.round(5.5)); // result 6
System.out.println(Math.round(5.44)); // result 5
System.out.println(Math.round(5.45)); //  reult 5

// Math 次方
System.out.println(Math.pow(5, 4)); //  result 625


// Math Square開方
System.out.println(Math.sqrt(25)); // result 5.0

// Random

Math.random(); //0.0 - 1.0 零同一之間, 但你要set個數比佢


// Math log
// log10 -> 1, 10既1次方係1
// log1000 -> 3
// logt 8 -> 3
double number = 2.0;
double naturalLog = Math.log(number);
System.out.println("naturalLog=" + naturalLog);

// Example of Math.abs() <- absolute value 絕對值
int[] nums = new int [] {-100, 100, 90, 50 };
// -100 -> 100
// 100 + 100 + 90 + 50
int sum = 0;
for (int i = 0; i < nums.length; i ++){
  sum += Math.abs(nums[i]);
} 
System.out.println(sum);

// example of round + absolute
double [] arr = new double [] {-5.64, 5.23, 9.800, 6.55};
double total = 0;
for (int i = 0; i < arr.length; i++){
 total += Math.round(Math.abs(arr[i]));
}
System.out.println("total = " + total);

//example of pow 次方
int cubeLength = 2;
double volume = Math.pow(cubeLength, 3);
System.out.println(volume); // result: 8

// *** Example of array 乘次方 (  兩條)
int [] bases = new int [] {2, 3, 4, 5};
int [] index = new int [] {3, 4, 5, 6};
int [] result = new int [bases.length];

for ( int i = 0; i < bases.length; i++){
result[i] = (int) Math.pow(bases[i], index[i]);

} System.out.println(Arrays.toString(result));





}

  
}
