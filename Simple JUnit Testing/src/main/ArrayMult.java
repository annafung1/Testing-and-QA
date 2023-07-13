package main;

//q2
public class ArrayMult {

	public int[] mult(int[] array1, int[] array2) {
		int i,j;
		int length1= array1.length;
	    int length2=array2.length;
	    int maxlen;
	    int minlen; 
	    int[] longArray; 
	   
	    if (length1>length2) { 
	    	longArray=array1; //array1 is longer 
	    	maxlen=length1;	
	    	minlen=length2; 
	    }
	    else if (length2>length1){
	    	longArray=array2; //array 2 is longer
	    	maxlen= length2; 
	    	minlen=length1; 
	    }
	    else {
	    	maxlen=minlen=length2; //or length1, don't matter 
	    	longArray=array2;//don't matter if 1 or 2
	    }

	    int [] outArray = new int [maxlen]; 
	    
	    for (i=0; i<length1;i++) {
	    	if(array1[i]<0) {
	    		throw new IllegalArgumentException("Contains a negative integer in Array 1"); 	
	    	}
	    }
	    
	   
	    for (i=0; i<length2;i++) {
	    	if(array2[i]<0) {
	    		throw new IllegalArgumentException("Contains a negative integer in Array 2"); 	
	    	}
	    }
	    
	   

	    for( i = 0; i < maxlen; i++){
	        if( i < minlen) {
	            outArray[i] = array1[i] * array2[i];
	        } else {
	            outArray[i] = longArray[i];
	        }
	    }
	    
		return outArray; 
	}	
}

//careful don't return -1. Java sees that as a number. C man instincts
//https://stackoverflow.com/questions/35604342/im-trying-to-add-a-try-catch-that-tells-the-user-they-cant-plug-in-negative-numb

