package test;


import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import main.PrimeNumberChecker;


//Part 2 Q2

//check : {2, 6, 19, 22, 23}


@RunWith (Parameterized.class)
public class PrimeNumberCheckerTest {
	
//vars
private int n;
private boolean expected_val; 

	
//constructor

public PrimeNumberCheckerTest(int n, boolean expected_val) {
	this.n=n;
	this.expected_val= expected_val;
	
}


	
//method w array
@Parameterized.Parameters //(name= "{index}: isValid({0})={1}")
public static Iterable<Object[]>data(){
	return Arrays.asList(new Object[][]{
		 {2, true},
		 {6, false},
		 {19, true},
		 {22, false},
		 {23, true}}
			 
			
	);}

@Test
public void testisPrime() throws Exception {
	PrimeNumberChecker actual= new PrimeNumberChecker();
	
	Assert.assertEquals(expected_val, actual.isPrime(n)); 
	//recall: assert equals is static, must use Assert.assertEquals for method 
	
}
	
}




