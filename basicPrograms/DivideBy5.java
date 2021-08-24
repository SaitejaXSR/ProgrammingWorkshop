package basicPrograms;
import java.util.Scanner;
public class DivideBy5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int a = scan.nextInt();
		System.out.println(a%5 == 0? a+" is divisible by 5": a+" is not divisible by 5");
		
	}

}
