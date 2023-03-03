package tutor3;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter s : ");
		int s = scanner.nextInt();
		if(s >= 40) 
			System.out.println("1"+s); 
		else { 
			System.out.println("0"); 
			System.out.println(++s); 
		} 
		if(s >= 90) 
			System.out.println(s++); 
		else 
			System.out.println(++s); 
			System.out.println(--s);
	}
}
