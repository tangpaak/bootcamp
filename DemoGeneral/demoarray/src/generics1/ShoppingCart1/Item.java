package generics1.ShoppingCart1;

public class Item {
 private int price;
 private String header;
 private String desc;

 public Item(){
  
 }


  public Item (int price){
    this.price = price;
  }
  
  public int getPrice(){
    return this.price;
  }
}
