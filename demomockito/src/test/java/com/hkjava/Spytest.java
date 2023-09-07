package com.hkjava;



import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;


@ExtendWith(MockitoExtension.class)

public class Spytest {

  @Spy
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

@Test
void testAdd1(){
  when(calculator.substract(3,4)).thenReturn(100);
  int result = checkout.add(3,4);
  assertEquals(104,result);

}

  @Test // spy
  void testAdd2() {
    int result = checkout.add(3, 4);
    assertEquals(5, result);
  }

@Test
void test3(){
when(calculator.multiply(-2,4)).thenReturn(100);
int result = checkout.multiply(-2,4);
assertEquals(106,result); // 100 + (4 - (-2) -2)

}



}


