package tutor4;

import java.util.Scanner;

public class ex_14_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N : ");
		int n = scanner.nextInt();
		int sum=0, tmp=0;
		int i = 1;
		while(i<=n){
			tmp = sum;
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
