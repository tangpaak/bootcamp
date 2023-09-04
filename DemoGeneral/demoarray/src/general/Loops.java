package general;
public class Loops {
    public static void main(String[] args) {
        // For Loop, using to loop counting on JAVA
        int a = 0;
        ++a;
        a++;

        for (int i = 0; i < 4; ++i) {
            System.out.println("i=" + i + ", Hello");
            // logic flow:
            // i = 0 -> 0 < 4, print 1st hello
            // ++i > i = 1 -> 1 < 4, print 2nd Hello
            // ++i > i = 2 -> 2 < 4, print 3rd Hello
            // ++i > i = 3 -> 3 < 4, print 4th Hello
            // ++i > i = 4 -> 4 is NOT smaller than 4, exit loop
        }
        // not good to write in below using 1 at start
        // for (int i = 1, i <=4; ++i){
        // System.out.println("i="+i);
        // }
        // it's good to learn use 0 at start

        // example of using -
        for (int q = 0; q >= -2; q--) {
            System.out.println("q=" + q);
        }
        // q = 0, print out 1st q = 0
        // q = -1, print out 2nd q = -1
        // q = -2, print out 3rd q = -2
        // q = -3, not print out, exit loop

        // example of using *
        for (int u = 1; u < 10; u = u * 2) {
            System.out.println("u=" + u);
            // u = 1, print out 1st u=1
            // u = 2, print out 2nd u=2
            // u = 4, print out 3rd u=4
            // u = 8, print out 4rd u=8
            // u = 16, not print out anything, exit loop
        }

        // example of using /
        for (double w = 10; w > 1; w = w / 2) {
            System.out.println("w=" + w);
        }
        // w = 10, print out w=10
        // w = 5, print out w=5
        // w = 2.5, print out w=2.5
        // w = 1.25, print out w=1.25
        // w = 0.75, not print out, exit loop

        // example of Two Variable
        int x = 2;
        for (int e = 0; e < 3; e++) {
            System.out.println(x + " ");
            x = x * 2;
        }
        // e = 0, print x = 2
        // e = 1, print x = 4
        // e = 2, print x = 8
        // e = 3, e < 3, not print, exit loop

        int max = 10;
        int count = 0;
        for (int i = 0; i < max; ++i) {
            count += i; // 0,1 ... 9
            System.out.println(i + " " + count);

        } // count = 45
          // i = 0, count = 2
          // i = 1, count = 3
          // i = 2, count = 3
          // 4
          // 5

        //
        int sum = 0;
        int sumoddnumwithout5 = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
            if (i % 2 == 1 && i != 5) {
                sumoddnumwithout5 += i;
                System.out
                        .println("sumoddnumberwithout5= " + sumoddnumwithout5);
            }



            // sum = 25
            // sumOddNumWithout5 = 20
            // odd numbers
            // sum = ?
        }

        //
        int sum1 = 0;
        for (int r = 1; r < 10; r = r + 2) {
            sum1 += r;
            System.out.println("Sum1=" + sum1);

        }
        //
        for (int i = 0; i < 5; ++i) {
            System.out.println("hello");
            // run here first, i=3, as i<5, so still run "hello"
            if (i > 2) {
                break;
            } // here as i=3, run "break", exit loop
        }
        // i = 0, hello
        // i = 1, hello
        // i = 2, hello
        // i = 3, hello
        // break;

        // continue
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello!");
            if (i > 3) {
                continue;// go to the next iteration
            }
            System.out.println("Bye!");
        }
        // i = 0, hello, i<3, bye
        // i = 1, hello, i<3, bye
        // i = 2, hello, i<3, bye
        // i = 3, hello, i<3, bye
        // i = 4, hello, i>3,
        // i = 5, hello, i>3,
        // i = 6, exit loop

        //
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("i=" + i);
                if (i % 3 == 0) {
                    System.out.println("hello");

                }
            }
            // if (i%3 ==0){
            // System.out.println ("i="+1);
            // System.out.println ("hello");
            // }
        }

        // Nested Loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Hello");
            }
        }
        // how many hello?
        // i = 0, j =0, hello
        // i = 0, j =1, hello   
        // i = 0, j =2, hello
        // i = 0, j =3, exit 
        // i = 1, j =0, hello 
        // i = 1, j =1, hello
        // i = 1, j =2, hello
        // i = 1, j =3, exit 
        // i = 2, j =0, hello
        // i = 2, j =1, hello
        // i = 2, j =2, hello
        // i = 2, j =3, exit 
        // i = 3, j =0, hello
        // i = 3, j =1, hello
        // i = 3, j =2, hello
        // i = 3, j =3, exit 

        //nested loop通常係用於由小至大排位用既

// *
// **
// ***
// ****
// *****
// System.out.println(); -> nextline after print out
// System.out.print(); -> continue after print out, no nextline

// s1=0, s2=1, print * , next line
// s1=0, s2=2, print *, 
for (int star2 = 0; star2 <5; star2++){
    String printstar = "";
    for (int star3 = 0; star3<5; star3++)
        if (star3<=star2){
            printstar += "*";
        }
    
System.out.println(printstar);

        }
        
//approach 1:Nested loop
//System.out.println() & System.out.print()
for (int i = 0; i < 5 ; i++){
    for (int j =0 ; j<5; j++){
        System.out.print("*");
        System.out.println("");
    }
}
//Approach 2: Single Loop & String
// System.out.println()
String str = "";
for (int i =0; i <5; i++);{
    str += "*";
    System.out.println (str);

}
//Approach 3: Nested Loop & String
//System.out.println()
str = "";
for (int i =0; i <5; i++){
    str = "";
    for (int j=0; j<5; j++){
        
    }
}






    }
    
}




                        
                    



// No condition

//




