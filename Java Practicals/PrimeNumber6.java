import java.util.Scanner;
public class PrimeNumber6 {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Please enter the number: ");
	
	int num=Sc.nextInt();
	try {
		if(num<0) {
			throw new Exception();
		}
		int p=0;
		if(num==1) {
			p=1;
		}
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				p=1;
				break;
			}
			
		}
		if(p==0) {
			System.out.println("The given number"+num+"is a prime number");
		}
		else {
			System.out.println("The given number"+num+"is not a prime number");
		}
	}
	catch(Exception e) {
		System.out.println("Your input number shouldnot be negative");
	}
	}

}
