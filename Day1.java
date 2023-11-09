import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int [] a=new int[3];
		int i;
		for(i=0;i<3;i++) {
			System.out.println("Enter:");
			a[i]=scan.nextInt();
			
		}
		System.out.println("Enter:");
		for(i=0;i<3;i++) {
			System.out.println(a[i]);
		}
	}
}