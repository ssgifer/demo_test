package tutor2;

import java.util.Scanner;

public class ex_12_Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		String string = scanner.next();
		String reversedStr = " ";
	    //System.out.println("Original number : " + string );
	        
	    for (int i = 0; i < string.length(); i++) {
	    	reversedStr = string.charAt(i) + reversedStr;
	    }
	    System.out.println("Reversed number : "+ reversedStr);		
	}
}
