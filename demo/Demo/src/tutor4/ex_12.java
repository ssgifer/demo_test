package tutor4;

import java.util.Scanner;

public class ex_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = scanner.nextInt();
		double c = 3.0; 
		for(c = 1.0; c <= n; c += 0.1) 
			System.out.println(c++); 
			c++; 
		for(int i = 6; i > n; i--) { 
			System.out.print(i); 
			System.out.print(n++); 
		}
	}
}
