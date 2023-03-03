package tutor4;

import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N : ");
		int n = scanner.nextInt();
		int sum=0, tmp=0;
		for(int i=1; i<=n; i++) {
			tmp = sum;
			sum += i;
		}
		System.out.println(sum);
	}
}
