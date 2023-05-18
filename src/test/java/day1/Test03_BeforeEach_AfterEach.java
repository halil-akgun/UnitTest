package day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_BeforeEach_AfterEach {

    String str;

    @BeforeEach // test edilen her method oncesi calisir
    void before(TestInfo info) {
        str = "gul";
        System.out.println("before "+info.getDisplayName());
    }

    @AfterEach // test edilen her method sonrasi calisir
    void after(TestInfo info) {
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

    // test methodlarinin calisma sirasini kendimiz belirlemek istiyorsak JUnit4 --> @FixMethodOrder
    // JUnit5 -->@TestMethodOrder
}
