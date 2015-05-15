import java.io.*;

public class SwitchEx {

	public static void main(String... args) {
	
		String input = getInput("Enter a Number between 1 and 12: ");
		int month = Integer.parseInt(input);
		
		switch (month){
			case 1:
				System.out.println("This month is January");
				break;
			
			case 4:
				System.out.println("This month is April");
				break;
				
			case 3:
				System.out.println("This month is March");
				break;
			default:
				System.out.println("You've chosen another month");
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