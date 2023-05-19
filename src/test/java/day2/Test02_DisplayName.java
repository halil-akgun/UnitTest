package day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {

    @Test
    @DisplayName("parseInt control")
    void test1() {
        String str = "gul";

        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(str);
        });
    }
}
