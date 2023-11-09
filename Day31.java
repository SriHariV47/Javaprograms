
import java.util.Scanner;


class Square
{
	private float side;
	private float area;
	
	public void acceptInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the side:");
		side=scan.nextInt();
	}
	public void calcArea()
	{
		area =side*side;
	}
	public void dispArea()
	{
		System.out.println(area);
	}
}

class Rectangle
{
	private float length;
	private float breadth;
	private float area;
	
	public void acceptInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length:");
		length=scan.nextInt();
		System.out.println("Enter the breadth:");
		breadth=scan.nextInt();
	}
	public void calcArea()
	{
		area =length*breadth;
	}
	public void dispArea()
	{
		System.out.println(area);
	}
}

class Circle
{
	private float radius;
	private float area;
	
	public void acceptInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the raius:");
		radius=scan.nextFloat();
		
	}
	public void calcArea()
	{
		area =3.141f*radius*radius;
	}
	public void dispArea()
	{
		System.out.println(area);
	}
	
}
public  class Day31 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		s.acceptInput();
		s.calcArea();
		s.dispArea();
		
		r.acceptInput();
		r.calcArea();
		r.dispArea();
		
		c.acceptInput();
		c.calcArea();
		c.dispArea();
		
	}
}


