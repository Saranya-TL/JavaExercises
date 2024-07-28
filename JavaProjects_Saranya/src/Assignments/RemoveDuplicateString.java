package Assignments;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String input = "Hello World";
		
		StringBuilder result = new StringBuilder();
		
		
		for(int i=0; i<input.length();i++) {
			char c = input.charAt(i);
			
			for(int j=0;j<input.length();j++) {
				char d = input.charAt(j);
				
				if(c == d){
					result.deleteCharAt(c);
					
					
				}
				System.out.println("Word after removing duplicate string" + c);
				
				
			}
			
			
		}

	}

}
