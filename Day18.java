
public class Day18 {

	public static void main(String[] args) {
		
		String s1="JAVA";
		String s2="javac";
		
		int res= s1.compareToIgnoreCase(s2);
	
		if(res==0)
		{
			System.out.println("Strings are equal");
		}
		else if(res > 0)
		{
			System.out.println("s1 == s2");
		}
		else
		{
			System.out.println("s1 = s2");
		}
	}
	

}
