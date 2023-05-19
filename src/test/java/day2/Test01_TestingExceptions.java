package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {

    @Test
    void testException() {

        String str = null;
//        null olmadiginda: Expected java.lang.NullPointerException to be thrown, but nothing was thrown.

        assertThrows(NullPointerException.class, () -> {
            System.out.println("testException calisti");
            str.length();
        });
    }

    @Test
    void testException2() {
        int a = 1;
        int b = 0;

        // ArithmeticException yerine parent exception da yazilabilir
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(a / b);
        });
    }

    @Test
    void testException3() {
        int a = 1;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            divide(a, b);
        });
    }

    private int divide(int a, int b) {
        return a / b;
    }
}
