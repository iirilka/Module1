
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {
    private static UniqueSymbolsCounter uniqueSymbolsCounterInstance;
    private static HorseMove horseMoveInstance;
    private static AreaOfTriangle areaOfTriangleInstance;
    int[] array = {1, 4, 5, 1, 1, 3};

    @Before
    public void before() {
        System.out.println("Before runing...");
        uniqueSymbolsCounterInstance = new UniqueSymbolsCounter();
        horseMoveInstance = new HorseMove();
        areaOfTriangleInstance = new AreaOfTriangle();

    }

    @Test
    public void uniqueSymbolsCounterTest() {
        int number = uniqueSymbolsCounterInstance.countUnique(array);
        assertEquals(4, number);
    }

    @Test
    public void horseMoveTest() {
        //шахматная доска - 8х8
        boolean canMove1 = horseMoveInstance.canHorseMove(1, 3, 3, 4);
        boolean canMove2 = horseMoveInstance.canHorseMove(7, 6, 3, 4);
        assertTrue(canMove1);
        assertFalse(canMove2);

    }

    @Test
    public void areaOfTriangleTest() {
        double area1 = areaOfTriangleInstance.areaCalculate(1,1,-2,4,-2,-2);
        assertEquals(9,area1,0.001);
        double area2 = areaOfTriangleInstance.areaCalculate(0,0,1,0,0,0);
        assertEquals(0,area2,0.001);
    }

}
