package tutor3;

import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("Positive Number");
		}
		else if(num == 0) {
			System.out.println("Zero Number");
		}
		else {
			System.out.println("Negative Number");
		}
	}
}
