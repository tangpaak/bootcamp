package com.vtxlab.g2307.model.poly;

import java.util.Optional;

public class poly2 {
  // stati cpolymorphism (overloading) -> methods
  // get(int x) is different to get(String x)
  // compile0time check

  // dynamic polymorphism (Parent class,Interface)
  // Customer extend Human implements Orderable
  public static void main(String[] args) {
    // implementation 睇右邊
    Human customer = new Customer("John");
    customer.order();
    System.out.println(Customer.counter);// 1
    Customer customer2 = new Customer("Peter");
    customer2.order();
    System.out.println(Customer.counter);// 2(+1)

    Human human = new Human("Mary");
    human.order();
    System.out.println(Customer.counter);// 4 (+2)
    // Customer human = new Human();
    // Cannot assign Parent class
    customer2.humanOrder();
    System.out.println(Customer.counter);

    // Interface
    Orderable customer3 = new Customer("Eric");// 合約行為
    customer3.order();// 7(+1)

    Orderable[] orderList = //
        new Orderable[] { new Customer("Peter"), new Driver() };

    Orderable order = getByName(orderList, "Peter");
    order.order();// +1
    Orderable order2 = getByName(orderList, "Vin");
    order2.order();// +3

    System.out.println(Customer.counter);// 11
  }

  public static Orderable getByName(Orderable[] orders, String name) {
    for (Orderable order : orders) {
      if (order instanceof Customer) {// make sure order is Customer
        Customer customer = (Customer) order;
        if (name.equals(customer.getName()))
          return customer;
      }
    }
    return new Driver();
  }
  // Optional Version
  // public static Optional<Orderable> getByName(Orderable[] orders, String name)
  // {
  // for (Orderable order : orders) {
  // if (order instanceof Customer) {// make sure order is Customer
  // Customer customer = (Customer) order;
  // if (name.equals(customer.getName()))
  // return Optional.of(customer);
  // }
  // }
  // return Optional.empty();
  // }
}
