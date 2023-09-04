package Inheritance1.SuperMethod;

import java.math.BigDecimal;

public class Taxi extends Vehicle {
  // cannot inherits private fields from superclass
  private BigDecimal minimalCharge;

  public Taxi(String licensePlate, int capacity, BigDecimal minimalCharge) {
    super(licensePlate, capacity); // calling super class's constructor
    this.minimalCharge = minimalCharge;

  }

  // Inherits all public methods from superclass

  // additional method
  public void setMinimalCharge(BigDecimal minimalCharge) {
    this.minimalCharge = minimalCharge;
  }



}
