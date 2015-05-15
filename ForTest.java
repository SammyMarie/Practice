/*
	This tests the for loop called
	"ForTest"
*/

class ForTest {

	static private String [] months = {"January", "February", "March", "April", "May", "June", 
										"July", "August", "September", "October", "November", "December"};
	public static void main(String[] args){
		
		//for(int x = 0; x < months.length; x++) {//This creates new counters through the loop
		//	System.out.println();
		//	System.out.println(months[x]);
		//}
		
		for(String month : months){//This creates new objects through the loop
			System.out.println();
			System.out.println(month);
		}
	}
}