package Polymorphism1;


public class Polymorphism {


  public static void main(String[] args) {

    // static polymorphism (overloading) ->methods
    // get(int x) is different to get (String x)
    // compile-time check

    // dynamic polymorphism (Parent class, Interface)
    // Customer extend Human implements Orderable
    Human customer = new Customer("John");
    customer.order();
    System.out.println(Customer.counter); // 1

    Customer customer2 = new Customer("Peter");
    customer2.order();
    System.out.println(Customer.counter); // 2 (+1)

    Human human = new Human("Mary");
    human.order();
    System.out.println(Customer.counter); // 4
    // Customer human = new Human(); cannot assign Parent class to sub class

    customer2.humanOrder();
    System.out.println(Customer.counter); // 6 (+2)

    // Interface
    Orderable customer3 = new Customer("Eric");
    customer3.order();
    System.out.println(Customer.counter); // 7 (+1)

    Orderable[] orders = new Orderable[] {new Customer("Peter"), new Driver()};
    Orderable order = getByName(orders, "Peter");
    order.order(); // 8(+1)
    Orderable order2 = getByName(orders, "vincent");
    order2.order(); // 11 (+3)

    System.out.println(Customer.counter);



  }


  public static Orderable getByName(Orderable[] orders, String name) {
    for (Orderable order : orders) {
      if (order instanceof Customer) {
        Customer customer = (Customer) order;
        if (name.equals(customer.getName()))
          return customer;
      }
    }
    return new Driver() ;
  }

}
