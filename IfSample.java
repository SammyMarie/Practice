/*
	This example demonstrates the use of the
	if statement
	IfSample 

*/

class IfSample {
	public static void main(String... args) {
		
		int x, y;
		
		x = 10;
		y = 20;
		String month = "May";
		
		if(month.equals("May"))
			System.out.println("It's the fifth month!");
		
		if(x < y)
			System.out.println("x is less than y");
		
		x = x * 2;
		if(x == y)
			System.out.println("x is now equal to y");
			
		x = x * 2;
		if(x > y)
			System.out.println("x is now greater than y");
			
		//this shouldn't show anything
		if(x == y)
			System.out.println("you won't see this");
	
	}
}