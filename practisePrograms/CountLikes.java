package practisePrograms;
import java.util.Scanner;
public class CountLikes {
	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        String A = scan.next();
	        String P = scan.next();

	        System.out.println(countLikeDislike(A, P));
	        scan.close();

	    }
	    static int countLikeDislike(String A, String P){
	        char[] a = new char[A.length()];
	        char[] p = new char[P.length()];

	        for(int i = 0; i<a.length; i++){
	            a[i] = A.charAt(i);
	        }
	        for(int i = 0; i<p.length; i++){
	            p[i] = P.charAt(i);
	        }
	        int count = 0;
	        for(int i = 0; i<p.length; i++)
	            if(a[i]==p[i])
	                count++;
	        return count;    
	    }
}
