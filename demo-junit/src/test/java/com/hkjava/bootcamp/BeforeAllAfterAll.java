package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance (TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllAfterAll {


  private int x;

  @BeforeAll
  static void beforeAll() {
    System.out.println("beforeAll start");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("afterAll start");
  }

  @Test
  void test() {
    x++;
    System.out.println("test= " + x);
    assertTrue(x == 1);


  }

  @Test
  void test2() {
    x++;
    System.out.println("test2= " + x);
  }



}
