
import java.util.Scanner;


abstract class Shape
{
	float area;
	
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea()
	{
		System.out.println(area);
	}
}

class Square extends Shape
{
	private float side;
	
	public void acceptInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the side:");
		side=scan.nextFloat();
	}
	public void calcArea()
	{
		area =side*side;
	}
	
}

class Rectangle extends Shape
{
	private float length;
	private float breadth;
	
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
	
}

class Circle extends Shape
{
	private float radius;
	
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
	
	
}

class Geometry
{
	public void permit(Shape ref)
	{
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}
public  class Day31A {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
	}
}
