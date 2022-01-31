import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Methods {
    public static boolean higher(int x, int y){
        return x > y ? true : false;
    }

    @Test
    public void testHigher(){
        assertTrue(higher(100, 2));
        assertFalse(higher(2, 100));
    }
}

  
