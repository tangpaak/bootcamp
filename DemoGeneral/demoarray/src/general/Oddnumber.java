package general;
public class Oddnumber {
  public static void main(String []args ){

    int sum = 0;
    for (int i = 0; i < 10; i++) {// 0 1 2 3... 9 -> run 10 times
        if (i % 2 == 1) { // 餘數＝1，即為單數，if就可以做 (條件)
        // 第二次執行,1除2=0.5, 餘數都係1,所以第1次運算都會有餘數1
            sum += i; // 
        }
        System.out.println("sum= "+ sum);

}
// sum = 0, i = 0, print sum = 0
// sum = 1, i = 1, print sum = 1
// sum = 2, i = 2, not print
// sum = 3, 



}
}