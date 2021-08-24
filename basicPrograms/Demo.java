package basicPrograms;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println(10>20 && 10<20);
		System.out.println(!true || true);
		System.out.println((100.2>100) && false);
		System.out.println((54+5>60-1) || (98*0<0));
		System.out.println(50/2 > 30 && !false);
		int a = 40;
		int b = a+10;
		System.out.println(!(a<b) || b>30);
		System.out.println(!(599<=599.9) && (a>b));
		int c = a;
		b += c;
		a += c;
		System.out.println(!(c>b));
		System.out.println(a>c && c<b);
		System.out.println((100>94 && a<=b) || (a+30 > b-30));
		System.out.println((!true && a<c) && (!false && b<c));
	}

}
