package tutor3;

import java.util.Scanner;

public class ex_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		if(n < 50) 
			System.out.println("1"+n); 
			System.out.println(n++); 
		if(n <= 75) 
			System.out.println("3"); 
		if(n >= 100) { 
			System.out.println(n--); 
			System.out.println(--n); 
		} 
		System.out.println(n++);
	}
}
