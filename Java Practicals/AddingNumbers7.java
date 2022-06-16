import java.util.*;

public class AddingNumbers7 {

public static void main(String[] args) {
	
		int b=Integer.parseInt(args[0]);

		Scanner sc=new Scanner (System.in);

		System.out.println("Please enter your numbers: ");
		int n=sc.nextInt();

	for(int i=0;i<b;i++)
	     {
	     n=n+i;
	     }
	System.out.println("Sum is "+n);
		
		
	}
}
	

