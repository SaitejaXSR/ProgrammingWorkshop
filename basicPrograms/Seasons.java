package basicPrograms;
import java.util.Scanner;

public class Seasons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the month for season");
		String a = scan.next();
		String name = a.toLowerCase();
		switch(name) {
		case "dec":
		case "jan":
		case "feb":System.out.println("Winter season");break;
		case "mar":
		case "apr":
		case "may":System.out.println("Summer season");break;
		case "jun":
		case "jul":
		case "aug":System.out.println("Rainy season");break;
		case "sep":
		case "oct":
		case "nov":System.out.println("Spring season");break;
		default:throw new InvalidMonthException();
		}
		scan.close();
		
	}
}
