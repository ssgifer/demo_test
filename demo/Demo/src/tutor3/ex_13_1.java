package tutor3;

import java.util.Scanner;

public class ex_13_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("R1 : ");
		int r1 = scanner.nextInt(); 	
		System.out.print("R2 : ");
		int r2 = scanner.nextInt(); 	
		System.out.print("R3 : ");
		int r3 = scanner.nextInt(); 
		System.out.print("Type : ");
		int type = scanner.nextInt();
		float rtotal = 0;
		if(type == 1) {
			rtotal = r1+r2+r3;
			System.out.println("RTotal = " + rtotal + "k");
			}
		if(type == 2) {
			double cal = (1/r1)+(1/r2)+(1/r3);
			rtotal = (float) (1/cal);
			System.out.println("RTotal = " + rtotal + "k");
		}
		if((type != 1)&&(type != 2)) {
			System.out.printf("Incorrect Circuit Type");
		}
	}
}
