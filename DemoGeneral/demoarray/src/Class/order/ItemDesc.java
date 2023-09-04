package Class.order;

import java.util.Arrays;

public class ItemDesc {
  private String header;
  private String body;


  public ItemDesc (String header, String body){
    this.header = header;
    this.body = body;
  }



public static void main(String[] args){
ItemDesc itemdesc1 = new ItemDesc ("Item A", "90% discount, just for today!");
ItemDesc itemdesc2 = new ItemDesc ("ItemB", "70% discount, just for this week!");

Transaction t = new Transaction(1, itemdesc1, 3, 10.5);
Transaction t2 = new Transaction(1, itemdesc2, 4, 20.5);
Order order = new Order (new Transaction[] {t, t2});

 
System.out.println(order.getsubTotal(order));
double[] arr1 = order.getsubTotal(order);
System.out.println(Arrays.toString(arr1));


}

  
}
