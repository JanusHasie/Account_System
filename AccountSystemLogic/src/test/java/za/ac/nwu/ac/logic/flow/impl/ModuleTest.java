package za.ac.nwu.ac.logic.flow.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuleTest {

    private  Module mod;

    @Before
    public void setUp() throws Exception{
        mod = new Module();
    }

    @Test
    public void testMod(){
        Integer result = mod.doMod(9, 5);
        assertNotNull("Should not be null", 4);
        assertEquals("Should be value 4", 4, result.intValue());
    }

    @Test
    public void testModBy() {
        try {
            mod.doMod(6, 2);
//            fail("Should throw and exception");
        }catch(Exception e) {
            assertTrue("Unexpected action",e.getMessage().equalsIgnoreCase("Reason"));
        }
    }
}
