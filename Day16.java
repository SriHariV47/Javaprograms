import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int[][]a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[5];
				
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("Class"+i+" Student"+j);
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("The ages are:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
