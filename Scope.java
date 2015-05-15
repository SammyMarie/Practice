//This test variable scope

class Scope {
	public static void main(String[]args){
		int x; // known to all code within main
		
		x = 10;
		if(x == 10){
			int y = 20; //Known only in this block
			
			//x and y are both known
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		
		}
		System.out.println("x is " + x);
		
		for(x = 0; x < 3; x++){
			int y = -1;
			System.out.println(" y is: " + y);
			y = 100;
			System.out.println("y is now: " + y);
		
		}
		System.out.println("x is " + x);
	
	}
}