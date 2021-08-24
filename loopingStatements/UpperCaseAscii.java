package loopingStatements;

public class UpperCaseAscii {
	public static void main(String[] args) {
		int a = 1;
		for (char ch = 'A'; ch<='Z'; ch++)
		{
			System.out.println("ascii value of "+ch +" : "+ a++);
		}
		
	}

}
