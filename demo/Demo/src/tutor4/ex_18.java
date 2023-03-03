package tutor4;

import java.util.Scanner;

public class ex_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number : ");
		int n = in.nextInt();
	    boolean flag = false;
	    for (int i = 2; i<=(n/2); ++i) {
	    	if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	    	System.out.println(n + " is a prime number");
	    }
	    else {
	    	System.out.println(n + " is not a prime number");
	  }
	}
}
