package day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_BeforeAll_AfterAll {

    static String str;

    @BeforeAll // Method 'before' annotated with '@BeforeAll' should be static
    static void before(TestInfo info) {
        str = "gul";
        System.out.println("before "+info.getDisplayName());
    }

    @AfterAll // Method 'after' annotated with '@AfterAll' should be static
    static void after(TestInfo info) {
        str = null;
        System.out.println("after "+info.getDisplayName());
    }

    @Test
    void testLength(TestInfo info) {    // TestInfo: consolda calisan method bilgisini gorebilmek icin
        System.out.println(info.getDisplayName());
        assertEquals(3, str.length());
    }

    @Test
    void testLength2(TestInfo info) {
        System.out.println(info.getDisplayName());
        assertEquals(3, str.length());
    }
}
