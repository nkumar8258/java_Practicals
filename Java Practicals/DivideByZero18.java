import java.util.*;
public class DivideByZero18 {

	public static void main(String[] args) {
        float a;
        int b;
        double c;
        
  
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Please  enter values of a and b");
     a=sc.nextInt() ;
     b=sc.nextInt();
     
     c=a/b;
     try {
     if(b==0) {
    	 throw new Exception();
    	 
     }
     else
     {
    	 System.out.println("The result a/b: "+c);
     }
     
     }
     catch(Exception e) {
    	System.out.println("In division denomenator as zero gives an undefined value"); 
     }
     
	}

}
