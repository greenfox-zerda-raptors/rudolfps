import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gabrud on 2016-11-21.
 */
public class TestRudolfps {


    WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
    @Test
    public void countHowMany() throws Exception {
        assertEquals(3, wSource.countHowMany('a'));
        assertEquals(0, wSource.countHowMany('x'));
        assertEquals(2, wSource.countHowMany('t'));
        assertEquals(2, wSource.countHowMany('T'));
        assertEquals(1, wSource.countHowMany(' '));
        assertEquals(2, wSource.countHowMany('s'));

    }
    WordToolbox wSource2 = new WordToolbox ("Me Tarzan, You Jane");

    @Test
    public void countHowMany2() throws Exception {
        assertEquals(1, wSource2.countHowMany('M'));
        assertEquals(3, wSource2.countHowMany('a'));
        assertEquals(1, wSource2.countHowMany('Y'));
    }
}
