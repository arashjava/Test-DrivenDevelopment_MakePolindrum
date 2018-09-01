package palindrum;

import java.util.function.BooleanSupplier;

import javax.swing.text.MaskFormatter;

public class Polindrum {
	private String str;
	
	public Polindrum(String str) {
		this.str= str;
	}
	
	public Polindrum() {
	}

	public static void main(String[] args) {
		String str="1444";
		
		if (isPolindrum(str)) System.out.println(str + " is polindrum");
		else {
            System.out.println(str + " is not polindrum.");
			System.out.println("making it polindrum ... ");
			String result=makePolindrum(str);
			if (isPolindrum(result)) System.out.println(result + " is polindrum now.");
			else {
			   System.out.println(result + " is not polindrum either.");
			}
		}
	}
	
	public static String reverse(String string) {
		
		int len= string.length();
		char[] strChar= string.toCharArray();    // convert string to character
		char[] reverseChar= new char[len];
		
		for (int i = 0; i < len; i++) {
			reverseChar[i]= strChar[len-i-1]; 
		}
		return String.valueOf(reverseChar);
	}

	public static boolean isPolindrum(String string) {
		if (string.equals(reverse(string))) return true;
		return false;
	}


	public static String makePolindrum(String string) {
		int number= Integer.valueOf(string);
		int reverse= Integer.valueOf(reverse(string));
		String result= String.valueOf(number+reverse);
		return result;
	}
}
