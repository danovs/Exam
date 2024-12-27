import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringSymbolsCountTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringSymbolsCount.countLetters(""));
    }

    @Test
    public void testStringWithOnlyLetters() {
        assertEquals(6, StringSymbolsCount.countLetters("abcdef"));
    }

    @Test
    public void testStringWithLettersAndNumbers() {
        assertEquals(4, StringSymbolsCount.countLetters("a1b2c3d"));
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertEquals(5, StringSymbolsCount.countLetters("ab!@#cd$%^e"));
    }

    @Test
    public void testNullString() {
        assertEquals(0, StringSymbolsCount.countLetters(null));
    }
}
