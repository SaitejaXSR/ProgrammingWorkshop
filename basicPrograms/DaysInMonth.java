package basicPrograms;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number");
		int a = scan.nextInt();
		switch(a) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12: System.out.println("month "+a+" has 31 days");break;
		case 4 :
		case 6 :
		case 9 :
		case 11: System.out.println("month "+a+" has 30 days");break;
		case 2 : System.out.println("month "+a+" has 28 days");break;
		default : throw new InvalidMonthNumber();
		}
		scan.close();
	}
}
