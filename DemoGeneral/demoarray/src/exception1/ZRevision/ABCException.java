public class ABCException  extends RuntimeException {
// 1. 意味住係runtime
// 2. by Zero
// 3. Null Pointer
// 4. Array Size
// 5. ConcurrentModification - loop住個map做d add同del既動作
// 6. Runtime係唔應該寫既其實, 因為無野可以做, catch唔到野




public ABCException (){
super("abc exception");
}



public static void main(String[] args) {
  int a = 10/0;


}


  
}
