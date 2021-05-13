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
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = new int[]{1,-2,3,4,-5,6};
        int[] expResult = new int[]{1,3,4,6};
        int[] result = operaciones.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testExtraerPositivosNull() {
        System.out.println("extraerPositivos");
        int[] nums = null;
    }
    
    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test
    public void testExtraerPositivosEmpty() {
        System.out.println("extraerPositivos");
        int[] nums = new int[]{};
        int[] expResult = new int[]{};
        int[] result = operaciones.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
    }
}
