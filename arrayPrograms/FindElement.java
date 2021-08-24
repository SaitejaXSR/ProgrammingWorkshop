package arrayPrograms;
import java.util.Scanner;
public class FindElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length ; i++) {
			a[i] = scan.nextInt();			
		}
		System.out.println("enter the number to find its position");
		int findNum = scan.nextInt();
		boolean isPresent = false;
		for(int i = 0; i<a.length; i++) {
			if(findNum == a[i]) {
				isPresent = true;
			}
			if(isPresent== true) {
				System.out.println(findNum+" is present at "+i+" index");
				break;
			}
			else {
				System.out.println(findNum+" is not present in the array");
				break;
			}
		}
		scan.close();
	}

}
