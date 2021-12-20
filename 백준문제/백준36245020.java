import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
	
	int [] b = new int[9];
	int max = Integer.MIN_VALUE;
	int index = 0;
	for(int i = 0 ; i < 9 ; i++) {
		int c = sc.nextInt();
		
		b[i] = c;
		if(b[i] > max) {
			max = b[i];
		}
		
		
	}
	System.out.println(max);
	for(int i = 0; i < 9 ; i++) {
		if(b[i] != max) {
			index++;
		}
		else if (b[i] == max) {
			System.out.println(index+1);
		}
		
	}
	
		
		
	}

}