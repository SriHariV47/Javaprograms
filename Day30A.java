
class charger
{
	private String brand;
	private float voltage;
	public charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
	
}

class OS
{
	private String name;
	private float size;
	public OS(String name, float size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public float getSize() {
		return size;
	}
	
}

class mobile
{
	OS os=new OS("Android",512f);
	
	void hasA(charger c)
	{
		System.out.println(c.getBrand());
		//System.out.println(c.getvoltage());
	}
	
}
public class Day30A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		charger c = new charger("samsung",24.5f);
		mobile m = new mobile();
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(c);
		
		m=null;
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(c);System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		
		
	}

}
