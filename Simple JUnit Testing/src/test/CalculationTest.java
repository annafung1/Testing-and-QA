package test;

import main.Calculation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculationTest {
    private int[] array1 = new int[]{1, 3, 4, 50};
    private int[] array2 = new int[]{2, 3, 100, 5};
    private int cube1 = 2;
    private int cube2 = 3;

    private Calculation calc;

    @Before
    public void setUp() {
        calc = new Calculation();
    }
    
    @Before
    public void before() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before Class");
    }
    
    @After
    public void after() {
    	System.out.println("After Test");
    }

    @AfterClass
    public static void setUpAfterClass() {
        System.out.println("After Class");
    }

    //find array1 max value
    @Test
    public void testCalc1() {
        int max = Calculation.findMax(array1);
        assertEquals(50, max);  }
    
    //find array2 max value
    @Test
    public void testCalc2() {
     int max = Calculation.findMax(array2);
     assertEquals(100, max);}

    @Test
    public void testCube1() {
    //cube 1; n=2
        int n = Calculation.cube(cube1);
        assertEquals(8, n); }
    
    @Test
    public void testCube2() {
    //cube 2; n=3
        int n = Calculation.cube(cube2);
        assertEquals(27, n); }}

//https://www.baeldung.com/junit-before-beforeclass-beforeeach-beforeall
//https://junit.org/junit4/javadoc/4.12/org/junit/Before.html


//todo: 2 test case for find max
//2 test case for cube
//before and after for all method tests
//before and after for entire testing

//@Before Run before each @Test method.
//@BeforeClass Run once before all @Test methods in a class.
//@After
//@AfterClass

