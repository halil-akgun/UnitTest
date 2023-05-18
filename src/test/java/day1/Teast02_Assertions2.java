package day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Teast02_Assertions2 {

    // bazen testlerde bu dogru degil mi seklinde kontroller yapmak gerekirse..
    @Test
    public void testMathMin() {

//        assertTrue(Math.min(4,10) == 4);

        assertFalse(Math.min(4, 10) == 6);
    }

    @Test
    public void testSplit() {

        String[] anlikDeger = "gul rose".split(" ");
        String[] beklenenDeger = {"gul", "rose"};

        assertTrue(Arrays.equals(anlikDeger,beklenenDeger));
    }

    @Test
    public void testSplit2() {

        String[] anlikDeger = "gul rose".split(" ");
        String[] beklenenDeger = {"gul", "rose"};

        assertArrayEquals(beklenenDeger, anlikDeger);
    }
}
