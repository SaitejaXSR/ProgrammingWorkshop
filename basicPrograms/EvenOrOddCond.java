package basicPrograms;
import java.util.Scanner;

public class EvenOrOddCond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scan.nextInt();
		System.out.println(a%2 == 0 ? a+" is even" : a+" is odd");
	}

}
