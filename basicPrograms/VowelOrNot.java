package basicPrograms;
import java.util.Scanner;
public class VowelOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter");
		char a = scan.next().charAt(0);
		switch(a)
		{	
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(a+" is a vowel");
				break;
			default:
				System.out.println(a+"is not a vowel");
		}
	}

}
