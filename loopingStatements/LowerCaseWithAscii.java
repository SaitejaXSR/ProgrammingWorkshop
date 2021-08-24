package loopingStatements;

public class LowerCaseWithAscii {
	public static void main(String[] args) {
		
		for (char ch = 'a'; ch<='z'; ch++)
		{
			int a = ch;
			System.out.println("ascii value of "+ch +" : "+a);
		}
		
	}
}
