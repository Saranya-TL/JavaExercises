package Assignments.ex_5232024;

public class PrintMyBook extends Book{
	
	PrintMyBook(String name, String author, int price){

		System.out.println(name + author + price);

	}

	@Override
	void getDetails(String name, String author, int price) {
		name = "Horry Potter";
		author = "JK.Bowling";
		price = 120;
		System.out.println(name +  author + price );

		
		
	}

	
	
}
