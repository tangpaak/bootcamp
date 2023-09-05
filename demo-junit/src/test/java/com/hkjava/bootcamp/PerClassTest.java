package com.hkjava.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)

public class PerClassTest {
  private int x ;

  // private boolean assertEquals(int i, int x2) {
  //   return i == x2;
  // }

  @Test
  @Order(1)
  void test1(){
    x++;
    Assertions.assertEquals(1, x);

  }

  // @Test
  // @Order(2)
  // void test2(){
  //   x++;
  //   Assertions.assertEquals(1, x);
  // }





}
