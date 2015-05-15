import java.io.*;

public class Calculator1 {

	private static double addValues(String s1, String s2) throws NumberFormatException {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
	}
	private static double addMultiple(double... values){//The values are passed an array
		double result = 0d;
		for(double d : values)
			result += d;
		
		return result;
	}
	
	private static String getInput(String prompt){//This method receives the input from the user 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		try {
			return br.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
	
	public static void main(String... args){
		String s1 = getInput("Enter Number One: ");
		String s2 = getInput("Enter Number Two: ");
		double result = addValues(s1, s2);
		
		System.out.println("The result is: " + result);
		
		double resultForVar = addMultiple(1, 2, 3, 10, 9);
		System.out.println("The result for Multiple Values: " + resultForVar);
	}
}