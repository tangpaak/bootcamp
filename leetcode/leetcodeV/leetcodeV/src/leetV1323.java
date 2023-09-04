public class leetV1323 {

    public static int evenNumber(int num) {
      // int -> String
  
  int i = num; 
  int divide = 1;
  
  while (i > 0 ) {
      i /=10; // 9669 -> 966 -> 96 -> 9.6
      divide *=10;
  } //1000
  
  // 6669 / 1000 ->6 , 6669 + 3 *1000
  
  i = num;
  while (divide >0){
      if (i /divide ==6){
          num += divide * 3;
          return num;
      }
  i = i -divide * (i / divide);
  divide /= 10;
  
  
  
  } return num;
  }
  
  public static void main(String[] args) {
  
    System.out.println(evenNumber(9669));
    System.out.println(evenNumber(9996));
    System.out.println(evenNumber(9999));
  
  }
  
  }