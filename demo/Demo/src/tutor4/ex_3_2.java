package tutor4;

public class ex_3_2 {
	public static void main(String args[]) {
		int a = 0;
        int b = 10;
        int cal = (b - a + 1) + a;
        for (int i = 0; i < 10; i++) {
        int rand = (int)(Math.random() * cal);
        	System.out.println(rand);
        	if(rand == 5) {
        		break;
        	}
        }
    }
}
