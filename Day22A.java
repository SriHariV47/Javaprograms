
class customer{
	
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

public class Day22A {

	public static void main(String[] args) {
		
		customer c=new customer();
	//	c.cId=1
		//c.setData(1,"Arun",9502249001L);
		System.out.println(c.getCID());
		System.out.println(c.getCName());
		System.out.println(c.getCNum());
		
	}

}
