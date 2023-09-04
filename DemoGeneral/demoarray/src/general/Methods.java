package general;
public class Methods {

    // ** Method: Print
    public static void print() { // method name: print()
        System.out.println("Hello in print method.");
    }
    // Add a method of print

    // ** Method: Sum
    public static int sum(int a, int b) {
        // left int = return type
        // the int inside the bracket are parameters
        int c = a + b;
        return c; // return 係對應番int, 係呢個例子入面係int數字
    }

    // Method: substract
    public static int substract(int x, int y) {
        return x - y; // 公式可以直接放return後面, 即時計x - y, return result output
    }

    //
    public static void method2(String str) {
        if (str == null || str.equals("")) { // null is not empty, empty ->""
            return;
        }
        System.out.print("string=" + str + " " + "\n"); //main logic
    }

    public static double pi() {
        return 3.1415962;
    }

    public static void main(String[] args) { // ** Method name: main(), String array
        String str = "hello";
        str = str + "world"; // append operation

        // ** Appoach 1
        System.out.println("Hello in print() method.");
        // Appoach 2: by method
        print(); // print "Hello in print() method."

        // Approach 1
        int x = 10;
        int y = 100;
        int m = x + y; // m = 110

        // Approach 2
        int z = sum(x, y); // z = 110
        int i = sum(1000, -30); // i = 970
        if (sum(1000, -30) == 970) {
            System.out.println("the sum is 970.");
        }
        System.out.println("m=" + m + "z=" + z + "\n" + "i=" + i);

        // method2
        method2("hello");
        method2("world");
        method2("");

        double circleArea = 5 * 5 * pi();
        System.out.println("circle area=" + circleArea);



    }
}
