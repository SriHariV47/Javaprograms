
class Tests1
{
	int x=10;
}

class Tests2 extends Tests1
{
	int x=99;
	void disp()
	{
		System.out.println(x);
	}
}

public class Day27A {

	public static void main(String[] args) {
		Tests2 t2=new Tests2();
		t2.disp();
		// TODO Auto-generated method stub

	}

}
