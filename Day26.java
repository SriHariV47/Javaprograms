
class BankAccount
{
	 int accNum=88645;
	 int pin=4444;
}
class Hacker extends BankAccount
{
	void disp()
	{
		System.out.println(accNum);
		System.out.println(pin);

	}
	void changeData()
	{
		accNum=586553;
		pin=3669;
	}
}


public class Day26 {

	public static void main(String[] args) {
		Hacker h=new Hacker();
		h.disp();
		h.changeData();
		h.disp();
	}

}
