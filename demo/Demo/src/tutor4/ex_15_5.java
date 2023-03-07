package tutor4;

public class ex_15_5 {
	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			if(i%2 == 1){
			int cal = (int)Math.pow(2, i);
			int sum = (int)(cal-1);
			System.out.print(sum + " " + "+" + " ");
		}
	}
}
}
