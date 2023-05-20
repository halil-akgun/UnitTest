package day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwoLastTwoSameTest {

    FirstTwoLastTwoSame obj = new FirstTwoLastTwoSame();

    @ParameterizedTest
    @CsvSource(value = {"true, baba", "false, gul"})
    void firstTwoLastTwoSame(boolean b, String str) {
        assertEquals(b, obj.firstTwoLastTwoSame(str));
    }
}
