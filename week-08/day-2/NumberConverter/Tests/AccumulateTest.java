import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gabkamabka on 2016.12.06..
 */
public class AccumulateTest {

    @Test
    public void accumfirst () {
        assertEquals("", Accumulate.accumul(""));
    }
    @Test
    public void accumA () {
        assertEquals("A", Accumulate.accumul("a"));
    }
    @Test
    public void accumSeries1 () {
        assertEquals("A-Bb", Accumulate.accumul("ab"));
    }
    @Test
    public void accumSeries2 () {
        assertEquals("A-Bb-Ccc-Dddd", Accumulate.accumul("abcd"));
    }


}