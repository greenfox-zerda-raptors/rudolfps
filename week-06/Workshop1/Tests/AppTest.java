import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static groovy.util.GroovyTestCase.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by gabkamabka on 2016.11.21..
 */
public class AppTest {

    private static ArrayList<Integer> myList2;

    @Test
    public void sum() throws Exception {
        myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, App.sum(myList2));
    }

    @Test
    public void sumempty() throws Exception {
        myList2 = new ArrayList<>();
        assertEquals(0, App.sum(myList2));
    }
    @Test
    public void sumone() throws Exception {
        myList2 = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, App.sum(myList2));
    }
    @Test (expected = NullPointerException.class)
    public void sumApplesNull() throws Exception {
        myList2 = new ArrayList<>(null);
        assertNull(App.sum(myList2));
    }

}
