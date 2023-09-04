package Class.order;

public class Transaction {

  private int itemNo;
  private ItemDesc itemDesc;
  private int quantity;
  private double unitPrice;


  public Transaction() {

  }

  public Transaction(int itemNo, ItemDesc itemDesc, int quantity, 
      double unitPrice) {
    this.itemNo = itemNo;
    this.quantity = quantity;
    this.itemDesc = itemDesc;
    this.unitPrice = unitPrice;
  }


  public int getItemNo() {
    return this.itemNo;

  }

  public int getQuantity() {
    return this.quantity;

  }

  public ItemDesc getitemDesc() {
    return this.itemDesc;
  }

  public double getunitPrice() {
    return this.unitPrice;

  }

  public void setItemNo(int itemNo) {
    this.itemNo = itemNo;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setitemDesc(ItemDesc itemDesc) {
    this.itemDesc = itemDesc;
  }

  public void setunitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public static void main(String[] args) {



  }



}
