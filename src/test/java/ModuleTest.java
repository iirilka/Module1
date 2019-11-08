
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuleTest {
    private static UniqueSymbolsCounter UniqueSymbolsCounterInstance;
    int[] array = {1, 4, 5, 1, 1, 3};
    @Before
    public void before(){
        System.out.println("Before runing...");
        UniqueSymbolsCounterInstance=new UniqueSymbolsCounter();
    }
    @Test
    public void uniqueSymbolsCounterTest() {
        int number = UniqueSymbolsCounterInstance.countUnique(array);
        assertEquals(4,number);
    }

}
