class Calculator
{
	int add(int x,int y)
	{
		return x+y;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	float add(float x,float y)
	{
		return x+y;
	}
	float add(int x,float y)
	{
		return x+y;
	}
	float add(float x,int y)
	{
		return x+y;
	}
	float add(int x,int y,int z)
	{
		return x+y+z;
	}
	double add(int x,float y,double z)
	{
		return x+y+z;
	}
	double add(double x,double y,double z)
	{
		return x+y+z;
	}
	float add(int x,int y,float z)
	{
		return x+y+z;
	}
	float add(float x,float y,float z)
	{
		return x+y+z;
	}
	
}
public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator	calc=new Calculator();
	
	int a=10,b=20,c=30;
	float i=10.5f,j=20.5f,k=30.5f;
	double p=100.5,q=200.5,r=300.5;
		
	System.out.println(calc.add(p, q));
	System.out.println(calc.add(i,j));
	System.out.println(calc.add(a,i,p));
	}

}
