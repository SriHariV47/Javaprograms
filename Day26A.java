
class Demo1{
	void fun1()
	{
		System.out.println("Java");
	}
}
class Demo2{
	void fun2()
	{
		System.out.println("python");
	}
}
class Demo3 extends Demo1
{
	
}

public class Day26A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		Demo2 e=new Demo2();
		
		d.fun1();
		e.fun2();
		//System.out.println(d);

	}

}
