package tutor4;

import java.util.Scanner;

public class ex_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Base10 : ");
		int base10 = scanner.nextInt();
		if( base10 > 0 ) {
	        String base2 = Integer.toString(base10, 2);
	        System.out.printf( "%s", base2);
		}
	}
}
