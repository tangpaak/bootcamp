package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
// call method既時候既方式已經同你約定左

public class AppTest {

  private int x;

  @Test
  @DisplayName("AssertEquals Test")
  void testAssertEqual() {
    assertEquals(2, App.add(2, 6));
    assertEquals(2, App.add(2, 1));
    assertEquals(2, App.add(2, 5));
    assertEquals(-2, App.add(-6, -2));
    x++;
    assertEquals(1, x);
  }



  @Test
  void testAssertNotEqual() {
    assertNotEquals(4, App.add(1, 2));
  }


  // @Test
  // void testAddMethod() {
  // assertEquals(8, App.add(2, 6));

  // }

  @Test
  void testAddMethod1() {
    assertEquals(2, App.add(2, 1));

  }

  // est
  // void testAddMethod2() {
  //   assertEquals(7, App.add(2, 5));

  // }


  // @Test
  // void testAssertTrue() {
  // assertTrue(12 == App.add(7, 5));
  // }

  // @Test
  // void testAssertFalse() {
  // assertFalse(2 == App.add(7, 5));
  // }

  @Test
  void testAssertNull() {
    String str = null;
    assertNull(str);
  }

  @Test
  void testAssertNotNull() {
    Student student = new Student();
    assertNotNull(student.getSubjects());
  }

  // est
  //  testAssertThrows() {
  // assertThrows(ArithmeticException.class, () -> {
  //     App.divide(10, 5);
  // });
 
  // assertDoesNotThrow(() -> {
  //     App.divide(10, 5);
  //   });
  // }

  @Test
  void testAssertNotTimeout() {
    assertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50); // ms
    });
  }

  @Test
  void testCombine() {
    assertAll(() -> assertTrue(10 > 3), //
        () -> assertEquals(4, App.add(4, 6)), //
        () -> assertNull(null));
  }

  @Test
  void testSame() {
    String s1 = new String("Junit");
    String s2 = new String("Junit");
    assertNotSame(s1, s2); // test object reference
    assertEquals(s1, s2); // test value
    String s3 = "Junit";
    String s4 = "Junit";
    assertSame(s3, s4); // test object reference
    assertEquals(s3, s4); // test value
  }



  public static void main(String[] args) {

    // AppTest t1 = new AppTest();
    // t1.testAssertEqual();
    // AppTest t2 = new AppTest();
    // t2.testAssertNotEqual();

    AppTest t3 = new AppTest();
    // t3.testAssertThrows();



  }

}


