package main;

public class Triclass {
	
	public static String classify (int X, int Y,int Z){
		
	
   //first part checks for negative values or 0 values
   //2nd is triangle inequality theorem
	//lastly check if x,y,x is in the range between 1 and 10
		
	if (X <=0|| Y<=0 || Z<=0 || X + Y <= Z || X + Z <= Y || Y + Z <= X ||X < 1 || X > 10 || Y < 1 || Y > 10 || Z < 1 || Z > 10){
		return ("Not A traingle");
	}
	
	else {
		
		if (X==Y && Y==Z) {
			return ("Equilateral");
			
		}
		
		else if (X==Y ||Y==Z || X==Z ) {
			return ("Isosceles");
		}
		
		else {
			return ("Scalene");
		}
		
	}
	}}

	//https://en.wikipedia.org/wiki/Triangle_inequalitys

