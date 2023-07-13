package main;

public class Fibonacci {
	
	int prev=1; 
	int current=1;
	int fib; 
	int i=2;
	
	public int fibonacci_iterative (int n) {
		
		switch(n) { 
		case 0: return 1;
		case 1: return 1;
		}
		
		while(i<=n) {
		fib= prev+current; 
		prev=current;
		current=fib;
		i++;
		}
	return fib;	}
	
}


///n=2 then prev=1 and current =1; fib=2 ; make prev= current=1 and current=fib=2
//n=3 then prev=1 curr=2 fib=>3
//n=4 curr=3. prev=2 and then fib=5

//https://stackoverflow.com/questions/10873590/using-switch-statement-with-a-range-of-value-in-each-case