package basicPrograms;
import java.util.Scanner;
public class DayNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day of week");
		String a = scan.nextLine();
		switch(a) {
		case "sunday":
			System.out.println(a+" ==> 1 ");
			break;
		case "monday":
			System.out.println(a+" ==> 2 ");
			break;
		case "tuesday":
			System.out.println(a+" ==> 3 ");
			break;
		case "wednesday":
			System.out.println(a+" ==> 4 ");
			break;
		case "thursday":
			System.out.println(a+" ==> 5 ");
			break;
		case "friday":
			System.out.println(a+" ==> 6 ");
			break;
		case "saturday":
			System.out.println(a+" ==> 7 ");
			break;
		default:
			System.out.println("type full name in lower case");
		}
		scan.close();
	}

}
