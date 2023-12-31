package enums;

public enum Currency {

  USD(1, "US Dollor"), //
  HKD(2, "Hong Kong Dollar"), //
  CNY(3, "Chinese Yuan Renminbi"), //
  GBP(4, "British Pound Sterling"),//
  ;

  private int id;
  private String desc;

  private Currency(int id, String desc) {
    this.id = id;
    this.desc = desc;
  }

  public int getId() {
    return this.id;
  }

  public String getDesc() {
    return this.desc;
  }

  public static Currency getCurrency(int id) {
    // values()
    for (Currency currency : Currency.values()) {
      if (currency.id == id)
        return currency;

    }
    return null;



  }


  public static void main(String[] args) {
    // valueOf
    System.out.println(Currency.valueOf("HKD").getDesc()); // Hong Kong Dollar
    // System.out.println(Currency.valueOf("HKDS").getDesc()); //<-- not found, error

    //
    String s = "abc";
    System.out.println(String.valueOf(s)); // <-- 用緊String class搵value of s



  }


}
