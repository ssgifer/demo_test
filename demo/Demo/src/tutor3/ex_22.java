package tutor3;

import java.util.Scanner;

public class ex_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter i : ");
		int i = scanner.nextInt();
		if(i <= 10) {
			System.out.println(i += 1);
			
		}
		else {
			System.out.println("Error");
		}
	}
}