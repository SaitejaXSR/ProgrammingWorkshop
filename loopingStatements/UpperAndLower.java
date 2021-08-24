package loopingStatements;

public class UpperAndLower {
	public static void main(String[] args) {
		
		char ch = 'A';
		char cha = 'a';
		for (ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println(ch+ "  "+ cha++);
		}
	}

}
