package demoPackage1;

public class Program7 {
	
	public Program7(double a) {
		System.out.println(a);
	}
		
	public Program7(int b) {
		
		this(7.5);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Program7 p = new Program7(7);
	}
}
