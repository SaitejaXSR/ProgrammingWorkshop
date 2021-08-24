package basicPrograms;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = scan.nextInt();
		
		if (a%2 ==0)
		{
			System.out.println(a+ " is even number");
		}
		else
		{
			System.out.println(a+ " is odd number");
		}
	}	

}
