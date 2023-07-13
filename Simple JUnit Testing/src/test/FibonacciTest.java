package test;
import junit.framework.TestCase;
import org.junit.Test;
import main.Fibonacci;

public class FibonacciTest extends TestCase { 	//create using the junit option default; doesnt auto add Testcase
	
	//test dummy vars here
	int x=3;// =>3
	int y=4;// =>5
	int z=5; //8
	
	private Fibonacci fibo;

	public final void setUp() throws Exception {
		fibo = new Fibonacci();
	}

	//test fibbonaci value for n=3
	@Test
	public void test1() {
		int fib= fibo.fibonacci_iterative(x);
		assertEquals(3,fib);
		
	}
	//test fibbonaci value for n=4
	@Test
	public void test2() {
		int fib= fibo.fibonacci_iterative(y);
		assertEquals(5,fib);
		
	}
	
	//test fibbonaci value for n=5
	@Test
	public void test3() {
		int fib= fibo.fibonacci_iterative(z);
		assertEquals(8,fib);
		
	}
		
	//Test case to compare the first two values returning by the function to be the same.
	@Test
	public void test4() {
		int fib0=fibo.fibonacci_iterative(0);
		int fib1= fibo.fibonacci_iterative(1); 
		
		assertEquals(1, fib0);
	}
		
	
	

}
