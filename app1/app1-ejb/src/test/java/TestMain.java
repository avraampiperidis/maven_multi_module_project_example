
import com.protectsoft.company.app1.ejb.Main;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piper
 */
public class TestMain {
    
    @Test
    public void testMain() {
        assertEquals("Hello!",Main.getMessage());
    }
    
}
