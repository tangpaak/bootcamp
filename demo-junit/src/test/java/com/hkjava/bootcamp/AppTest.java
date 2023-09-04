package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)

public class AppTest {

  @Test
  void testAssertEqual() {
    assertEquals(8, App.add(2, 6));
    assertEquals(3, App.add(2, 1));
    assertEquals(1, App.add(2, 5));
  }

  @Test
  void testAssertNoEqual() {
    assertNotEquals(4, App.add(1, 2));
  }


  @Test
  void testAddMethod() {
    assertEquals(8, App.add(2, 6));

  }

  @Test
  void testAddMethod1() {
    assertEquals(3, App.add(2, 1));

  }

  @Test
  void testAddMethod2() {
    assertEquals(1, App.add(2, 5));

  }

  public static void main(String[] args) {

    AppTest t1 = new AppTest();
    t1.testAssertEqual();
    AppTest t2 = new AppTest();
    t2.testAssertEqual();



  }

}


