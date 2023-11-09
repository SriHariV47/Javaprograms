

class Bank
{
	private int bal;
	
	public void setData(int x)
	{
		if(x>=0)
		{
			bal=x;
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
	public int getData()
	{
		return bal;
	}
}

public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank ba = new Bank();
		//ba. bal=1000000;
		//System.out.println(ba.bal);
		ba.setData(1000000);
		System.out.println(ba.getData());
	}

}
