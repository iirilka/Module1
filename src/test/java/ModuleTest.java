
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {
    private static UniqueSymbolsCounter uniqueSymbolsCounterInstance;
    private static HorseMove horseMoveInstance;
    int[] array = {1, 4, 5, 1, 1, 3};
    @Before
    public void before(){
        System.out.println("Before runing...");
        uniqueSymbolsCounterInstance=new UniqueSymbolsCounter();
        horseMoveInstance = new HorseMove();
    }
    @Test
    public void uniqueSymbolsCounterTest() {
        int number = uniqueSymbolsCounterInstance.countUnique(array);
        assertEquals(4,number);
    }
    @Test
    public void horseMoveTest()
    {
        //шахматная доска - 8х8
        boolean canMove1 = horseMoveInstance.canHorseMove(1,3, 3, 4);
        boolean canMove2 = horseMoveInstance.canHorseMove(7,6, 3, 4);
        assertTrue(canMove1);
        assertFalse(canMove2);

    }

}
