package tutor4;

import java.util.Scanner;

public class ex_14_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter factorial : ");
		int f = scanner.nextInt(); 	
		int i=1, fact=1;  
		while(i <= f ){  
            fact = fact * i;   
            i++;  
        }     
        System.out.println(fact);  
	}
}
