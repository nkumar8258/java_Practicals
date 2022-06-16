
import java.util.*;
public class NestedTry19 {
    public static void main(String [] args){
    	float a;
    	int b;
    	
        Scanner sc=new Scanner (System.in);
        
            System.out.println("Enter the First value : ");
            a=sc.nextInt();
            System.out.println("Enter the second value:");
            b=sc.nextInt();
            try{
            	if(b==0){
                throw new Exception();
            }
            try{
                if(a<0||b<0){
                    throw new Exception ();
                }
                float c=a/b;
                System.out.println("The division of given numbers is: "+c);
               }

               catch(Exception e){
                System.out.println("Please enter the positive values");
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("denomenator gives undefined value;please enter a nonzero value for denomenator");

        }
      
    }

}
