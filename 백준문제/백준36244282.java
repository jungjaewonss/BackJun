import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a = sc.nextInt();
		int [] c = new int [a]; 
		for(int i = 0 ; i < a ; i++) {
			int b = sc.nextInt();
			c[i] = b;
			
			if(c[i] > max) {
				max = c[i];
			}
			if(c[i] < min) {
				min = c[i];
			}
		}
		System.out.println(min + " " + max);
		
		
		
	}

}