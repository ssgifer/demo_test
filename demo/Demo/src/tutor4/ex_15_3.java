package tutor4;

public class ex_15_3 {
	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			int cal = (int)Math.pow(2, i);
			int sum = (int)(cal-1);
			System.out.print(sum + " " + "+" + " ");
		}
	}
}
