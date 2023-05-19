package day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTime {

    @RepeatedTest(3)
        // test 3 kere tekrarlanir
    void testSubstring() {
        assertEquals("gul", "rosegul".substring(4));
        System.out.println("test calisti");
    }

    @RepeatedTest(3)
    @Disabled
        // bu testi calistirmaz
    void testSubstring2() {
        assertEquals("gul", "rosegul".substring(4));
        System.out.println("test calisti");
    }

    @RepeatedTest(5)
    void randomTest() {
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);

        assertEquals(a + b, Math.addExact(a, b));
        System.out.println(a + "+" + b);
    }

}
