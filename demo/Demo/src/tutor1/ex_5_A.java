package tutor1;

import java.util.Scanner;
public class ex_5_A {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		while(x<100) {
			if(x!=0) {
				System.out.println("result = " +x);
			}
			else {
				System.out.println("error");
			}
			x++;
		}
	}
}