package test;
import junit.framework.TestCase;
import main.ArrayMult;
import org.junit.Assert;
import org.junit.Test;

public class ArrayMultTest extends TestCase{
	
//test dummy values here
private int[] array1 = new int [] {1,3,4,5};
private int[] array2 = new int [] {2,3,4,5};
private int[] array3 = new int [] {1,3,4,5,7,13};
private int[] array4 = new int [] {2,3,4,-5};

private ArrayMult am;

public final void setUp() {
	am = new ArrayMult(); }

//test cases: 1) array with no negative integers; 2) same length, 3) one array is longer, 4) maybe opp of 3)

 @Test
//test same length 
 public final void testMult() {
int[] outArray = am.mult(array1, array2);	 
Assert.assertArrayEquals(new int[] {2,9,16,25}, outArray);
 }
 
 @Test
//test different length
 public final void testMult2() {
 int[] outArray = am.mult(array2, array3);
Assert.assertArrayEquals(new int[] {2,9,16,25,7,13}, outArray);
 }

@Test
//check negative integers
public final void testNeg() {
	
try {
int[] outArray = am.mult(array1, array4);	

fail("Should not work, contains negative integer");
	}
	
catch(final RuntimeException e){assertTrue(true);}
}}

//without try & catch, but i think try and catch is nicer 

//if (outArray==null) {
//assertTrue(true);
//} else {
//fail("Should not work, contains negative integer");
//}
//}




//https://www.javaguides.net/2018/08/junit-assertfail-method-example.html
//https://www.baeldung.com/junit-fail




