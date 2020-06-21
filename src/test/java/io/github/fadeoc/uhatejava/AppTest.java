package io.github.fadeoc.uhatejava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for io.github.fadeoc.uhatejava.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void isEmptyAfterTrimmedTest() {
        assertTrue(StringUtils.isEmptyAfterTrimmed("  "));
        assertTrue(StringUtils.isEmptyAfterTrimmed(" "));
        assertTrue(StringUtils.isEmptyAfterTrimmed(""));
        assertFalse(StringUtils.isEmptyAfterTrimmed("1"));
        assertFalse(StringUtils.isEmptyAfterTrimmed(" 1 "));
    }
}
