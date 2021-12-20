import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
  
		int a = sc.nextInt();
		int sum = 0;
		int count = 0;
		String [] s = new String [a];
		int [] ss = new int [a];
		
		for(int i = 0; i < a ; i++) {
			sum = 0;
			count = 0;
			String Input = sc.next();
			s[i] = Input;
          for(int j = 0; j < s[i].length(); j++) {
        	   if((s[i].charAt(j)+"").equalsIgnoreCase("o")) {
        		            count++; 
        		            sum = sum+ count;
        		            
        	   }                  
        	   else if((s[i].charAt(j)+"").equalsIgnoreCase("x")) {
        		   count = 0;
        	   }
        	     
          }
           ss[i] = sum;                                               
		}                                                             
		
		for(int i = 0; i < a ; i++) {
			 System.out.println(ss[i]);
		}
		
      
              
	}
	}


