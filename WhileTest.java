/*
	This tests the for loop called
	"WhileTest"
*/

class WhileTest {

	static private String [] months = {"January", "February", "March", "April", "May", "June", 
										"July", "August", "September", "October", "November", "December"};
	public static void main(String[] args){
		int counter = 0;
		
		while(counter < months.length) {
			System.out.println();
			System.out.println(months[counter]);
			counter++;
		}
		
		//do{
			//System.out.println();
			//System.out.println(months[counter]);
			//counter++;
		//}while(counter < months.length);
	}
}