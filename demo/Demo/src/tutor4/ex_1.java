package tutor4;

import java.util.Scanner;

public class ex_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N : ");
		int n = scanner.nextInt();
		int i = 0, j = 5; 
		while (i <= n) { 
			System.out.println(n++); 
			i = i + 2; } 
		while (j > n) { 
			System.out.println(--j); 
			j--; 
		}
	}
}
