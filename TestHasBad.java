import static org.junit.Assert.*;
import org.junit.Test; 

public class TestHasBad {
    @Test
    public void testHasBad() {
    
    	assertThat(" ",containsString("bad"));
    	assertThat("b", containsString("bad"));
    	assertThat("ba", containsString("bad"));
    }


}