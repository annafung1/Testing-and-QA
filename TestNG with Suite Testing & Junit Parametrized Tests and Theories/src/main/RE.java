package main;
import java.util.*;

public class RE {
	public static boolean checkPhoneNumber(String s) {
		//return s.matches("(\\d{3}) \\d{3} - \\d{4}"); }// OG
		return s.replaceAll("\\s","").matches("^\\(\\d{3}\\)\\d{3}-\\d{4}$");
		}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String input = sc.nextLine();
        boolean wasPhoneNum = checkPhoneNumber(input);
        System.out.println("\nThat was"+(wasPhoneNum? "" : "n't")+" a phone number."); 
    }
}





//A regular expression is a sequence of characters that forms a search pattern. 
//When you search for data in a text, you can use this search pattern to describe what you are searching for
//application: Regular expressions can be used to perform all types of text search and text replace operations.


//metachar in https://www.w3schools.com/java/java_regex.asp 
// \d means find a digit 
//^ --> begining of string
// $ -->end of string
// \s -->white space --> https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
// quantifiers:  ie n{x,} --> Matches any string that contains a sequence of at least X n's


//https://www.baeldung.com/java-regex-validate-phone-numbers 
//double slash?? //lol why does it work?? did w3 fail me>?>>



