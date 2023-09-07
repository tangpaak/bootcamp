package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@SuperBuilder
@Builder
@ToString

public class Human {
  private String name;

  // public String getName(){
  //   return this.name;
  // }



}
