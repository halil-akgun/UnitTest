package day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifyTest {

    StringModify obj1;

    @BeforeEach
    void setup() {
        obj1 = new StringModify();
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        obj1 = null;
        System.out.println("AfterEach");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC", "BC, ABC"})
    void deleteIfItIsInFirstTwoPositionTest(String expexted, String actual){
        assertEquals(expexted, obj1.stringModify1(actual));
    }
}
