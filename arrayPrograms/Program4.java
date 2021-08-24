package arrayPrograms;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the size of the array : ");
		int size = scan.nextInt();
		
		int[] a = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("the values in the array of size "+size+" :");
		for(int i = 0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
	}
}
