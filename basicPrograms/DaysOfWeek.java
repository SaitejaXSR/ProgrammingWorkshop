package basicPrograms;
import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day number..");
		int a = scan.nextInt();
		switch(a) {
		case 1 : System.out.println("MONDAY");
		case 2 : System.out.println("TUESDAY");
		case 3 : System.out.println("WEDNESDAY");
		case 4 : System.out.println("THURSDAY");
		case 5 : System.out.println("FRIDAY");
		case 6 : System.out.println("SATURDAY");
		case 7 : System.out.println("SUNDAY");break;
		default : throw new InvalidDayNumber();
		}
	}

}
