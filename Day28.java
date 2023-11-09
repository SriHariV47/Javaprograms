
class plane
{
	void takeoff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}

class Cargoplane extends plane
{
	void fly()
	{
		System.out.println("Cargo plane is flying at low height");
	}
	void carryCargo()
	{
		System.out.println("Cargo plane is carrying cargo");
	}
}

class Passengerplane extends plane
{
	void fly()
	{
		System.out.println("passenger plane flying at medium height");
	}
	void carryingpassengers()
	{
		System.out.println("passenger plane carrying passengers");
	}
}

class Fighterplane extends plane
{
	void fly()
	{
		System.out.println("Fighter plane flying at greater height");
	}
	void carryingweapons()
	{
		System.out.println("Fighter plane carrying weapons");
	}
}

public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cargoplane cp=new Cargoplane();
		Passengerplane pp=new Passengerplane();
		Fighterplane fp=new Fighterplane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		
		System.out.println();
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryingpassengers();
		
		System.out.println();
		
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryingweapons();
		
		
	}

}
