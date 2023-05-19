package day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformanceTest {

    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(2), // 2 sn'de bitmezse testi gecemez
                ()-> IntStream.rangeClosed(1,1000000).forEach(System.out::println));
    }

    @Test
    void testPrintPerformance2(){
        assertTimeout(Duration.ofSeconds(1), // 1 sn'de bitmezse testi gecemez
                ()-> IntStream.rangeClosed(1,50000).reduce((x,y)-> Math.addExact(x,y)));
    }
}
