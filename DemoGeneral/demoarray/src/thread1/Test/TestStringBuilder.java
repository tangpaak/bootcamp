package Test;

public class TestStringBuilder {




public static void main(String[] args) {
  
StringBuilder sb = new StringBuilder("");
//sbuilder (reference) -> object (StringBuilder Object) -> object(array)

Runnable appendS = () -> {
  for (int i = 0; i < 100000; i++) {
  sb.append("s") 
;
  }
};

Thread thread1 = new Thread(appendS);
Thread thread2 = new Thread(appendS);

thread1.start(); 
thread2.start(); 

try {
  thread1.join(); 
  thread2.join(); 

} catch (InterruptedException e) {

}
System.out.println(sb.length());




}

}




  
