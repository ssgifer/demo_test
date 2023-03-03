package tutor3;

import java.util.Scanner;

public class ex_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Day : ");
		int d = scanner.nextInt();
		System.out.print("Month : ");
		int m = scanner.nextInt();
		System.out.print("Year : ");
		int y = scanner.nextInt();
		int noob = (int)((((Math.sqrt(d)) + (Math.sqrt(m)) + (Math.sqrt(y))) % 4) + 1);
		if(noob == 1) {
			System.out.printf("NoobLevel %d : Noob  ", noob);
		}
		else if(noob == 2) {
			System.out.printf("NoobLevel %d : Father Noob  ", noob);
		}
		else if(noob == 3) {
			System.out.printf("NoobLevel %d : God Noob  ", noob);
		}
		else if(noob == 4) {
			System.out.printf("NoobLevel %d : Hof Noob  ", noob);
		}
	}
}
