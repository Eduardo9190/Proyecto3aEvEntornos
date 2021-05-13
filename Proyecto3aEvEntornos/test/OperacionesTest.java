import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    Operaciones operaciones;
            
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        operaciones = new Operaciones();
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRango() {
        System.out.println("sumRango");
        int a = 2;
        int b = 6;
        int expResult = 20;
        int result = operaciones.sumRango(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRango2() {
        System.out.println("sumRango");
        int a = 6;
        int b = 2;
        int expResult = 20;
        int result = operaciones.sumRango(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRangoEqualNumberProvided() {
        System.out.println("sumRango");
        int a = 5;
        int b = 5;
        int expResult = 0;
        int result = operaciones.sumRango(a, b);
        assertEquals(expResult, result);
    }
}
