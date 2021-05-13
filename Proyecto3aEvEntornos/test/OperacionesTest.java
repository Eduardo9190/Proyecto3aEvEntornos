import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo Herencias
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
     * Test of isPar method, of class Operaciones.
     */
    @Test
    public void testIsPar() {
        System.out.println("isPar");
        int a = 6;

        boolean expResult = true;
        boolean result = operaciones.isPar(a);
    }
    
    /**
     * Test of isPar method, of class Operaciones.
     */
    @Test
    public void testIsNotPar() {
        System.out.println("isNotPar");
        int a = 7;

        boolean expResult = false;
        boolean result = operaciones.isPar(a);
    }
    
    /**
     * Test of isPar method, of class Operaciones.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testIsParExceptionZero() {
        System.out.println("isParExceptionZero");
        int a = 0;
    }
    
    /**
     * Test of isPar method, of class Operaciones.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testIsParExceptionNegative() {
        System.out.println("isParException");
        int a = -4;
    }
}
