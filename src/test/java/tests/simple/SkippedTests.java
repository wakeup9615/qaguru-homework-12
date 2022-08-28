package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedTests {
    @Test
    @Disabled("Some reason")
    void test1() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test2() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test3() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test4() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test5() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test6() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test7() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test8() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test9() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test10() {
        assertTrue(true);
    }
}
