package Assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("test");
		Scanner inputString = new Scanner(System.in);	
		System.out.println("Enter the string");
		String string = inputString.nextLine();
		

	//Approach 1: Using forLoop
	String rev="";
	
	for(int i=1;i<string.length();i++) {
		rev = string.charAt(i)+rev;
		
	}
	
	System.out.println("Reversed string :" + rev);
	
	inputString.close();
	
	//Approach 2: Using StringBuilder fuction
	String input = "Rajkumar";
	StringBuilder SB = new StringBuilder();
	SB.append(input);
	SB.reverse();
	System.out.println("Reversed string :" + SB);
	
	String in = new String("java");
	System.out.println(in);
	System.out.println("Length is" +input.length() );
    for(int i=input.length()-1; i>=0 ;i--){
        System.out.print(input.charAt(i));
    }
	}

}
