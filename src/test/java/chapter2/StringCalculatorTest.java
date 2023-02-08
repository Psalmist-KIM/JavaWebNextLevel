package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void addEmptyOrNull() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void addOnlyOneInteger() {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void split() {
        assertArrayEquals(new String[] { "1" }, "1".split(",|:"));
        assertArrayEquals(new String[] { "1", "2" }, "1,2".split(",|:"));
        assertArrayEquals(new String[] { "1", "2" }, "1:2".split(",|:"));

        assertArrayEquals(new String[] { "1", "2" }, cal.split("1,2"));
        assertArrayEquals(new String[] { "1", "2" }, cal.split("1:2"));
        assertArrayEquals(new String[] { "1", "2" }, cal.split("//;\n1;2"));
    }

    @Test
    public void addDelimiterComma() {
        assertEquals(6, cal.add("1,2,3"));
        assertEquals(1, cal.add("1,"));
        assertEquals(1, cal.add(",1"));
    }

    @Test
    public void addDelimiterColon() {
        assertEquals(6, cal.add("1:2:3"));
    }

    @Test
    public void addDelimiterColonAndComma() {
        assertEquals(6, cal.add("1,2:3"));
    }

    @Test
    public void isBlank() {
        assertEquals(true, cal.isBlank(null));
        assertEquals(true, cal.isBlank(""));
    }

    @Test
    public void toInts() {
        assertArrayEquals(new int[] {1, 2, 3}, cal.toInts(new String[] {"1", "2", "3"}));
    }

    @Test
    public void sum() {
        assertEquals(6, cal.sum(new int[] {1, 2, 3}));
    }

    @Test
    public void addWithCustomDelimiter() {
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test
    public void addNegative() {
        assertThrows(RuntimeException.class, () -> cal.add("-1"));
    }
}
