package tutor3;

import java.util.Scanner;

public class ex_23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA : ");
		float gpa = scanner.nextFloat();
		if(gpa >= 2.00) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Retire");
		}
	}
}
