package loopingStatements;
import java.util.Scanner;
public class OddFromMToN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		for (int i = m ; i<=n ;i++)
		{
			if (i%2== 1) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
	}

}
