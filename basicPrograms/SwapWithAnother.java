package basicPrograms;
import java.util.Scanner;
public class SwapWithAnother {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number to swap");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd number to swap");
		int b = scan.nextInt();
		System.out.println("======BEFORE SWAPPING======");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("=====AFTER SWAPPING=====");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		scan.close();
	}
	
}
