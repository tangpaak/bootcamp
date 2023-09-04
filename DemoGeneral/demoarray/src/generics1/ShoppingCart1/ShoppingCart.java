package generics1.ShoppingCart1;

import java.util.ArrayList;

public class ShoppingCart{

  private ArrayList<Checkoutitem> items;

  public ShoppingCart(){
    items = new ArrayList<>();
  }

  public int totalAmount(){
    int sum =0;
    for ( Checkoutitem item: this.items){
      sum+= Math.max(0,item.getPrice()) * Math.max(0, item.getQuantity());
      
    }
    return sum;
  }

  public void add(int quantity, DisplayItem displayItem){ // 限制只放Food
   
  Checkoutitem checkoutitem = new Checkoutitem (quantity, displayItem.getPrice());
  items.add(checkoutitem);
  }

  public boolean remove(Checkoutitem item){
    return items.remove(item);
  }

  public void clear(){
    this.items.clear();
  }

  //連環封鎖緊d野
  //你要放到野入ArrayList就要extends一d野
  //好似你呢個example咁 就extends food先放到野
  //

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart ();
    // cart.add(new Rice());
    // cart.add(new Food()); // Food is abstract
    // ShoppingCart<Drink> cart2 = new ShoppingCart <>();
    // ShoppingCart<Food> cart3 = new ShoppingCart <>();
    // ShoppingCart<Rice> cart4 = new ShoppingCart <>();

  }
  
}
