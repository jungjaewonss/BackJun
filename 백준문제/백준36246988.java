import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int sum = a * b * c;    //354646
	String sum1 = sum+"";
	char [] ch = new char[sum1.length()];
	
	char [] v = {'0','1','2','3','4','5','6','7','8','9'};
	int [] count = {0,0,0,0,0,0,0,0,0,0};
	
	
	for(int i =0 ; i <  ch.length; i++) {
		ch[i] = sum1.charAt(i);
		
	}
	
	
	for(int i = 0 ; i < ch.length; i++) {
		for(int j = 0; j < v.length; j++) {
			if(ch[i] == v[j]) {
				count[j] = count[j]+1;
			}
		}
	}
	
	
	
	
	for(int i = 0 ; i < count.length; i++) {
		System.out.println(count[i]);
	}
	
		
	
	
	
	
	
	
	
		
	}

}
