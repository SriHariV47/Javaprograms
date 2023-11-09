import java.util.Scanner;

public class Day {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter:");
		int a=scan.nextInt( );
		System.err.println();
		System.out.println("Enter :");
		int b=scan.nextInt( );
		int c=a/b;
		System.out.println(c);
	}
}