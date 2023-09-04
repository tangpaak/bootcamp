package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor //<- 無得call super()
// @RequiredArgsConstructor

@SuperBuilder

public class Address {

  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  @NonNull
  private Country country;

  public Address(Country country){
    if(country == null)
    throw new NullPointerException();
    this.country = country;
  }


  public static void main(String[] args) {
    Address a1 = new Address(Country.HK);
    // Address a3 = new Address(null); // error <-- since you already throw new exception
    Address a2 = Address.builder()//
        .addrLine1("abc")//
        .addrLine2("def")//
        .addrLine3("ijk")//
        .country(Country.US) // run time error
        .build();
  }

}
