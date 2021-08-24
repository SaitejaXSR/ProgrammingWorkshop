package basicPrograms;
import java.util.Scanner;
public class LargestOfThreeNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a = scan.nextInt();
		System.out.println("enter the 2nd number");
		int b = scan.nextInt();
		System.out.println("enter the 3rd number");
		int c = scan.nextInt();
		System.out.println(a>b && a>c ? a+" is greater":b>c?b+" is greater":c+" is greater");
		}
	}

