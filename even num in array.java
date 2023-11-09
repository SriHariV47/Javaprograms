import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0) {
				System.out.print(ar[i]+" ");
			}
			
		

	}

}
}
