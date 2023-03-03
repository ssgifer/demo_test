package tutor3;

import java.util.Scanner;

public class ex_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = scanner.nextInt();
		float result = (float)(Math.sqrt(x));
		if(x > 0) {
			System.out.println(result);
		}
		else {
			System.out.println("Error");
		}
	}
}
