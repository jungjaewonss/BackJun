import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	
        Set set = new HashSet();	  
		
        for(int i = 0 ; i < 10; i++) {
            int a = sc.nextInt();
            
            set.add(a%42);
            
        	
        }
        
        System.out.println(set.size());
		
		
        	  
        	

          
              
	}
	}


