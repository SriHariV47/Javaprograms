
class Heart
{
	private float weight;
	private int bpm;
	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
	public float getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
	
}

class Brain
{
	private float weight;
	private String color;
	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	
	
}

class Bike
{
	private String brand;
	private float milage;
	public Bike(String brand, float milage) {
		super();
		this.brand = brand;
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public float getMilage() {
		return milage;
	}
	
	
}

class Book
{
	private String name;
	private String Author;
	public Book(String name, String author) {
		super();
		this.name = name;
		Author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return Author;
	}
	
}

class Student
{
	Heart h =new Heart(250.5f,72);
	Brain b= new Brain(250.5f,"grey");
	
	void hasA(Bike bi)
	{
		System.out.println(bi.getBrand());
		System.out.println(bi.getMilage());
	}
	
	void hasA(Book bo)
	{
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
	}
}





public class Day30B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bi =new Bike("ktm",25.7f);
		Book bo=new Book("java","James");
		
		Student s=new Student();
		
		System.out.println(s.h.getWeight());
		System.out.println(s.b.getColor());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		
		
		s.hasA(bi);;
		s.hasA(bo);
		
		System.out.println(s.h.getWeight());
		System.out.println(s.b.getColor());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		
	}

}
