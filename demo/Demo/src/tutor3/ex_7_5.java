package tutor3;

public class ex_7_5 {
	public static void main(String[] args) {
		int x = 9;
		if((x++ == 9) && (--x == 9) && (x == 9)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
