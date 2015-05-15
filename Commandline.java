import java.math.BigDecimal; 

public class Commandline{

	public static void main(String... args){
		System.out.println("Number of args: " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		char [] ch = {'H', 'e', 'l', 'l', 'o', '!'};
		String s = new String(ch);
		System.out.println(s);
		
		double dValue = 3.99;
		Double doubleObj = new Double(dValue);
		int intResult = doubleObj.intValue();
		System.out.println("Integer Value is: " + intResult);
		
		double d = 1115.737;
		String ds = Double.toString(d);
		BigDecimal bd = new BigDecimal(ds);
		System.out.println("The Numeric Value is: " + bd.toString());
	}
}