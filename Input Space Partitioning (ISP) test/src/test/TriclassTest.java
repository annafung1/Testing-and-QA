package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import main.Triclass;

public class TriclassTest {
	
	static int testNum=1;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Testing started");
	}
	
	
	@AfterClass
	public static void setUpAfterClass() throws Exception {
		System.out.println("Testing is finished");
	}

	@Before
	public void setUpBefore() throws Exception{
	
		System.out.println("Test_Number " + testNum + "- started");		
	}
	
	
	@After
	public void setUpAfter() throws Exception{
		System.out.println("Test_Number " + testNum + "- finished");	
		  testNum++;
	}
	

	@Test
	public void boundary_Min() {
		assertEquals("Isosceles", Triclass.classify(5,5,1));
	}
	
	
	@Test
	public void boundary_Just_Above_Min() {

		assertEquals("Isosceles", Triclass.classify(5,5,2));
	}
	
	@Test
	public void boundary_Just_Below_Max() {

		assertEquals("Isosceles", Triclass.classify(5,5,9));
	}
	
	
	@Test
	public void boundary_Max() {
		// violate triangles inequality theorem
		assertEquals("Not A traingle", Triclass.classify(5,5,10));
	}
	
	@Test
	public void boundary_nominal() {
		
		assertEquals("Equilateral", Triclass.classify(5,5,5));
	}
	
	@Test
	public void Invalid_zero() {
		assertEquals("Not A traingle",Triclass.classify(5,5,0));
	}
	
	@Test
	public void Invalid_overMax() {
		assertEquals("Not A traingle",Triclass.classify(5,5,11));
	}
	
	
	@Test
	public void Invalid_inequality_theorem() {
		assertEquals("Not A traingle",Triclass.classify(5,5,12));
	}
	
	

}



/*

1-10 so lets test these values:
1, 10, 2, 9, 5

• Each time, you should fix two sides to the value 5, and change the
third side to different boundaries

 */
