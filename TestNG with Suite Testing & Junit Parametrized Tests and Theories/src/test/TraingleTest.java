package test;
import junit.framework.TestCase;
import main.Traingle;
import org.junit.Test;



//Q1
//s t1, t2, and t3 with
//the sides (3, 4, 5), (5, 4, 3), and (8, 5, 5),triangle


public class TraingleTest extends TestCase{

private Traingle t1;
private Traingle t2;
private Traingle t3;
private Traingle t4;
private Traingle t5;

public void setUp() {
t1 = new Traingle (3,4,5); 
t2 = new Traingle (5,4,3); 
t3 = new Traingle (8,5,5); 
t4 = new Traingle (3,4,100);
t5 = new Traingle (-3,4,5);
}


	//test triangle T1
	@Test (timeout=2500)
	public void testTraingle1(){
	double result = t1.calculateArea();
	assertEquals("results of t1", 6.0 , result);
	}

//test triangle T2
	@Test
	public void testTraingle2(){
	double result =  t2.calculateArea();
	assertEquals("result of t2",6.0 , result);

	}

	//test Triangle T3
	@Test
	public void testTraingle3(){
	double result= t3.calculateArea();
	assertEquals("result of t3", 12.0, result);
	}

//test whether T1=T2
//write only 1 test method
	@Test
	public void testEqual(){
	double result1 = t1.calculateArea();
	double result2 = t2.calculateArea();
	assertEquals("test t1 and t2",result1, result2);
	}
	
	
	//test Triangle t4
	@Test
	public void testTraingle4() {
	try {
		double result = t4.calculateArea();	}
	catch (RuntimeException e){
		fail();
	}
	//assertEquals(4, result);	

	}

	
	//test Triangle t5; negative 
	@Test
	
	public void testTraingle5() {
		try {
			double result = t5.calculateArea();	}
		catch (RuntimeException e){
			fail();
		}
}}

//https://www.guru99.com/junit-assert.html
//https://stackoverflow.com/questions/6028750/how-to-assert-an-actual-value-against-2-or-more-expected-values