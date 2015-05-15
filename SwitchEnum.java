import java.io.*;

public class SwitchEnum {

	public static void main(String... args) {
	
		//String input = getInput("Enter a Number between 1 and 12: ");
		//int month = Integer.parseInt(input);
		
		Month month = Month.MAY;
		
		switch (month){
			case JANUARY:
				System.out.println("This is the first month");
				break;
			
			case AUGUST:
				System.out.println("This is the eight month");
				break;
				
			case MAY:
				System.out.println("This is the fifth month");
				break;
			default:
				System.out.println("Please choose another month");
				break;
		
		}
	}
	
		private static String getInput(String prompt){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		try {
			return br.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}