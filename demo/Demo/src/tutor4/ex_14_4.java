package tutor4;

import java.util.Scanner;

public class ex_14_4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter A : ");
	int a = scanner.nextInt(); 	
	System.out.print("Enter B : ");
	int b = scanner.nextInt(); 	
	int sum = 0; 
	int i = 1;
	while(i<=b) {
		sum += a;
		i++;
	}  
	System.out.println(sum);	
	}
}
