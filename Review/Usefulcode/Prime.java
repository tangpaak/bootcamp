package Review.Usefulcode;

public class Prime {

  public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}


  public static void main (String [] args){
System.out.println(isPrime(2)); //true
System.out.println(isPrime(4)); //false
System.out.println(isPrime(5)); //true
System.out.println(isPrime(15)); //false
System.out.println(isPrime(17)); //true

int counter = 10;
for ( byte i = 0 ; i <128; i --){
counter++;
}

System.out.println(counter);


  }
}
