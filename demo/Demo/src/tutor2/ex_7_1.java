package tutor2;

import java.util.Scanner;

public class ex_7_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = scanner.nextInt();
		System.out.print("Enter b : ");
		int b = scanner.nextInt();
		System.out.print("Enter c : ");
		int c = scanner.nextInt();
		System.out.print("Enter d : ");
		int d = scanner.nextInt(); 
		System.out.print("Enter e : ");
		int e = scanner.nextInt(); 
		System.out.print("Enter f : ");
		int f = scanner.nextInt(); 
		System.out.print("Enter g : ");
		int g = scanner.nextInt(); 
		System.out.print("Enter h : ");
		int h = scanner.nextInt(); 
		float result = a * ( b + -(c / d) / e) + (f - g % h);
		System.out.printf("Result = %.2f", result);
	}
}
