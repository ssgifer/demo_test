package tutor3;

import java.util.Scanner;

public class ex_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = scanner.nextInt();
		if(n > 0) {
			System.out.printf("Absolute %d = %d", n, n);
		}
		else {
			System.out.printf("Absolute %d = %d", n, n*(-1));
		}
	}
}
