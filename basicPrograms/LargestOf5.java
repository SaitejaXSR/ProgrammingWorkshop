package basicPrograms;
import java.util.Scanner;
public class LargestOf5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scan.nextInt();
		System.out.println("enter 2nd value");
		int b = scan.nextInt();
		System.out.println("enter 3rd value");
		int c = scan.nextInt();
		System.out.println("enter 4th value");
		int d = scan.nextInt();
		System.out.println("enter 5th value");
		int e = scan.nextInt();
		int var = a>b && a>c && a>d && a>e ? a : b>c && b>d && b>e? b : c>d && c>e?
				c : d>e? d: e;
		System.out.println(var+" is greater");
	}
}
