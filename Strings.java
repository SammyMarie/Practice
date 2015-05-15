/* This is a class that utilizes the .equals() within the 
* String class and the .toCharArray()
*/

public class Strings {
	public static void main(String... args){
		String str = "Welcome to my world!";
		String str1 = new String("WELCOME to my World!  ");
	
		
		if(str.equals(str1)){
			System.out.println("They match!");
		}else if(str.equalsIgnoreCase(str1)){
			System.out.println("They match regardless!");
		}else{
			System.out.println("They don't match!");
		}
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.append(" Only if you're married though \\:-p");
		System.out.println(sb);
		
		int pos = sb.indexOf("world");
		System.out.println("What is the length of this Statement: " + sb.length());
		System.out.println(pos);
		System.out.println(sb.substring(11));
		System.out.println(str1.trim());
		
		
		char [] c = str.toCharArray();
		
		for(char var : c){
			System.out.println(var);
		}
	
	}
}