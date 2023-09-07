package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance (TestInstance.Lifecycle.PER_METHOD)

public class BeforeAfterTest {

  private int x;



  @BeforeEach
  void configuration(){
    System.out.println("Before each start!!");
    assertEquals(3, this.x);
    this.x +=3;

  }


  @AfterEach
  void endOfTest(){
    System.out.println("endOfTest start");
    this.x -=2;
    System.out.println("ended= x=" + this.x);
  }


  @Test
  void testAdd() {
    System.out.println("testAdd2 start!!");
    assertEquals(5, App.add(this.x, 5));
  }


  @Test
  void testAdd2() {
    System.out.println("testAdd2 start!!");
    assertEquals(8, App.add(this.x, 8));
  }






}
