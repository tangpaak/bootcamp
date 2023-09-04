package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Setter
@Getter
@ToString
public class Laptop {

  private String os;
  @Setter
  private int memory;


  public static void main(String[] args) {
    Laptop laptop = new Laptop("Windows", 32);
    System.out.println(laptop.getMemory());
    System.out.println(laptop.getOs());
    laptop.setMemory(64);
    // laptop.set0s("Mac");



    


  }

}
