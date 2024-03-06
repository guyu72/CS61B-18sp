package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes1() {
        IntList lst = IntList.of(2);
        boolean res = IntListExercises.squarePrimes(lst);
        assertEquals("4", lst.toString());
        assertTrue(res);
    }
    @Test
    public void testSquarePrimes2() {
        IntList lst = IntList.of(2, 3, 5);
        boolean res = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 25", lst.toString());
        assertTrue(res);
    }
    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(4, 6, 8, 289);
        boolean res = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 6 -> 8 -> 289", lst.toString());
        assertFalse(res);
    }
    @Test
    public void testSquarePrimes4() {
        IntList lst = IntList.of(2,6,8);
        boolean res = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 6 -> 8", lst.toString());
        assertTrue(res);
    }
}
