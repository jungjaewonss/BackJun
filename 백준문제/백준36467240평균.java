import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
   int max = 0;
	double sum = 0;
	double sum1 = 0;
	
      int c = sc.nextInt();
      int [] b = new int [c];
      int [] d = new int [c];
      for(int i = 0 ; i < c ; i++) {
    	  int s = sc.nextInt();
    	  b[i] = s;  
      }
      
      
      for(int i = 0 ; i < b.length; i++) {
    	  max = b[i];
    	 for(int j = 0 ; j < b.length ; j++) {
    		 if(max < b[j]) {
    			 max = b[j];
    		 }
    	 }
    	
    	
    	 
      }
     
     
		
        	        
        	
   
          for(int i = 0  ; i < b.length ; i++) {
        	  
        	  sum = (b[i] * 100.0) / max;
        	  sum1 = sum1 + sum;
          }
          
          System.out.printf("%f",sum1/c);
      
              
	}
	}


