package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import main.PrimeNumberChecker;


@RunWith(Theories.class)
public class TheoryPrimeNumberCheckerTest {

	@DataPoints
	public static int [] testvals() {
		return new int [] {2, 6, 19, 22, 23};	
	}
		 
		
	
	@Theory	
	public void testPrimeNumCheck(int n ) {
		Assume.assumeTrue (n>1);
		   if (n == 2 || n == 19 ||n==23) {
	            assertTrue(PrimeNumberChecker.isPrime(n));
	        } else {
	            assertFalse(PrimeNumberChecker.isPrime(n));
	        }
	   
	}}
