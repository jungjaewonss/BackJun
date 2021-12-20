import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-gen

		
		
		Scanner sc = new Scanner(System.in);
		
	int a = sc.nextInt(); int b = sc.nextInt();
	
	
		if(b < 45 && a!=0) {
			 b =(b-45) + 60;
			a--;
			System.out.println(a + " " + b);
			
		}
		
		else if(b >= 45) {
			System.out.println(a + " " + (b - 45));
		}
		              //b 30
		else if(a == 0 && b < 45) {
			
			
			a = 23;
			b = (b-45) + 60;
			System.out.println(a + " " + b);
			
		}
		
		
		
		
		
	}
}
