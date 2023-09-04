package Class.order;

public class Order {

  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    // pass by reference
    this.transactions = transactions;

  }

  // getTotal() -> sum up subtotal
  public double getTotal() {

  //   double total = 0;
  //   for (int i =0; i < this.transactions.length; i++ ){

  //   total += this.transactions[i].subtotal(); //
  //   return total;
  //   }
  // }

    double total = 0;
    double subtotal = 0;
    for (int i = 0; i < transactions.length; i++) {
      subtotal = transactions[i].getQuantity() * transactions[i].getunitPrice();
      total = total + subtotal;
    }

    return total;
  }

  public double[] getsubTotal(Order order) {

    double[] subtotal = new double[transactions.length];
    for (int i = 0; i < transactions.length; i++) {
      subtotal[i] =
          transactions[i].getQuantity() * transactions[i].getunitPrice();
    }

    return subtotal;
  }




}
