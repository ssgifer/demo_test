package tutor2;

import java.util.Scanner;

public class ex_7_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter k : ");
		int k = scanner.nextInt();
		System.out.print("Enter w : ");
		int w = scanner.nextInt();
		System.out.print("Enter x : ");
		int x = scanner.nextInt();
		System.out.print("Enter y : ");
		int y = scanner.nextInt();
		System.out.print("Enter z : ");
		int z = scanner.nextInt();
		float cal = (float)((1 - x % 2.5 + y * z) + 3 * k - -7 / w);
		System.out.printf("Cal = %.2f" ,cal);
	}
}
