package tutor2;

public class ex_11 {
	public static void main(String args[]) {
		int a = 1;
        int b = 500;
        int cal = (b - a + 1) + a;
        for (int i = 0; i < 10; i++) {
        int rand = (int)(Math.random() * cal);
        	System.out.println(rand);
    }
}
}