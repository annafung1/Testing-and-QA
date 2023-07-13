package test;


//Part 2: Q1 

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import main.Fibonacci;


@RunWith (value = Parameterized.class)
public class FibonacciTest {
private int n;
private int result;
private Fibonacci fibo; 

//constructor
public FibonacciTest(int n, int result) {
	this.n= n; 
	this.result=result; 
}

@Before
public void Initialize() {
	fibo = new Fibonacci(); 
}

	
//method w/ array
@Parameterized.Parameters
public static Iterable<Object[]> data() {
	return Arrays.asList(new Object[][]{  //must use .asList
		
		{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {9, 34}});
}	
	
	
@Test
public void testFibonacci() throws Exception{
	
	int actual = fibo.compute(n) ;
	assertEquals(result,actual );
}
}
	
	/*Write a testing program for the above Fibonacci program to test the
computation of the first 10 Fibonacci numbers (index from 0 to 9) using
//parameterized testing with constructor*/

//example: https://www.guru99.com/junit-parameterized-test.html
	
	

