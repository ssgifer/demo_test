package tutor3;

import java.util.Scanner;

public class ex_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A : ");
		int a = scanner.nextInt();
		System.out.print("Enter B : ");
		int b = scanner.nextInt();
		if(a > b) {
			System.out.printf("A More than B");
		}
		if(a < b) {
			System.out.printf("A Less than B");
		}
	}
}
