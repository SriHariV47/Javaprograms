import java.security.GeneralSecurityException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day35B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("conn is estd");
		
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a numerator");
			int a=scan.nextInt();
			System.out.println("enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);	
	
		System.out.println("enter the size");
		int size=scan.nextInt();
		int[] ar=new int[size];
		System.out.println("enter the element");
		int ele=scan.nextInt();
		System.out.println("enter the index");
		int index=scan.nextInt();
		ar[index]=ele;
		ar=null;
		System.out.println("ar[index]");
		
		}
		
		catch(ArithmeticException e)
		{		
			System.out.println("enter the non zero denominator");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("ener the +ve value");
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter the integer value");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter a valid index");
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
				
		System.out.println("conn is eliminated");
}
}
