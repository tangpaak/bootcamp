package general;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        // basic for-loop
        for (int i = 0; i < 3; i++) {
            System.out.println("basic for-loop: hello");
        }

        // *** for-each ***
        // 佢會loop哂所有野, 能夠skip某個element, 或部份既element
        // for ( Type Elemenet: Dataset)

        // Difference of for-each:
        // 1. for-each do not have stop condition. /counter in loop signature
        // 2.

        int[] arr = new int[] {1, 2, 3, 4};
        // ** for (Type Element: Dataset)
        for (int x : arr) { // loop through all element
            System.out.println("for-each: hello, x=" + x);
            System.out.println(arr[0]); // but you still access element by index
            // modification
            arr[0] = 8;
        }
        // 第一次print arr[0]仲係1
        // 第二次print arr[0]變左係8, 之後loop print每次都只會出8


        // ** counter
        for (int i = 0; i < arr.length; i++) {
            System.out.println("for-each: hello");
            System.out.println(arr[0]);
            arr[0] = 9;
        }
        // * counter example of 金字塔
        int[] arr2 = new int[] {1, 4, 10, 13, 20, 0};
        // 1,0
        // 4, 20
        // 10,13
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("for-each: hello");
            System.out.println("" + arr2[i] + "," + arr2[arr2.length - i - 1]);
            // arr[0] = 9;
        }


        // String exmaple of for-each
        String[] strs = new String[] {"hello", "world"};
        for (String y : strs) {
            System.out.println("for-each: hello, y=" + y);
            System.out.println(strs[0]);
        }


        // Integer, Character (Wrpper Class)
        Character[] chars = new Character[] {'L', 'a', '!', '('};
        for (Character c : chars) {
            System.out.println(c);
        }

        // **** split example:

        // String s2 = "hello world ! I am Vincent";
        // String[] strings = s2.split(" "); // Use " " to split the String s2
        // for (String s : strings){
        // System.out.println(s);
        // }

        //
        // Without using split, use a for loop to split s2
        // Output: String[]
        // 1. substring()
        // 2. toCharArray()
        String s2 = "hello world ! I am Vincent";
        char[] arr3 = s2.toCharArray();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (arr3[i] == ' ') {
                System.out.print("\n");
            }
        }
        System.out.println("");

        // Appoach 1: substring()
        // Count Spaces
        s2 = "  hello world ! I am Vincent   "; // 加空格在前面後面

        int spaceCount = 0;
        String str = s2.trim(); // 去除中間的空格先
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }


        int startIdx = 0;
        int Idx = 0;
        String[] result = new String[spaceCount + 1];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result[Idx] = str.substring(startIdx, i);
                Idx++; // 每次遇到space既時候就去換行下一格
                startIdx = i + 1;
            } else if (i == str.length() - 1) { // last character
                result[Idx] = str.substring(startIdx, str.length());
            }

        }
        System.out.println(Arrays.toString(result));



    }



}

