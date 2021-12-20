import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-gen

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int A =0; int B =0;
	
	for(int i = 1; i <= T; i++) {
		A = sc.nextInt();
		B = sc.nextInt();
		if(A > 0 && B < 10) {
			System.out.println("Case #"+i+": "+(A+B));	
		}
		
	}
	
		
	}
	
}
