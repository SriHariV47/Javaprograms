import java.util.StringTokenizer;

public class Day20A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringTokenizer s = new StringTokenizer();
		

	
		StringTokenizer s= new StringTokenizer("JAVA PYTHON", "A");
		
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
		
		/*	System.out.println(s.hasMoreTokens());
		System.out.println(s.nextToken());
		System.out.println(s.hasMoreTokens());
		System.out.println(s.nextToken());*/
	}

}
