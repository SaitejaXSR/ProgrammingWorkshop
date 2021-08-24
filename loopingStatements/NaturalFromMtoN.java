package loopingStatements;
import java.util.Scanner;
public class NaturalFromMtoN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the starting range number");
		int m = scan.nextInt();
		System.out.println("enter the ending range number");
		int n = scan.nextInt();
		for(int i = m; i<=n;i++)
		{
			System.out.println(i);
		}
	}
	

}
