package com.hkjava;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)

public class MockTest {

    @InjectMocks
    Checkout checkout; // 假object

    @Mock // mock 可以new一個假既object
    Calculator calculator;

    @Test
    void testSubstract() {
        Calculator calculator = new Calculator(3);
        assertEquals(-7, calculator.substract(10, 6));

    }

    // Spy
    @Test
    void testSubstract2() {
        Calculator calculator = new Calculator(3);
        assertEquals(-7, calculator.substract(10, 6));
        assertEquals(6, calculator.substract(2, 3));
    }

    @Test
    void testMultiply(){
        when(calculator.substract(7,9)).thenReturn(10000);
        when(calculator.multiply(7,9)).thenReturn(10000);
        int result = checkout.multiply(7,9); // Scenario: x <= 1
        assertEquals(10009,result);
    }

    @Test
    void testMultiply2(){
        when(calculator.substract(3,8)).thenReturn(10000);
        int result = checkout.multiply(3,8); // Scenario: x <= 1
        assertEquals(8,result);
    }


    // @Test
    // void testAdd1() {
    // when(calculator.substract(3,4)).thenReturn(100);

    // Checkout checkout = new Checkout(calculator);
    // //Testing Start
    // int result = checkout.add(3,4);
    // assertEquals(104, result);
    // }

    @Test 
    void testAdd2(){
        when(calculator.substract(3,4)).thenReturn(100);

        Checkout checkout = new Checkout(calculator);
        //Testing Start
        int result = checkout.add(3,4);
        assertEquals(104, result);
        verify(calculator, times(1)).substract(3, 4);
    }

    @Test
    void testAdd3() {
        // when(calculator.substract(1,4)).thenReturn(100);

        Checkout checkout = new Checkout(calculator);
        // Testing Start
        int result = checkout.add(1, 4);
        assertEquals(5, result);
        verify(calculator, times(0)).substract(1, 4);
    }

    @Test  //Inject Mock method:
    void testAdd4(){
        when(calculator.substract(3,4)).thenReturn(100);
        // Checkout checkout = new Checkout(calculator);
        //Testing Start
        int result = checkout.add(3,4);
        assertEquals(104, result);
        verify(calculator, times(1)).substract(3, 4);
    }


}


