package general;
public class InvoiceV {
  // A method to calculate item total prices
  // return a double
  // Task 1: A method to calculate total prices for item
  public static double calcTotalItemPrice(int quantity, double unitPrice) { // 5 x 10.9, 10 x 100.3
    // Early Return
    // Parameters Control
    if (quantity < 0 || unitPrice < 0) {
      return 0;
    }
    double c = quantity * unitPrice; //main logic
    return c;
  }

  // Task2: A method to calculate total amount of the invoice
  public static double calcinvoiceTotalAmount(double[] totalItemPrices) {
    double total = 0.0d;
    for (int i = 0; i < totalItemPrices.length; ++i) {
      total = total + totalItemPrices[i];
    }

    return total;
  }


  public static void main(String[] args) {

    // Invoice: have price, quantity, row
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};

    double[] totalItemPrices = new double[unitPrices.length]; // [54.5, ...]
    // ?

    for (int i = 0; i < quantities.length; ++i) {
      totalItemPrices[i] = calcTotalItemPrice(quantities[i], unitPrices[i]);
      System.out.println(totalItemPrices[i]);
    }

    // Loop
    double invoiceTotalAmount = calcinvoiceTotalAmount(totalItemPrices);
    System.out.println(invoiceTotalAmount);



  }


}
