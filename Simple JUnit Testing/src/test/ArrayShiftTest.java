package test;

import junit.framework.TestCase;
import main.ArrayShift;
import org.junit.Assert;
import org.junit.Test;


public class ArrayShiftTest extends TestCase {
private ArrayShift as;
private int[] inArray = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2 };

public final void setUp() {
	as = new ArrayShift(); 
}
@Test
 public final void testShiftOne() {
int[] outArray = as.shiftOne(inArray);

//test case: Checks if array is shifted, and also if the first val is -1 
Assert.assertArrayEquals("test1",new int[] {-1, 4, 6, 0, 3, 4, 5, 4, 4, 6}, outArray);


 }}




//assertEquals(testValue, trueExpectedValue);
//https://stackoverflow.com/questions/4228161/comparing-arrays-in-junit-assertions-concise-built-in-way
//Assert.assertEquals("test2", new int[] {-1, 4, 6, 0, 3, 4, 5, 4, 4, 5}, outArray); //this is interesting, so if we have one test case that fails it seems to stop everything