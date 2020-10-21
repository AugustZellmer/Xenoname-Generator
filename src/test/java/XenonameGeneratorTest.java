import me.augustzellmer.xenoname.XenonameGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XenonameGeneratorTest {

    private XenonameGenerator underTest;

    @Before
    public void init(){
        underTest = new XenonameGenerator();
    }

    @Test
    public void getName_withSpace(){
        String result = underTest.getName("August Zellmer");
        assertFalse(result.isEmpty());
        assertTrue(result.contains(" "));
    }

    @Test
    public void getName_noSpace(){
        String result = underTest.getName("August");
        assertFalse(result.isEmpty());
        assertTrue(result.contains(" "));
    }
}
