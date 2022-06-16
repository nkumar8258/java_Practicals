import java.util.Scanner;
public class Binary5 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		
		System.out.println("Please enter the number to be converted in Binary: ");
        int num =Sc.nextInt();
		
        System.out.println("Conversion of given number in Binary is: "+Integer.toBinaryString(num));
	}

}
