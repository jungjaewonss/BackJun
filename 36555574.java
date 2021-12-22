import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	// 11 12345677342
		
		
		int a = sc.nextInt();
		String c = "";
		int sum = 0;
		String b = sc.next();
		for(int i = 0 ; i < a ; i++) {
			
			char [] d = new char[a];
			d[i] = b.charAt(i);
			
			sum = sum + Integer.parseInt(d[i]+"");
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
