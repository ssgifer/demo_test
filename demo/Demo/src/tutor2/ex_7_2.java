package tutor2;

import java.util.Scanner;
import java.math.*;

public class ex_7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = scanner.nextInt();
		System.out.print("Enter y : ");
		int y = scanner.nextInt();
		float result = (float) ((1.0/2.0) * Math.sin(x - Math.PI/Math.sqrt(y)));
		System.out.printf("Result = %.2f" ,result);
	}
}