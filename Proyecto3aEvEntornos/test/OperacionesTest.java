import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author CES
=======
 * @author Eduardo Herencias
>>>>>>> isPar
 */
public class OperacionesTest {
    
    Operaciones operaciones;
<<<<<<< HEAD
<<<<<<< HEAD
    
=======
            
>>>>>>> sumRango
=======
    
>>>>>>> isPar
    public OperacionesTest() {
    }
    
    @BeforeClass
<<<<<<< HEAD
    public static void setUpClass() {
=======
    public static void setUpClass() {   
>>>>>>> isPar
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
<<<<<<< HEAD
    
    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRango() {
        System.out.println("sumRango");
        int a = 2;
<<<<<<< HEAD
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
=======
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
>>>>>>> sumRango
=======

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
>>>>>>> isPar
