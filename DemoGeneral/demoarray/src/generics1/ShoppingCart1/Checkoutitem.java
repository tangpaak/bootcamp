package generics1.ShoppingCart1;

public class Checkoutitem extends Item {

  private int quantity;


  public Checkoutitem(int quantity, int price){
    this.quantity = quantity;

  }

  public int getQuantity() {
    return this.quantity;
  }


}
