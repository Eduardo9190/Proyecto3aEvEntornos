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
     * Test of rango method, of class Operaciones.
     */
    @Test
    public void testRango() {
        System.out.println("rango");
        int a = 2;
        int b = 7;
        int[] expResult = new int[]{2,3,4,5,6,7};
        int[] result = operaciones.rango(a, b);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of rango method, of class Operaciones.
     */
    @Test
    public void testRango2() {
        System.out.println("rango");
        int a = 7;
        int b = 2;
        int[] expResult = new int[]{2,3,4,5,6,7};
        int[] result = operaciones.rango(a, b);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of rango method, of class Operaciones.
     */
    @Test
    public void testRangoEqualNumberProvided() {
        System.out.println("rango");
        int a = 5;
        int b = 5;
        int[] expResult = new int[]{};
        int[] result = operaciones.rango(a, b);
        assertArrayEquals(expResult, result);
    }
}