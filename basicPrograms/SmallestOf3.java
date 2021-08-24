package basicPrograms;
import java.util.Scanner;
public class SmallestOf3 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scan.nextInt();
		System.out.println("enter 2nd value");
		int b = scan.nextInt();
		System.out.println("enter 3rd value");
		int c = scan.nextInt();
		System.out.println(a<b && a<c ? a+" is smaller":b<c? b+" is smaller":c+" is smaller");
		scan.close();
	}
}
