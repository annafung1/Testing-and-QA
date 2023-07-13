package test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import main.Fibonacci; 


@RunWith (Theories.class)
public class TheoryFibonacciTest {
	
	
	@DataPoints
	public static int [] val() {
		return new int [] {0,-1,1,2,3,4,5,6,7,8,9};
	}
	
	
	@Theory
	public void FibTest(int n) {
		
		Assume.assumeTrue(n>1);
		assertEquals(Fibonacci.compute(n - 1) + Fibonacci.compute(n - 2), Fibonacci.compute(n));
		//assertTrue(Fibonacci.compute(n - 1) + Fibonacci.compute(n - 2) == Fibonacci.compute(n));
	}
}


