package basicPrograms;
import java.util.Scanner;
public class SmallestOf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = scan.nextInt();
		System.out.println("enter the 2nd number");
		int b = scan.nextInt();
		if (a<b)
			System.out.println(a+" is smaller than "+b);
		else
			System.out.println(b+" is smaller than "+a);
		scan.close();
		
	}

}
