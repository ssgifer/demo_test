package tutor3;

import java.util.Scanner;

public class ex_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = scanner.nextInt();
		if((n%2) == 1) {
			System.out.println("is odd number");
		}
		else {
			System.out.println("is even number");
		}
	}
}
