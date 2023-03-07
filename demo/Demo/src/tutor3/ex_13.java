package tutor3;

import java.util.Scanner;

public class ex_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Student ID : ");
		String inid = scanner.nextLine();
		String last2D = " " + Character.toString(inid.charAt(8)) + Character.toString(inid.charAt(9));
		String first2D = " " + Character.toString(inid.charAt(0)) + Character.toString(inid.charAt(1));
		char digit3 = inid.charAt(2);
		if(inid.length() != 10) {
			System.out.println("Invalid ID");
		}
				
		//Eng Student		
		if(last2D.equals("21")) {
			System.out.println("Engineer Student");
		}
		else {
			System.out.println("Unknown Student");
		}
		
		//level
		if(digit3 == '3') {
			System.out.println("Undergraduate");
		}
		else if (digit3 == '7') {
			System.out.println("Graduate");
		}
		else {
			System.out.println("Unknown Levels");
		}    
		
		//year
		if (first2D.equals("52")) {
			System.out.println("1 (Freshmen)");
		}
		else if (first2D.equals("53")) {
			System.out.println("2 (Sophomore)");
		}
		else if (first2D.equals("54")) {
			System.out.println("3 (Junior)");
		}
		else if (first2D.equals("55")) {
			System.out.println("4 (Senior)");
		}
		else {
			System.out.println("4 (Super Senior)");
		}
	}
}
