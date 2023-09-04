package general;
public class Invoice {
//A method to calculate item total prices
//return a double
//Task 1: A method to calculate total prices for item
public static double calcTotalItemPrice(int quatity, double unitPrice) { // 5 x 10.9, 10 x 100.3
double c = quatity * unitPrice;
return c;
}

//Task2: A method to calculate total amount of the invoice
public static double calcinvoiceTotalAmount(double TotalPriceItems1, double TotalPriceItems2){
  double d = TotalPriceItems1 + TotalPriceItems2;
  return d;
}


  public static void main(String[] args) {

// Invoice: have price, quantity, row
int[] quantities = new int [] {5, 10, 4, 7, 20};
double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};

for (int i = 0; i < quantities.length; ++i) {
  double TotalPriceItems = calcTotalItemPrice (quantities[i], unitPrices[i]);
  System.out.println(TotalPriceItems);
} 

//Loop
double Total = 0;

for (int i = 0; i < quantities.length; ++i) {

 double TotalPriceItems = calcTotalItemPrice (quantities[i], unitPrices[i]);
 Total = Total + TotalPriceItems;
} System.out.println(Total);











  }


}
