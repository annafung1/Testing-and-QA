package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import main.Q2; 

import org.junit.BeforeClass;
import org.junit.Test;

public class Q2Test extends TestCase{
	
	   
    public static void main(String args[]) {
        junit.textui.TestRunner.run(Q2Test.class);
    }
	
	



	@Test
	public void test1() {
	int a=2;
	int b=3; 
		Q2 result1= new Q2(); 
		result1.func(a,b);
	
	}
	
	@Test
	public void test2() {
	int a=3;
	int b=2; 
		Q2 result2= new Q2(); 
		result2.func(a,b);
	
	}
	@Test
	public void test3(){
		int a =3,b=3;
		Q2 result3= new Q2(); 
		result3.func(a,b);
		
		
	}
	



}
