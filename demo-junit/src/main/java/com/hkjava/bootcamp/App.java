package com.hkjava.bootcamp;

/**
 * Hello world!
 *
 */
public class App {

    public static int add(int x, int y) {
        if (x > 1) {
            // let another Method(x+y) ->1
            return x + anotherMethod(x + y);
        }
        return y + anotherMethod(x + y);
    }

    public static int anotherMethod(int z) {
        return (z + 2) / 100;
    }


    public static int divide(int x, int y) {
        return x / y;
    }
}
