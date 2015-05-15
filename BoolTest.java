//Demostrate boolean values.

class BoolTest{
	public static void main(String[]args){
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);
		
		//a boolean value can control the if statement
		if(b)
		System.out.println("This is executed.");
		
		//b = false;
		if(!b)//This statement is same as b = false;
		System.out.println("This is not executed.");
		
		//outcome of a relational operator is a boolean value
		String s = "false";
		boolean bn = Boolean.parseBoolean(s);
		System.out.println("The value of b is: " + bn);
		System.out.println("10 > 9 is " + (10 > 9));
	
	}
}