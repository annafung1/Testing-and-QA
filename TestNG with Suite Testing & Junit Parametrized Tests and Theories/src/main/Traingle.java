package main;

public class Traingle{
	 public int side1, side2, side3;
	 public Traingle(int side1, int side2, int side3) {
	 this.side1 = side1;
	 this.side2 = side2;
	 this.side3 = side3; }
	public double calculateArea () {
	 //Heron's Formula for area of a triangle
	// double s = (side1 + side2 + side3) * 0.5; //OG
	 double s = (side1 + side2 + side3) / 2; //corrected
	 System.out.println("\t s=" + s);
     double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); //corrected
	 //double result = Math.sqrt(s * (side1 - s) * (side2 - s) * (side3 - s)); //OG
	 System.out.println("\t result=" + result);
	 return result; }
 }
	
	
	
	

