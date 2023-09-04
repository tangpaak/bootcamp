import java.util.Arrays;

public class leetcode942no {
//no main method

  public static int[] diStringMatch(String s) { //method, given String s 
    //s contains 'I' or 'D' only
    //1 <= length <= 100000 -> "I"
    //如果個s佢無寫最細, 即最少可能係""

//Example 1:
// I: 0 -> 4
// D: 4 -> 1
// I: 1 -> 3
// D: 3 -> 2
// [0, 4, 1, 3, 2]
// [0, 3, 2, 4, 1]

//Example 2: "III"
// [0, 1, 2, 3]

//Example 3: "DDI"
// [2, 1, 0, 3]

// Example 1:
//     I  D  I  D
// [0. 4, 1, 3, 2]


int [] arr = new int[] {'I', 'D', 'I', 'D'};
int count = 0;
int count2 = 0;
int length = s.length();

for ( int i = 0; i < s.length(); i++){
if (s.charAt(i) == 'I'){

arr[i] = length-1;
count2 = count2--;


} else if (s.charAt(i) == 'D'){

  arr[i] = i;
  count = count++;

}



}

        return arr;
  }

public static void main(String[] args){


System.out.println(Arrays.toString(diStringMatch("IDID")));

int [] arr = new int[] {'I', 'D', 'I', 'D'};
int[] arr2 = Arrays.copyOf(arr, arr.length);
char[] arr3 = new char[arr.length];
for (int i = 0; i < arr.length; i++) {
    arr3[i] = (char) arr[i];
}
System.out.println(Arrays.toString(arr3));

}


  
}
