package main;

public class PrimeNumberChecker {
 	
	public static boolean isPrime(int n) {
		
		if (n<=1) {
		return false;		
		}
		
		for (int i=2; i<=n/2;i++) //keep dividing by 2

			if (n %i==0) {
				return false; //basically check if remainder is zero; if it is, then it isnt prime 
			}
	
return true;
}}
