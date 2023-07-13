package main;

//q1
public class ArrayShift{

public int[] shiftOne (int[] inArray) {
int size = inArray.length; 



	int [] outArray= new int[size];
	outArray[0]= -1; 
	
	for (int i=1; i<size; i++) { //start at i=1 bc for index 0 we want -1
		outArray[i]= inArray[i-1];
	}

return outArray;	
}}


//https://www.freecodecamp.org/news/java-array-declaration-how-to-initialize-an-array-in-java-with-example-code/#:~:text=There%20are%20two%20ways%20you,the%20values%20in%20curly%20braces.
//dataType [] nameOfArray = new dataType [size]
//System.out.println (outArray);