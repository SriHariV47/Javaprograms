class Customer
{
	private int cId;
	private String cName;
	private long cNum;

	
	public int getCID()
	{
		return cId;
	}
	public String getCName()
	{
		return cName;
	}
	public long getCNum()
	{
		return cNum;
	}
	
}

public class Day22 {

	public static void main(String[] args) {

		Customer c=new Customer();
		//c.cId=1;
		//c.setData(1, "Arjun", 99555481L);
		
		System.out.println(c.getCID());
		System.out.println(c.getCName());
		System.out.println(c.getCNum());
	}

}
