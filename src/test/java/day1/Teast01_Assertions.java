package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teast01_Assertions {

    @Test
    public void test() {
        // main methodu yokken nasil calisir?
        // Junit icindeki main methodu cagriliyor.
        // Junit5 (Jupiter) ile beraber methodlarin erisim belirleyicisini public yapmak zorunda degiliz artik
    }

    @Test
    public void testLength() {
        String str = "hello world"; // 11 character
        int anlikDeger = str.length();
        int beklenenDeger = 11;
        assertEquals(beklenenDeger, anlikDeger);
    }

    @Test
    public void testUppercase() {
        String anlikDeger = "hello".toUpperCase();
        String beklenenDeger = "HELLO";
        assertEquals(anlikDeger, beklenenDeger, "duzgun calismadi");// ozel mesaj ekleyebiliriz
    }

    @Test
    public void testToplama() {
        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1, sayi2);
        int beklenenDeger = 15;
        assertEquals(anlikDeger, beklenenDeger);
    }

    @Test
    public void testContains() {
        assertEquals(false, "beklenenDeger".contains("z"));
    }

}
