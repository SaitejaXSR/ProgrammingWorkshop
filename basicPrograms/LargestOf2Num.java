package basicPrograms;
import java.util.Scanner;
public class LargestOf2Num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = scan.nextInt();
		System.out.println("enter the 2nd number");
		int b = scan.nextInt();
		if (a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
		
		
		
		
	}

}
 