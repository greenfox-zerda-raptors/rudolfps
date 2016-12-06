import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gabkamabka on 2016.12.06..
 */


public class NumberConverterTests {

    @Test
    public void shouldReturnIfor1() {
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }

    @Test
    public void shoudReturnIIfor2() {
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }

    @Test
    public void shoudReturnIIIfor3() {
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }

    @Test
    public void shoudReturnIVfor4() {
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }

    @Test
    public void shoudReturnVfor5() {
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }

    @Test
    public void shoudReturnVIfor6() {
        assertEquals("VI", NumberConverter.arabicToRoman(6));

    }
    @Test
    public void shoudReturnIXfor9() {
        assertEquals("IX", NumberConverter.arabicToRoman(9));

    }
    @Test
    public void shoudReturnXfor10() {
        assertEquals("X", NumberConverter.arabicToRoman(10));

    }
    @Test
    public void shoudReturnCfor100() {
        assertEquals("C", NumberConverter.arabicToRoman(100));

    }
}
