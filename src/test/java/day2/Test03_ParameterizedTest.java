package day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {

    @Test
    void testLength(){

        assertTrue("gul".length()>0);
        assertTrue("rose".length()>0);
    }


    // !!! yukardaki metodda 2 defa assertTrue yazdik ama bunu doha clean sekilde yapmak icin :
    @ParameterizedTest
    @ValueSource(strings = {"gul", "rose"})
    void testLength2(String str) {
        assertTrue(str.length() > 0);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "GUL, gul",
            "ROSE, rose"
    })
    void testUppercase(String str1, String str2) {
        assertEquals(str1, str2.toUpperCase());
    }


    @ParameterizedTest
    @CsvSource(value = {
            "true, gul, u",
            "true, rose, s",
            "false, rose, x"
    })
    void testContains(Boolean a, String str1, String str2) {
        assertEquals(a, str1.contains(str2));
    }

}
