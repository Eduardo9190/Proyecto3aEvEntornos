import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author CES
=======
 * @author Eduardo Herencias
>>>>>>> isPar
=======
 * @author Eduardo Herencias
>>>>>>> extraerPositivos
 */
public class OperacionesTest {
    
    Operaciones operaciones;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    
=======
            
>>>>>>> sumRango
=======
    
>>>>>>> isPar
=======
    
>>>>>>> extraerPositivos
    public OperacionesTest() {
    }
    
    @BeforeClass
<<<<<<< HEAD
<<<<<<< HEAD
    public static void setUpClass() {
=======
    public static void setUpClass() {   
>>>>>>> isPar
=======
    public static void setUpClass() {
>>>>>>> extraerPositivos
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
=======
    
    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = new int[]{1,-2,3,4,-5,6};
        int[] expResult = new int[]{1,3,4,6};
        int[] result = operaciones.extraerPositivos(nums);
>>>>>>> extraerPositivos
        assertArrayEquals(expResult, result);
    }
    
    /**
<<<<<<< HEAD
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
=======
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
>>>>>>> extraerPositivos
