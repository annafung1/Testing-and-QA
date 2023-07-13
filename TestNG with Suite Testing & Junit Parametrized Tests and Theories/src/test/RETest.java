package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import main.RE;

public class RETest {

	private RE phone_number;
	String String1 = "(123)123 - 1234";
	String String2 =  "(123) 456 - 7890";
	String String3 = "123 123 - 1234";
	String String4= " (223) 456 - 7890 ";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	RE phone_number= new RE();
		
	}

	@Test
	public void testNumber1() {
		
		boolean match =  phone_number.checkPhoneNumber(String1);
		assertTrue(match) ; 
	}
	
	@Test
	public void testNumber2() {
		
		boolean match =  phone_number.checkPhoneNumber(String2);
		assertTrue(match) ;
	}
	
	@Test
	public void testNumber3() {
		
		boolean match =  phone_number.checkPhoneNumber(String3);
		assertFalse(match) ;
		//assertTrue(match) ;
	}
	
	@Test
	public void testNumber4() {
		boolean match =  phone_number.checkPhoneNumber(String4);
		assertTrue(match) ;
	}

}
